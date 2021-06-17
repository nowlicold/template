package com.yuan.template.http.controller.api.user;

import javax.validation.Valid;

import com.yuan.template.api.model.User;
import com.yuan.template.api.user.UserQueryApi;
import com.yuan.template.api.user.request.UserSearchRequest;
import com.yuan.template.service.user.UserQueryComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yuan.common.model.JsonResult;
import com.yuan.common.model.PageVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @className UserQueryController
 * @autor cold
 * @DATE 2021/5/24 10:51
 **/
@RestController
@Api(value = "用户查询", tags = "用户查询")
@Slf4j
public class UserQueryController implements UserQueryApi {
    @Autowired
    private UserQueryComponent userQueryComponent;

    @ApiOperation(value = "用户查询")
    @Override
    public JsonResult<PageVO<User>> search(@RequestBody @Valid UserSearchRequest request) {
       return JsonResult.success(userQueryComponent.search(request));
    }
}
