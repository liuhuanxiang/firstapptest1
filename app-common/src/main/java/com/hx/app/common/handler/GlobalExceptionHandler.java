package com.hx.app.common.handler;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-08-06  16:21
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final String LOG_EXCEPTION_FORMAT = "Capture Exception By GlobalExceptionHandler: Code: %s Detail: %s";

    @ExceptionHandler(value= {NumberFormatException.class})
    public String numberFormatExceptionHandler(NumberFormatException ex) {
        return resultFormat(1, ex);
    }

    private <T extends Throwable> String resultFormat(Integer code, T ex) {
        ex.printStackTrace();
        log.error(String.format(LOG_EXCEPTION_FORMAT, 1, ex.getMessage()));
        return ResponseBean.failed(code, ex.getMessage());
    }
}
