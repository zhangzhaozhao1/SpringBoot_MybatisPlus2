package com.z.springboot_mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.z.springboot_mybatisplus.pojo.Provider;
import com.z.springboot_mybatisplus.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl extends ServiceImpl<BaseMapper<Provider>,Provider> implements ProviderService {
    @Override
    public Provider selectProviderById(Integer id) {
        return this.baseMapper.selectById(id);
    }
}
