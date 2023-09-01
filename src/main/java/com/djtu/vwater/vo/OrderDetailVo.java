package com.djtu.vwater.vo;


import lombok.Data;

/**
 * @author vwater
 */
@Data
public class OrderDetailVo {
    private Long orderId;
    private String orderSn;
    private Long orderItemId;
    private String platformName;

}
