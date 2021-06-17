package com.yuan.template.api.user;

import com.yuan.common.model.JsonResult;
import com.yuan.common.model.PageVO;
import com.yuan.template.api.model.User;
import com.yuan.template.api.user.request.UserCreateRequest;
import com.yuan.template.api.user.request.UserSearchRequest;
import com.yuan.template.api.user.result.UserCreateResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @className UserCreateApi
 * @autor cold
 * @DATE 2021/6/18 2:09
 **/
@FeignClient(
        value = "userApi",
        url = "${rpc.template.url}",
        fallbackFactory = com.yuan.template.api.user.UserQueryApiFallback.class
)
public interface UserCreateApi {
    @PostMapping("/private/user/create")
    JsonResult<UserCreateResult> create(UserCreateRequest request);
}
