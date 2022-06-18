package com.example.security.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/test")
    public void sample(){
      log.debug("test");
    }

}
