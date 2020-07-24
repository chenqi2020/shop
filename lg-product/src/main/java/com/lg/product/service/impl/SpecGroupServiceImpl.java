package com.lg.product.service.impl;

import com.lg.product.entity.SpecGroup;
import com.lg.product.mapper.SpecGroupMapper;
import com.lg.product.service.ISpecGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 规格参数的分组表，每个商品分类下有多个规格参数组 服务实现类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@Service
public class SpecGroupServiceImpl extends ServiceImpl<SpecGroupMapper, SpecGroup> implements ISpecGroupService {

}
