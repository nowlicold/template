package com.yuan.template.api.hello;

import javax.validation.Valid;

import com.yuan.template.api.hello.request.SayHelloRequest;
import com.yuan.common.model.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author by cold
 * @date 2020/12/15
 */
@FeignClient(name = "helloApi", url = "${rpc.template.url}", fallbackFactory = HelloApiFallback.class)
public interface HelloApi {

    /**
     * 打个招呼
     *
     * @param request 打招呼请求
     * @return 回应
     */
    JsonResult<String> sayHello(@Valid @RequestBody SayHelloRequest request);
}
