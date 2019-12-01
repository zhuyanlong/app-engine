package com.qcl.form;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

/**
 * 编程小石头：2501902696（微信）
 */
@Data
public class UserForm {


    /**
     * 买家姓名
     */
    @NotEmpty(message = "Name")
    private String username;

    /**
     * 买家手机号
     */
    @NotEmpty(message = "Phone")
    private String phone;


    /**
     * 买家微信openid
     */
    @NotEmpty(message = "openid")
    private String openid;

    private String zhuohao;
    private String renshu;
}
