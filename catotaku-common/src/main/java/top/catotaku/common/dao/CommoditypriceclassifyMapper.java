package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Commoditypriceclassify;
import top.catotaku.common.pojo.po.CommoditypriceclassifyExample;

public interface CommoditypriceclassifyMapper {
    int countByExample(CommoditypriceclassifyExample example);

    int deleteByExample(CommoditypriceclassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commoditypriceclassify record);

    int insertSelective(Commoditypriceclassify record);

    List<Commoditypriceclassify> selectByExample(CommoditypriceclassifyExample example);

    Commoditypriceclassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commoditypriceclassify record, @Param("example") CommoditypriceclassifyExample example);

    int updateByExample(@Param("record") Commoditypriceclassify record, @Param("example") CommoditypriceclassifyExample example);

    int updateByPrimaryKeySelective(Commoditypriceclassify record);

    int updateByPrimaryKey(Commoditypriceclassify record);
}