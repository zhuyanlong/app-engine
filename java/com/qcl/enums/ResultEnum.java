package com.qcl.enums;

import lombok.Getter;

/**
 * 编程小石头：2501902696（微信）
 */
@Getter
public enum ResultEnum {

    SUCCESS(0, "Success"),

    PARAM_ERROR(1, "Incorrect parameter"),

    PRODUCT_NOT_EXIST(10, "Goods don't exist"),

    PRODUCT_STOCK_ERROR(11, "The stock of goods is not correct"),

    ORDER_NOT_EXIST(12, "Order does not exist"),

    ORDERDETAIL_NOT_EXIST(13, "Order details do not exist"),

    ORDER_STATUS_ERROR(14, "Order status is incorrect"),

    ORDER_UPDATE_FAIL(15, "Order update failed"),

    ORDER_DETAIL_EMPTY(16, "Order details are empty"),

    ORDER_PAY_STATUS_ERROR(17, "Order payment status is not correct"),

    CART_EMPTY(18, "Empty shopping cart"),

    ORDER_OWNER_ERROR(19, "The order does not belong to the current user"),

    ORDER_NO_PAY(20, "The user has not paid yet. Prompt the user to pay"),

    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(21, "WeChat payment asynchronous notification amount check does not pass"),

    ORDER_CANCEL_SUCCESS(22, "Order cancelled successfully"),

    ORDER_FINISH_SUCCESS(23, "Order completed successfully"),

    PRODUCT_STATUS_ERROR(24, "Item status is incorrect"),

    LOGIN_FAIL(25, "Login failed. Login information is incorrect"),

    LOGOUT_SUCCESS(26, "Logout success"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
