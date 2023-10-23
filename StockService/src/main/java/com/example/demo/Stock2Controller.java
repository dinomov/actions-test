package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("instance2")
public class Stock2Controller {
    @RequestMapping("/stock/{productNumber}")
    public Integer getProductAmount(@PathVariable("productNumber") Integer productNumber)
    {
        return 20;
    }
}
