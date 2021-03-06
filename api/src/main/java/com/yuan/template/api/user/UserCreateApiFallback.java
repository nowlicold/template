package com.yuan.template.api.user;

import com.yuan.template.api.user.request.UserCreateRequest;
import com.yuan.template.api.user.result.UserCreateResult;
import org.springframework.stereotype.Component;

import com.bench.common.model.JsonResult;
import com.bench.common.model.PageVO;
import com.yuan.template.api.model.User;
import com.yuan.template.api.user.request.UserSearchRequest;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @className UserCreateApiFallback
 * @autor cold
 * @DATE 2021/5/9 15:21
 **/
@Component
@Slf4j
public class UserCreateApiFallback implements FallbackFactory<UserCreateApi> {
    @Override
    public UserCreateApi create(Throwable cause) {

        return new UserCreateApi() {
            @Override
            public JsonResult<UserCreateResult> create(UserCreateRequest request) {
                log.error("rpcError,method:create,request:{}", request);
                return JsonResult.rpcError("调用Create接口异常");
            }
        };
    }
}
