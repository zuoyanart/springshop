package com.company.project.service.impl;

import com.company.project.common.StringBase;
import com.company.project.dao.UserMapper;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import com.company.project.common.Secrtity;

/**
 * Created by CodeGenerator on 2018/02/08.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;


    /**
     * 保存要设置盐，并且password要加密
     * @param model
     */
    @Override
    public void save(User model) {
        String password = model.getPassword();
        if (password != "") {
            String salt = StringBase.getRandom(10);
            model.setPassword(Secrtity.MD5(password + salt));
            model.setSalt(salt);
        }

        super.save(model);
    }


    /**
     * 如果更新密码要重设盐
     * @param model
     */
    @Override
    public void update(User model) {
        String password = model.getPassword();
        if (password != "") {
            String salt = StringBase.getRandom(10);
            model.setPassword(Secrtity.MD5(password + salt));
            model.setSalt(salt);
        }
        super.update(model);
    }
}
