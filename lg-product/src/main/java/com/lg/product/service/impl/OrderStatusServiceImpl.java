package com.lg.product.service.impl;

import com.lg.product.entity.OrderStatus;
import com.lg.product.mapper.OrderStatusMapper;
import com.lg.product.service.IOrderStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单状态表 服务实现类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@Service
public class OrderStatusServiceImpl extends ServiceImpl<OrderStatusMapper, OrderStatus> implements IOrderStatusService {

}
