package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Keywordpromote;
import top.catotaku.common.pojo.po.KeywordpromoteExample;

public interface KeywordpromoteMapper {
    int countByExample(KeywordpromoteExample example);

    int deleteByExample(KeywordpromoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Keywordpromote record);

    int insertSelective(Keywordpromote record);

    List<Keywordpromote> selectByExample(KeywordpromoteExample example);

    Keywordpromote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Keywordpromote record, @Param("example") KeywordpromoteExample example);

    int updateByExample(@Param("record") Keywordpromote record, @Param("example") KeywordpromoteExample example);

    int updateByPrimaryKeySelective(Keywordpromote record);

    int updateByPrimaryKey(Keywordpromote record);
}