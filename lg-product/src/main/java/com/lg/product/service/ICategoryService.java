package com.lg.product.service;

import com.lg.product.common.CategoryVo;
import com.lg.product.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
public interface ICategoryService extends IService<Category> {

    List<CategoryVo> getAllCategory();
}
