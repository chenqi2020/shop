package com.lg.product.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lg.common.pojo.ResponseResult;
import com.lg.product.entity.Brand;
import com.lg.product.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 前端控制器
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private IBrandService iBrandService;

    /**
     * 品牌列表页面
     * @param brand
     * @param page
     * @return
     */
    @GetMapping("list")
    public ResponseResult list(Brand brand, Page page){
        IPage<Brand> iPage=iBrandService.getList(brand,page);
        return ResponseResult.success(iPage);
    }

    /**
     * 删除品牌
     * @param brand
     * @return
     */
    @PostMapping("del")
    public ResponseResult del(@RequestBody Brand brand){
        System.err.println(brand.getId());
        boolean res=iBrandService.del(brand);
        return ResponseResult.success(res);
    }

    /**
     * 品牌添加或修改
     * @param brand
     * @return
     */
    @PostMapping("save")
    public ResponseResult save(@RequestBody Brand brand){
        boolean res=iBrandService.saveBrand(brand);
        return ResponseResult.success(res);
    }

}
