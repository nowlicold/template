package com.yuan.template.http.controller.api.user;

import javax.validation.Valid;

import com.yuan.template.api.user.UserCreateApi;
import com.yuan.template.api.user.request.UserCreateRequest;
import com.yuan.template.api.user.result.UserCreateResult;
import com.yuan.template.service.user.UserCreateComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yuan.common.model.JsonResult;
import com.yuan.common.model.PageVO;
import com.yuan.template.api.model.User;
import com.yuan.template.api.user.UserQueryApi;
import com.yuan.template.api.user.request.UserSearchRequest;
import com.yuan.template.service.user.UserQueryComponent;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @className UserCreateController
 * @autor cold
 * @DATE 2021/5/24 10:51
 **/
@RestController
@Api(value = "用户创建", tags = "用户创建")
@Slf4j
public class UserCreateController implements UserCreateApi {
    @Autowired
    private UserCreateComponent userCreateComponent;

    @ApiOperation(value = "用户创建")
    @Override
    public JsonResult<UserCreateResult> create(@RequestBody @Valid UserCreateRequest request) {
       return JsonResult.success(userCreateComponent.create(request));
    }
}
