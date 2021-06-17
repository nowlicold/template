package com.yuan.template.service.user;

import com.yuan.common.model.PageVO;
import com.yuan.template.api.model.User;
import com.yuan.template.api.user.request.UserSearchRequest;
import com.yuan.template.repository.entity.UserDO;

/**
 * @className UserQueryComponent
 * @autor cold
 * @DATE 2021/6/18 1:55
 **/
public interface UserQueryComponent {
    public PageVO<User> search(UserSearchRequest request);
}
