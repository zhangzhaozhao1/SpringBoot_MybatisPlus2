package com.z.springboot_mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.z.springboot_mybatisplus.pojo.Provider;

public interface ProviderService extends IService<Provider> {
    Provider selectProviderById(Integer id);
}
