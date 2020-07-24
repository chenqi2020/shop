package com.lg.product.mapper;

import com.lg.product.entity.CategoryBrand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 Mapper 接口
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
public interface CategoryBrandMapper extends BaseMapper<CategoryBrand> {

    List<CategoryBrand> getCategoryIdList(@Param("brandId") Long id);

    int deleteByBrandId(@Param("brandId") Long id);

    int save(@Param("id") Long id, @Param("categoryIds") List<Long> categoryIds);
}
