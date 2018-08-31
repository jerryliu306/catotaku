package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Storecommodityclassify;
import top.catotaku.common.pojo.po.StorecommodityclassifyExample;

public interface StorecommodityclassifyMapper {
    int countByExample(StorecommodityclassifyExample example);

    int deleteByExample(StorecommodityclassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Storecommodityclassify record);

    int insertSelective(Storecommodityclassify record);

    List<Storecommodityclassify> selectByExample(StorecommodityclassifyExample example);

    Storecommodityclassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Storecommodityclassify record, @Param("example") StorecommodityclassifyExample example);

    int updateByExample(@Param("record") Storecommodityclassify record, @Param("example") StorecommodityclassifyExample example);

    int updateByPrimaryKeySelective(Storecommodityclassify record);

    int updateByPrimaryKey(Storecommodityclassify record);
}