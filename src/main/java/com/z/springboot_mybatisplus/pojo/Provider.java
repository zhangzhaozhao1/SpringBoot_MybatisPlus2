package com.z.springboot_mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
@TableName("smbms_provider")
public class Provider {
    private Integer id;   //id
    @TableField("proCode")
    private String proCode; //供应商编码
    @TableField("proName")
    private String proName; //供应商名称
    @TableField("proDesc")
    private String proDesc; //供应商描述
    @TableField("proContact")
    private String proContact; //供应商联系人
    @TableField("proPhone")
    private String proPhone; //供应商电话
    @TableField("proAddress")
    private String proAddress; //供应商地址
    @TableField("proFax")
    private String proFax; //供应商传真
    @TableField("createdBy")
    private Integer createdBy; //创建者
    @TableField("creationDate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp creationDate; //创建时间
    @TableField("modifyBy")
    private Integer modifyBy; //更新者
    @TableField("modifyDate")
    private Date modifyDate;//更新时间



}