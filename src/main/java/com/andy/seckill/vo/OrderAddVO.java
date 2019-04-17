package com.andy.seckill.vo;

import java.io.Serializable;

/**
 * <p>
 *
 * @author Leone
 * @since 2018-11-05
 **/
public class OrderAddVO implements Serializable {

    private static final long serialVersionUID = 3102597870187953329L;

    private Long userId;

    private Long goodsId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

}
