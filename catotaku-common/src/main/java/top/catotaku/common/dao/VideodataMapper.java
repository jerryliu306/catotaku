package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Videodata;
import top.catotaku.common.pojo.po.VideodataExample;

public interface VideodataMapper {
    int countByExample(VideodataExample example);

    int deleteByExample(VideodataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Videodata record);

    int insertSelective(Videodata record);

    List<Videodata> selectByExample(VideodataExample example);

    Videodata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Videodata record, @Param("example") VideodataExample example);

    int updateByExample(@Param("record") Videodata record, @Param("example") VideodataExample example);

    int updateByPrimaryKeySelective(Videodata record);

    int updateByPrimaryKey(Videodata record);
}