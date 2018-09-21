//package top.catotaku.detail.test;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import top.catotaku.common.pojo.po.Commodityspecification;
//import top.catotaku.detail.dao.DetailMapper;
//import top.catotaku.detail.pojo.vo.CommodityInfoVO;
//
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring/spring-dao.xml")
//public class DetailTest {
//
//    @Autowired
//    private DetailMapper mapper;
//
//    @Test
//    public void testItemCommodity(){
//
//        CommodityInfoVO commodityVO = mapper.itemCommodity(1);
//        System.out.println(commodityVO);
//        List<Commodityspecification> list = mapper.listCommodityspecification(1);
//
//        for (Commodityspecification commodityspecification : list){
//            System.out.println(commodityspecification.getName()+"----"+commodityspecification.getExplain());
//        }
//    }
//
//}
