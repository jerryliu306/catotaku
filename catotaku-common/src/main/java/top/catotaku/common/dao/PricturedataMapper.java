package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Pricturedata;
import top.catotaku.common.pojo.po.PricturedataExample;

public interface PricturedataMapper {
    int countByExample(PricturedataExample example);

    int deleteByExample(PricturedataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pricturedata record);

    int insertSelective(Pricturedata record);

    List<Pricturedata> selectByExample(PricturedataExample example);

    Pricturedata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pricturedata record, @Param("example") PricturedataExample example);

    int updateByExample(@Param("record") Pricturedata record, @Param("example") PricturedataExample example);

    int updateByPrimaryKeySelective(Pricturedata record);

    int updateByPrimaryKey(Pricturedata record);
}