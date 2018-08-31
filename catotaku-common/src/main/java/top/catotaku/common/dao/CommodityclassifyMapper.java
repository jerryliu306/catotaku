package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Commodityclassify;
import top.catotaku.common.pojo.po.CommodityclassifyExample;

public interface CommodityclassifyMapper {
    int countByExample(CommodityclassifyExample example);

    int deleteByExample(CommodityclassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commodityclassify record);

    int insertSelective(Commodityclassify record);

    List<Commodityclassify> selectByExample(CommodityclassifyExample example);

    Commodityclassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commodityclassify record, @Param("example") CommodityclassifyExample example);

    int updateByExample(@Param("record") Commodityclassify record, @Param("example") CommodityclassifyExample example);

    int updateByPrimaryKeySelective(Commodityclassify record);

    int updateByPrimaryKey(Commodityclassify record);
}