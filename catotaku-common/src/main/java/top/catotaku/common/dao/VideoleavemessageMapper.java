package top.catotaku.common.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.catotaku.common.pojo.po.Videoleavemessage;
import top.catotaku.common.pojo.po.VideoleavemessageExample;

public interface VideoleavemessageMapper {
    int countByExample(VideoleavemessageExample example);

    int deleteByExample(VideoleavemessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Videoleavemessage record);

    int insertSelective(Videoleavemessage record);

    List<Videoleavemessage> selectByExample(VideoleavemessageExample example);

    Videoleavemessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Videoleavemessage record, @Param("example") VideoleavemessageExample example);

    int updateByExample(@Param("record") Videoleavemessage record, @Param("example") VideoleavemessageExample example);

    int updateByPrimaryKeySelective(Videoleavemessage record);

    int updateByPrimaryKey(Videoleavemessage record);
}