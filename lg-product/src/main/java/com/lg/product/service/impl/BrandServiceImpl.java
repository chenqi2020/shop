package com.lg.product.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lg.product.entity.Brand;
import com.lg.product.entity.CategoryBrand;
import com.lg.product.mapper.BrandMapper;
import com.lg.product.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lg.product.service.ICategoryBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 服务实现类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Autowired
    private ICategoryBrandService iCategoryBrandService;

    @Override
    public IPage<Brand> getList(Brand brand, Page page) {
        IPage<Brand> page1 = this.getBaseMapper().getPage(brand, page);
        List<Brand> records = page1.getRecords();
        records.forEach(brand1->{
            List<CategoryBrand> list=iCategoryBrandService.getCategoryIdList(brand1.getId());
            List<Long> ids=new ArrayList<>();
            list.forEach(categoryBrand->{
                ids.add(categoryBrand.getCategoryId());
            });
            brand1.setCategoryIds(ids);
        });
        return page1;
    }

    @Override
    public boolean del(Brand brand) {
        boolean res=iCategoryBrandService.deleteByBrandId(brand.getId());
        if(res){
            int i = this.getBaseMapper().deleteById(brand.getId());
            if(i>0){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean saveBrand(Brand brand) {
        int insert = this.getBaseMapper().insert(brand);
        if(insert>0){
            int saveCategoryBrand=iCategoryBrandService.saveCategoryBrand(brand.getId(),brand.getCategoryIds());
            if(saveCategoryBrand>0){
                return true;
            }
        }
        return false;
    }
}
