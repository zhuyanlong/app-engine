package com.qcl.form;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

/**
 * 编程小石头：2501902696（微信）
 */
@Data
public class OrderForm {

    /**
     * 买家姓名
     */
    @NotEmpty(message = "Name")
    private String name;

    /**
     * 买家手机号
     */
    @NotEmpty(message = "Phone")
    private String phone;

    /**
     * 买家桌号
     */
    @NotEmpty(message = "Number")
    private String address;

    /**
     * 买家微信openid
     */
    @NotEmpty(message = "openid")
    private String openid;

    /**
     * 购物车
     */
    @NotEmpty(message = "The shopping cart cannot be empty")
    private String items;
}
