package com.mmall.service;

import com.mmall.commom.ServerResponse;

public interface IOrderService {

    ServerResponse pay(Long orderNo, Integer userId, String path);
}
