package com.liyi.seckill.user.service;

import com.liyi.seckill.common.utils.Response;
import com.liyi.seckill.user.model.vo.LoginUserReqVO;
import com.liyi.seckill.user.model.vo.LoginUserRspVO;
import com.liyi.seckill.user.model.vo.RegisterUserReqVO;
import com.liyi.seckill.user.model.vo.SendVerifyCodeReqVO;

/**
 * @Author: liyi
 * @Date: 2026/4/10 18:09
 * @Version: v1.0.0
 * @Description: 用户业务
 **/
public interface UserService {

    /**
     * 用户注册
     * @param registerUserReqVO
     * @return
     */
    Response<?> register(RegisterUserReqVO registerUserReqVO);

    /**
     * 用户登录
     * @param loginUserReqVO
     * @return
     */
    Response<LoginUserRspVO> login(LoginUserReqVO loginUserReqVO);

    /**
     * 发送验证码
     * @param sendVerifyCodeReqVO
     * @return
     */
    Response<?> sendVerifyCode(SendVerifyCodeReqVO sendVerifyCodeReqVO);

    /**
     * 退出登录
     * @return
     */
    Response<?> logout();
}
