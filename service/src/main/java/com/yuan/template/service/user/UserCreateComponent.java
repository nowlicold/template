package com.yuan.template.service.user;

import com.yuan.template.api.user.request.UserCreateRequest;
import com.yuan.template.api.user.result.UserCreateResult;

/**
 * @className UserComponent
 * @autor cold
 * @DATE 2021/6/18 1:18
 * 用户创建组件
 **/
public interface UserCreateComponent {
    /**
     * 创建用户
     * @param request
     * @return
     */
    public UserCreateResult create(UserCreateRequest request);
}
