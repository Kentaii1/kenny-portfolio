package com.ks.ksPortfolioApi.entity.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/getValue")
    public String getValue() {
        List<Test> test = testService.findAll();
        if (!test.isEmpty()) {
            return test.get(0).getValue();
        } else {
            return "No test values found.";
        }
    }
}
