package com.hx.app.common.handler;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-08-06  16:22
 */
@Data
public class ResponseBean {
    private int code;
    private String msg;
    private Map<String, Object> data;

    public ResponseBean() {
    }

    public ResponseBean(int code, String msg, Map<String, Object> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static String sucess(){
        return sucess(new HashMap<>(0));
    }

    public static String sucess(Map<String, Object> data){
        return JSON.toJSONString(new ResponseBean(0, "解析成功", data));
    }

    public static String failed(){
        return failed("解析失败");
    }

    public static String failed(String msg){
        return failed(-1, msg);
    }

    public static String failed(int code, String msg){
        return JSON.toJSONString(new ResponseBean(-1, msg, new HashMap<>(0)));
    }

}