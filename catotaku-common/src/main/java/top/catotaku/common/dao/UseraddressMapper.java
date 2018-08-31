package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Useraddress;
import top.catotaku.common.pojo.po.UseraddressExample;

public interface UseraddressMapper {
    int countByExample(UseraddressExample example);

    int deleteByExample(UseraddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Useraddress record);

    int insertSelective(Useraddress record);

    List<Useraddress> selectByExample(UseraddressExample example);

    Useraddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Useraddress record, @Param("example") UseraddressExample example);

    int updateByExample(@Param("record") Useraddress record, @Param("example") UseraddressExample example);

    int updateByPrimaryKeySelective(Useraddress record);

    int updateByPrimaryKey(Useraddress record);
}