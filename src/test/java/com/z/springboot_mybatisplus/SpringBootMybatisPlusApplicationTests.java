package com.z.springboot_mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    @Test
    public void testPageList() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("proName","公司");
        Page<Provider> page = new Page<>(1, 5);
        providerMapper.selectPage(page,queryWrapper);
// 输出page对象分页查询信息
        System.out.println("总条数：" + page.getTotal());
        System.out.println("每页显示条数：" + page.getSize());
        System.out.println("总页数：" + page.getPages());
        System.out.println("当前页：" + page.getCurrent());
        System.out.println("是否有上一页：" + page.hasPrevious());
        System.out.println("是否有下一页：" + page.hasNext());
        System.out.println("查询结果：" + page.getRecords());
    }

}
