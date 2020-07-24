package com.lg.product.mapper;

import com.lg.product.common.CategoryVo;
import com.lg.product.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 Mapper 接口
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
public interface CategoryMapper extends BaseMapper<Category> {

    List<CategoryVo> getAll();
}
