package top.catotaku.home.interfaces;

import top.catotaku.common.pojo.po.Pricturedata;

import java.util.List;

public interface HomeService {

    List<Pricturedata> listPrictureDataByUID(Integer uid);

}
