package top.catotaku.detail.dao;

import top.catotaku.common.pojo.po.Commodityspecification;
import top.catotaku.detail.pojo.vo.CommodityInfoVO;

import java.util.List;

/**
 *  查询商品信息的接口
 * @author catoutaku
 */
public interface DetailMapper {


    CommodityInfoVO itemCommodity(Integer id);

    List<Commodityspecification> listCommodityspecification(Integer id);
}
