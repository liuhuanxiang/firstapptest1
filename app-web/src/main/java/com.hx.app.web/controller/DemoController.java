package com.hx.app.web.controller;

import com.hx.app.common.handler.ResponseBean;
import com.hx.app.service.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-07-30  14:27
 */
@Slf4j
@RestController
@EnableAutoConfiguration
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/test")
    public Object test(int number) {
        log.info("number【{}】",number);
        if (number == 1) {
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        ResponseBean rb = new ResponseBean();
        rb.setMsg("response success");
        //从service层获取到数据
        return rb;
    }

    @GetMapping("/test1")
    public Object test1() {
        ResponseBean rb = new ResponseBean();
        demoService.test1();
        return rb;
    }

}
