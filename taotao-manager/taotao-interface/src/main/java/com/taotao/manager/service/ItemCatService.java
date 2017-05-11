package com.taotao.manager.service;

import com.taotao.manager.pojo.ItemCat;

import java.util.List;

/**
 * Created by BenJobs on 2017/5/11.
 */
public interface ItemCatService {
    /**
     * 分页查询
     * @param start 从那一条开始查
     * @param rows 每页显示多少条
     * @return
     */
    List<ItemCat> queryItemCatByPage(Integer start,Integer rows);
}
