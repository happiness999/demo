package com.taotao.manager.controller;

import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by BenJobs on 2017/5/11.
 */
@Controller
@RequestMapping("itemcat")
public class ItemCatController {
    @Resource
    private ItemCatService itemCatService;

    /**
     * 分页查询
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "{page}",method = RequestMethod.GET)
    @ResponseBody
    public List<ItemCat> queryItemCatByPage(@PathVariable("page")Integer page,
                                            @RequestParam("row")Integer rows){
        List<ItemCat> itemCats = this.itemCatService.queryItemCatByPage(page, rows);
        return itemCats;
    }
}
