package com.z.springboot_mybatisplus.service;

import com.z.springboot_mybatisplus.pojo.Provider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProviderServiceTest {
    @Autowired
    ProviderService providerService;
    @Test
    void selectById(){
        Provider provider = providerService.selectProviderById(2);
        System.out.println(provider);
    }
}