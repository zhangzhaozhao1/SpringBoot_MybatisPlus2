package com.z.springboot_mybatisplus.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Bill {
    private Integer id;   //id
    private String billCode; //订单编码
    private String productName; //商品名称
    private String productDesc; //商品描述
    private String productUnit; //商品计量单位
    private Integer productCount; //商品数量
    private double totalPrice; //商品总额
    private int isPayment; //是否支付
    private Long createdBy; //创建者
    private Timestamp creationDate; //创建时间
    private Integer modifyBy; //更新者
    private Date modifyDate;//更新时间
    private Provider provider; //所属供应商
}
