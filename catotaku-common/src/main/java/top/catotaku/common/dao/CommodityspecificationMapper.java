package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Commodityspecification;
import top.catotaku.common.pojo.po.CommodityspecificationExample;

public interface CommodityspecificationMapper {
    int countByExample(CommodityspecificationExample example);

    int deleteByExample(CommodityspecificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commodityspecification record);

    int insertSelective(Commodityspecification record);

    List<Commodityspecification> selectByExample(CommodityspecificationExample example);

    Commodityspecification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commodityspecification record, @Param("example") CommodityspecificationExample example);

    int updateByExample(@Param("record") Commodityspecification record, @Param("example") CommodityspecificationExample example);

    int updateByPrimaryKeySelective(Commodityspecification record);

    int updateByPrimaryKey(Commodityspecification record);
}