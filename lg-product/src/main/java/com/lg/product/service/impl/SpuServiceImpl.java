package com.lg.product.service.impl;

import com.lg.product.entity.Spu;
import com.lg.product.mapper.SpuMapper;
import com.lg.product.service.ISpuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8 服务实现类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@Service
public class SpuServiceImpl extends ServiceImpl<SpuMapper, Spu> implements ISpuService {

}
