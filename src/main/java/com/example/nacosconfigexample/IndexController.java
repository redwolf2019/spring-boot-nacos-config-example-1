package com.example.nacosconfigexample;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @NacosValue(value = "${example1:this is default value}", autoRefreshed = true)
    private String example1Value;

    @GetMapping("/example/1")
    String getValue() {
        return example1Value;
    }

}
