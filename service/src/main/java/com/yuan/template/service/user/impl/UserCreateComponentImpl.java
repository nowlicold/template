package com.yuan.template.service.user.impl;
import com.template.common.enums.TemplateErrorEnum;
import com.yuan.template.api.user.request.UserCreateRequest;
import com.yuan.template.api.user.result.UserCreateResult;
import com.yuan.template.repository.entity.UserDO;
import com.yuan.template.repository.mapper.UserMapper;
import com.yuan.template.service.user.UserCreateComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 @className UserCreateComponentImpl
 @autor cold
 @DATE 2021/6/18 1:50
 **/
@Service
@Slf4j
public class UserCreateComponentImpl implements UserCreateComponent {
    @Resource
    private UserMapper userMapper;
    @Override
    public UserCreateResult create(UserCreateRequest request) {
        UserCreateResult result = new UserCreateResult();
        //默认是成功的
        result.setSuccess(true);

        UserDO userDO = new UserDO();
        userDO.setName(request.getName());
        int resultCount = userMapper.insert(userDO);
        if(resultCount <= 0){
            result.setSuccess(false);
            result.setErrorCode(TemplateErrorEnum.UNKNOWN.errorCode());
            return result;
        }
        result.setId(userDO.getId());
        return result;
    }
}
