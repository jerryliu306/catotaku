package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Videoinfo;
import top.catotaku.common.pojo.po.VideoinfoExample;

public interface VideoinfoMapper {
    int countByExample(VideoinfoExample example);

    int deleteByExample(VideoinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Videoinfo record);

    int insertSelective(Videoinfo record);

    List<Videoinfo> selectByExample(VideoinfoExample example);

    Videoinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Videoinfo record, @Param("example") VideoinfoExample example);

    int updateByExample(@Param("record") Videoinfo record, @Param("example") VideoinfoExample example);

    int updateByPrimaryKeySelective(Videoinfo record);

    int updateByPrimaryKey(Videoinfo record);
}