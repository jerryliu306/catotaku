package top.catotaku.search.dao;

import org.apache.ibatis.annotations.Param;
import top.catotaku.search.pojo.dto.PageInfo;
import top.catotaku.search.pojo.vo.CommodityVO;

import java.util.List;

public interface SearchMapper {
    List<CommodityVO> listCommodityByPageInfo(@Param("pageInfo") PageInfo pageInfo, @Param("name") String name);
    int countCommodityByPageInfo(@Param("pageInfo") PageInfo pageInfo,@Param("name") String name);
    List<CommodityVO> listCommodityByStatus();
    CommodityVO itemById(int id);

}
