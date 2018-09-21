//package top.catotaku.common.test;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.junit.Test;
//
//import javax.jms.*;
//
//public class MqTest {
//
//    @Test
//    public void testActiviteMQPro(){
//        //创建ConnectionFactory对象
//        //borkerURL服务器的IP和端口号
//        ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://121.43.168.127:61616");
//        try {
//            //创建Connection对象
//            Connection connection = factory.createConnection();
//            //开启连接
//            connection.start();
//            //使用连接对象创建会话
//            //第一个参数:是否开启事务,true为开启,第二个参数忽略
//            //第二个参数:当第一个参数为false时才有意义.消息应答模式1.自动应答,2.手动应答,一般为自动应答
//            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//            //使用会话对象创建Destination对象(topic,queue),这里创建一个queue对象
//            Queue queue = session.createQueue("test-queue");
//            //使用会话对象创建生产者对象
//            MessageProducer producer = session.createProducer(queue);
//            //创建TextMessage对象
//            TextMessage textMessage = session.createTextMessage("hello activemq");
//            //使用producer发送消息
//            producer.send(textMessage);
//            producer.close();
//            session.close();
//            connection.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//
//        }
//
//    }
//
//    @Test
//    public void testActiveMQSub(){
//        ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://121.43.168.127:61616");
//        try {
//            Connection connection = factory.createConnection();
//            connection.start();
//            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//            Queue queue = session.createQueue("test-queue");
//            MessageConsumer consumer = session.createConsumer(queue);
//            consumer.setMessageListener(new MessageListener() {
//                @Override
//                public void onMessage(Message message) {
//                    TextMessage textMessage = (TextMessage) message;
//                    try {
//                        String str = textMessage.getText();
//                        System.out.println(str);
//                    } catch (JMSException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        System.in.read();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//}
