package top.catotaku.detail.interfaces;

import top.catotaku.detail.pojo.vo.CommodityInfoVO;

/**
 * 商品详情服务
 */
public interface DetailService {

    /**
     * 查询单个商品的信息
     * @param id 依照商品的id进行查询
     * @return 返回一个视图数据对象
     */
    CommodityInfoVO itemCommodity(Integer id);

    CommodityInfoVO itemCommodityURL(String page);
}
