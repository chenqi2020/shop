package com.lg.product.service.impl;

import com.lg.product.entity.Stock;
import com.lg.product.mapper.StockMapper;
import com.lg.product.service.IStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存表，代表库存，秒杀库存等信息 服务实现类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements IStockService {

}
