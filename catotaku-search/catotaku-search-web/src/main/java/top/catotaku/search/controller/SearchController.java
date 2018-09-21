package top.catotaku.search.controller;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import top.catotaku.search.interfaces.SearchIndexService;
import top.catotaku.search.interfaces.SearchService;
import top.catotaku.search.pojo.dto.PageInfo;
import top.catotaku.search.pojo.vo.CommodityVO;

import java.io.IOException;
import java.util.List;

/**
 * 查询模块的转发类
 */
@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @Autowired
    private SearchIndexService searchIndexService;


    @RequestMapping("/{page}")
    public String toSearch(@PathVariable String page){
        return page;
    }
    /**
     * 按照关键字查询
     * @param mv 封装的对象
     * @param pageInfo 页面传来的参数关键字
     * @return 视图
     */
    @RequestMapping("/searchName")
    public ModelAndView searchName(ModelAndView mv, PageInfo pageInfo){

        List<CommodityVO> list = searchService.listShopByName(pageInfo);
        mv.setViewName("search");
        mv.addObject("list", list);
        mv.addObject("pageInfo", pageInfo);
        return mv;
    }

    @RequestMapping("/searchIndex")
    public ModelAndView searchIndexByName(ModelAndView mv, PageInfo pageInfo){

        List<CommodityVO> list = searchIndexService.searchIndex(pageInfo);
        mv.setViewName("search");
        mv.addObject("list", list);
        mv.addObject("pageInfo", pageInfo);
        return mv;
    }

    @RequestMapping("/uploading")
    public ModelAndView uploading(ModelAndView mv, MultipartFile file){
        String filepath = searchService.upload(file);
        mv.addObject("filepath", filepath);
        mv.setViewName("upload");
        return mv;
    }
    @ResponseBody
    @RequestMapping("/uploadindex")
    public String uploadindex(){
        String message = "failed";
        try {
            searchIndexService.uploadIndex();
            message = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }

}
