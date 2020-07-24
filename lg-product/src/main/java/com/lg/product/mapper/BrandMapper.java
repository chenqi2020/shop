package com.lg.product.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lg.product.entity.Brand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 Mapper 接口
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
public interface BrandMapper extends BaseMapper<Brand> {

    IPage<Brand> getPage(Brand brand, Page page);
}
