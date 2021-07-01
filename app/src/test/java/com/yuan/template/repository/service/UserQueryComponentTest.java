package com.yuan.template.repository.service;

import com.bench.common.model.PageVO;
import com.yuan.template.api.model.User;
import com.yuan.template.api.user.enums.UserOrderByEnum;
import com.yuan.template.api.user.request.UserSearchRequest;
import com.yuan.template.service.user.UserQueryComponent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

/**
 * @className UserQueryComponentTest
 * @autor cold
 * @DATE 2021/6/18 2:30
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserQueryComponentTest {
    @Autowired
    private UserQueryComponent userQueryComponent;
    @Test
    public void search(){
        UserSearchRequest request = new UserSearchRequest();
        request.setIds(new ArrayList<>());
        request.getIds().add(1);
        request.getIds().add(2);
        request.setOrderByEnum(UserOrderByEnum.GMT_CREATE_DESC);
        PageVO<User> pageVO = userQueryComponent.search(request);
        log.info("pageVO{}",pageVO);
    }
}
