package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Videoclassify;
import top.catotaku.common.pojo.po.VideoclassifyExample;

public interface VideoclassifyMapper {
    int countByExample(VideoclassifyExample example);

    int deleteByExample(VideoclassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Videoclassify record);

    int insertSelective(Videoclassify record);

    List<Videoclassify> selectByExample(VideoclassifyExample example);

    Videoclassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Videoclassify record, @Param("example") VideoclassifyExample example);

    int updateByExample(@Param("record") Videoclassify record, @Param("example") VideoclassifyExample example);

    int updateByPrimaryKeySelective(Videoclassify record);

    int updateByPrimaryKey(Videoclassify record);
}