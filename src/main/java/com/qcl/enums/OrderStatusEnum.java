package com.qcl.enums;

import lombok.Getter;

/**
 * 编程小石头：2501902696（微信）
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "Not Paid"),
    NEW_PAYED(1, "Paid"),
    CANCEL(2, "Canceled"),
    FINISHED(3, "Not Evaluate"),
    COMMENT(4, "Evaluated"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
