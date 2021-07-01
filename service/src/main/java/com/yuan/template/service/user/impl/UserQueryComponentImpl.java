package com.yuan.template.service.user.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bench.common.model.PageVO;
import com.yuan.template.api.model.User;
import com.yuan.template.api.user.request.UserSearchRequest;
import com.yuan.template.repository.entity.UserDO;
import com.yuan.template.repository.mapper.UserMapper;
import com.yuan.template.service.user.UserConvert;
import com.yuan.template.service.user.UserQueryComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className UserQueryComponentImpl
 * @autor cold
 * @DATE 2021/6/18 1:57
 **/
@Service
@Slf4j
public class UserQueryComponentImpl implements UserQueryComponent {
    @Resource
    private UserMapper userMapper;
    @Override
    public PageVO<User> search(UserSearchRequest request) {
        Page<UserDO> page = new Page<>(request.getCurrent(), request.getSize());
        List<UserDO> userDOList = userMapper.search(request.getId(),request.getName(),request.getIds(),request.getOrderByEnum() != null ?request.getOrderByEnum().dbValue() :"",page);
        page.setRecords(userDOList);
        PageVO<User> pageVO = UserConvert.convertPage(page);
        return pageVO;
    }
}
