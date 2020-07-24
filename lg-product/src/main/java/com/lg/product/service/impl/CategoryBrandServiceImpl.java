package com.lg.product.service.impl;

import com.lg.product.entity.CategoryBrand;
import com.lg.product.mapper.CategoryBrandMapper;
import com.lg.product.service.ICategoryBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 服务实现类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@Service
public class CategoryBrandServiceImpl extends ServiceImpl<CategoryBrandMapper, CategoryBrand> implements ICategoryBrandService {

    @Override
    public List<CategoryBrand> getCategoryIdList(Long id) {
        return this.getBaseMapper().getCategoryIdList(id);
    }

    @Override
    public boolean deleteByBrandId(Long id) {
        return this.getBaseMapper().deleteByBrandId(id)>0;
    }

    @Override
    public int saveCategoryBrand(Long id, List<Long> categoryIds) {
        return this.getBaseMapper().save(id,categoryIds);
    }
}
