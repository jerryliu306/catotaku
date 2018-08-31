package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Commodityevaluation;
import top.catotaku.common.pojo.po.CommodityevaluationExample;

public interface CommodityevaluationMapper {
    int countByExample(CommodityevaluationExample example);

    int deleteByExample(CommodityevaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commodityevaluation record);

    int insertSelective(Commodityevaluation record);

    List<Commodityevaluation> selectByExample(CommodityevaluationExample example);

    Commodityevaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commodityevaluation record, @Param("example") CommodityevaluationExample example);

    int updateByExample(@Param("record") Commodityevaluation record, @Param("example") CommodityevaluationExample example);

    int updateByPrimaryKeySelective(Commodityevaluation record);

    int updateByPrimaryKey(Commodityevaluation record);
}