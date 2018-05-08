package com.banketree;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


/*
*
* 1.  @RestController注解表明这个类是Controller类
2. @RequestMapping注解保证HTTP请求/greeting时能够被映射到greeting方法，可以指明访问方式：@RequestMapping(method=GET)/@RequestMapping(method=PUT)等
3.  @RequestParam绑定请求的参数，可设置默认值。即访问时URL若没有带参数，则参数值为默认值
*
* */

@RestController
public class TestController {

    private static final String template = "Helle, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping
    public Result test(@RequestParam(value="token", defaultValue="") String token){
        Result result = new Result();
        result.setId(1);
        result.setCode("202");
        result.setMessage(token);
        return result;
    }
}
