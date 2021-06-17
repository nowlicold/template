package com.yuan.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author by cold
 * @date 2020/12/13
 */
@Slf4j
/*
@EnableFeignClients(basePackages = {
        "com.jxmc.account.api.*",
        "com.jxmc.horn.api.*",
        "com.jxmc.member.api.*",
        "com.jxmc.erpcore.api.*"
})
*/
@SpringBootApplication(scanBasePackages = {
        "com.yuan",
        "com.bench"
})
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
        log.info("templateApplication start success!");
        System.out.println("templateApplication start success!");
        System.out.println("http://localhost:11001/swagger-ui.html");
    }
}
