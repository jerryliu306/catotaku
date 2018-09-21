package top.catotaku.common.queueTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MQ<E> {

    private BlockingQueue<String> queue = new ArrayBlockingQueue<>(10000);

    private Object[] items;

    private int itemSize;

    private int putIndex;

    private int takeIndex;

    private Condition notFull;

    private Condition notEmpty;

    public MQ(int initSize){

        items = new Object[initSize];
        itemSize = initSize;
        putIndex = 0;
        takeIndex = 0;
        ReentrantLock lock = new ReentrantLock();
        notFull = lock.newCondition();
        notEmpty = lock.newCondition();


    }

    public void enqueue(E e){

        final Object[] items = this.items;
        items[putIndex] = e;
        if (++putIndex == items.length) {
            putIndex = 0;
        }
        itemSize++;
        notEmpty.signal();
    }

    public E dequeue(){

        final Object[] items = this.items;
        E e = (E) items[takeIndex];
        items[takeIndex] = null;
        if (++takeIndex == items.length) {
            takeIndex = 0;
        }
        this.itemSize--;
        notFull.signal();
        return e;
    }

    public void put(E e) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            if (itemSize==items.length){
                notFull.await();
            }
            this.enqueue(e);
        }finally {
            lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            if (itemSize==0){
                notEmpty.await();
            }
            E e = this.dequeue();
            return e;
        }finally {
            lock.unlock();
        }
    }

}
