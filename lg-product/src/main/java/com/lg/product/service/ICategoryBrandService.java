package com.lg.product.service;

import com.lg.product.entity.CategoryBrand;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 服务类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
public interface ICategoryBrandService extends IService<CategoryBrand> {

    List<CategoryBrand> getCategoryIdList(Long id);

    boolean deleteByBrandId(Long id);

    int saveCategoryBrand(Long id, List<Long> categoryIds);
}
