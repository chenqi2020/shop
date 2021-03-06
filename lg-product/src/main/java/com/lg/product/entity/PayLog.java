package com.lg.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_pay_log")
public class PayLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    private Long orderId;

    /**
     * 支付金额（分）
     */
    private Long totalFee;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 微信交易号码
     */
    private String transactionId;

    /**
     * 交易状态，1 未支付, 2已支付, 3 已退款, 4 支付错误, 5 已关闭
     */
    private Boolean status;

    /**
     * 支付方式，1 微信支付, 2 货到付款
     */
    private Boolean payType;

    /**
     * 银行类型
     */
    private String bankType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 关闭时间
     */
    private LocalDateTime closedTime;

    /**
     * 退款时间
     */
    private LocalDateTime refundTime;


}
