package com.hx.app.service.service.impl;

import com.hx.app.service.service.DemoService;
import com.hx.dao.dal.UserRepository;
import com.hx.dao.mapper.NewuserMapper;
import com.hx.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-07-30  15:15
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private NewuserMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public String test() {
        return userMapper.selectByPrimaryKey(1).toString();
    }

    @Override
    @Transactional()
    public void test1() {
        User user = new User();
        user.setAge(18L);
        user.setName("赵");
        user.setSex("男");
        userRepository.save(user);
        userRepository.save(user);
    }
}
