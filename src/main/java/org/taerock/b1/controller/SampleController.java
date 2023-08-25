package org.taerock.b1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/doA")
    public String[] doA(){
        return new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"};
    }

}
