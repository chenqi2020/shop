package com.lg.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lg.product.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 服务类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
public interface IBrandService extends IService<Brand> {

    IPage<Brand> getList(Brand brand, Page page);

    boolean del(Brand brand);

    boolean saveBrand(Brand brand);
}
