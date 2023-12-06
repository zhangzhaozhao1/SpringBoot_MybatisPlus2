package com.z.springboot_mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.z.springboot_mybatisplus.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProviderMapper extends BaseMapper<Provider> {
    List<Provider> findProvider(@Param("proName") String proName, @Param("proDesc") String proDesc);
    Double findProviderBillPrice(Map<String,Object> map);
    List<Provider> findAllProvider(@Param("proName")String proName,@Param("proDesc")String proDesc,@Param("proAddress")String proAddress);
    int addProvider(Provider provider);
    int delProviderById(Integer id);
    int delProviderByIds(Integer[] list);
    int updProvider(Provider provider);
    Provider selectProviderById(Integer id);
}
