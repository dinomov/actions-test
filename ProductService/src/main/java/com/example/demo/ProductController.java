package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final StockFeignClient stockClient;

    ProductController(StockFeignClient stockClient) {
        this.stockClient = stockClient;
    }

    @RequestMapping("/product/{productNumber}")
    public Product getProduct(@PathVariable("productNumber") Integer productNumber)
    {
        Integer amount = stockClient.getProductAmount(productNumber);
        return new Product(productNumber, "Test product", amount);
    }
    @FeignClient("StockService")
    interface StockFeignClient {
        @RequestMapping("/stock/{productNumber}")
        public Integer getProductAmount(@PathVariable("productNumber") Integer productNumber);
    }
}
