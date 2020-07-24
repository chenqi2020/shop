package com.lg.product.controller;


import com.lg.common.pojo.ResponseResult;
import com.lg.product.common.CategoryVo;
import com.lg.product.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 前端控制器
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("getAllCategory")
    public ResponseResult getAllCategory(){
        List<CategoryVo> getAll=iCategoryService.getAllCategory();
        return ResponseResult.success(getAll);
    }

}
