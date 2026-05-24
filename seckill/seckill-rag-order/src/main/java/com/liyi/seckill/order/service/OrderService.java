package com.liyi.seckill.order.service;

import com.liyi.seckill.common.utils.Response;
import com.liyi.seckill.order.model.vo.DoSeckillReqVO;
import com.liyi.seckill.order.model.vo.DoSeckillRspVO;

/**
 * @Author: liyi
 * @Date: 2026/5/8 18:33
 * @Version: v1.0.0
 * @Description: 订单模块业务
 **/
public interface OrderService {

    /**
     * 秒杀下单
     *
     * @param reqVO
     * @return
     */
    Response<DoSeckillRspVO> doSeckill(DoSeckillReqVO reqVO);
}
