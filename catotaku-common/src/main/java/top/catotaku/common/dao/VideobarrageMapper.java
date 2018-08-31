package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Videobarrage;
import top.catotaku.common.pojo.po.VideobarrageExample;

public interface VideobarrageMapper {
    int countByExample(VideobarrageExample example);

    int deleteByExample(VideobarrageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Videobarrage record);

    int insertSelective(Videobarrage record);

    List<Videobarrage> selectByExample(VideobarrageExample example);

    Videobarrage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Videobarrage record, @Param("example") VideobarrageExample example);

    int updateByExample(@Param("record") Videobarrage record, @Param("example") VideobarrageExample example);

    int updateByPrimaryKeySelective(Videobarrage record);

    int updateByPrimaryKey(Videobarrage record);
}