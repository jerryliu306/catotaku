package top.catotaku.search.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.catotaku.common.core.PropKit;
import top.catotaku.common.fdfs.FastDFSFile;
import top.catotaku.common.fdfs.FastDFSUtils;
import top.catotaku.common.jedis.JedisClient;
import top.catotaku.search.dao.SearchMapper;
import top.catotaku.search.interfaces.SearchService;
import top.catotaku.search.pojo.dto.PageInfo;
import top.catotaku.search.pojo.vo.CommodityVO;

import java.util.List;

/**
 * @author kuroha
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchMapper searchMapper;

    @Autowired
    private JedisClient jedis;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<CommodityVO> listShopByName(PageInfo pageInfo) {
        StringBuilder sb = new StringBuilder();
        String keyword = pageInfo.getKeyword();
        if (keyword != null && !"".equals(keyword)){
            String[] strs = keyword.split(" ");
            sb.append("%");
            for (String str : strs) {
                if (StringUtils.isNotBlank(str)){
                    sb.append(str + "%");
                }
            }

        }else{
            sb.append("%");
        }
        String searchKeyword = sb.toString();

        //try {
        //    pageInfo.setItemCount(Integer.parseInt(jedis.hget(keyword,"keyword")));
        //    pageInfo.findPage();
        //    List<CommodityVO> commodities = JSONObject.parseArray(jedis.hget(keyword,Integer.toString(pageInfo.getPageNum())), CommodityVO.class);
        //    return commodities;
        //}catch (Exception e){
        //    logger.error(e.getMessage(), e);
        //}
        pageInfo.setItemCount(searchMapper.countCommodityByPageInfo(pageInfo,searchKeyword));
        pageInfo.findPage();
        List<CommodityVO> commodities = searchMapper.listCommodityByPageInfo(pageInfo,searchKeyword);
        //try {
        //    Map<String,String> map = new HashMap<>();
        //    map.put("keyword", keyword);
        //    map.put(Integer.toString(pageInfo.getPageNum()), JSONArray.toJSONString(commodities));
        //    jedis.hmset(keyword,map);
        //}catch (Exception e){
        //    logger.error(e.getMessage(), e);
        //}
        return commodities;
    }

    @Override
    public String upload(MultipartFile file) {
        try {
            FastDFSFile fastDFSFile = new FastDFSFile(file.getBytes(),file.getOriginalFilename(),file.getSize());
            StringBuilder sb = new StringBuilder();
            String filepath = FastDFSUtils.uploadFile(fastDFSFile);
            String path = PropKit.use("fdfs_client.conf").get("fdfs_server");
            sb.append(path);
            sb.append("/");
            sb.append(filepath);
            return sb.toString();
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }
        return "";
    }

}
