package com.z.springboot_mybatisplus;

import com.z.springboot_mybatisplus.mapper.ProviderMapper;
import com.z.springboot_mybatisplus.pojo.Provider;
import com.z.springboot_mybatisplus.service.ProviderService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@MapperScan("com.z.springboot_mybatisplus.mapper")
class SpringBootMybatisPlusApplicationTests {
    @Autowired
    private ProviderMapper providerMapper;
    @Autowired
    private ProviderService providerService;
    @Test
    void contextLoads() {
    }
    @Test
    void testSelect1(){
        List<Provider> list = providerMapper.selectList(null);
        for (Provider provider:list){
            System.out.println(provider);
        }
    }
    @Test
    void testSelect2(){
        Map<String,Object> map = new HashMap<>();
        map.put("proName","优百商贸有限公司");
        List<Provider> list = providerMapper.selectByMap(map);
        for (Provider provider:list){
            System.out.println(provider);
        }
    }
    @Test
    void testSelect3(){
        Provider provider = providerService.selectProviderById(2);
        System.out.println(provider);
    }

}
