package com.qcl.enums;

import lombok.Getter;

/**
 * 商品状态
 * 编程小石头：2501902696（微信）
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "Have"),
    DOWN(1, "Sold Out")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
