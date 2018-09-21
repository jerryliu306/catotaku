package top.catotaku.search.interfaces;

import org.springframework.web.multipart.MultipartFile;
import top.catotaku.search.pojo.dto.PageInfo;
import top.catotaku.search.pojo.vo.CommodityVO;

import java.util.List;

/**
 * 查询模块的服务
 * @author kuroha
 */
public interface SearchService {
    /**
     * 根据关键字尽心查询
     * @param pageInfo 关键字
     * @return 依据关键字查询商品的集合
     */
    List<CommodityVO> listShopByName(PageInfo pageInfo);

    String upload(MultipartFile file);
}
