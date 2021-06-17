package com.yuan.template.api.user;

import com.yuan.common.model.JsonResult;
import com.yuan.common.model.PageVO;
import com.yuan.template.api.model.User;
import com.yuan.template.api.user.request.UserSearchRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 */
@FeignClient(
        value = "userApi",
        url = "${rpc.template.url}",
        fallbackFactory = com.yuan.template.api.user.UserQueryApiFallback.class
)
public interface UserQueryApi {
    @PostMapping("/private/user/search")
    JsonResult<PageVO<User>> search(UserSearchRequest request);
}
