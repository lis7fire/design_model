package cn.irag.builder.builder02;

import lombok.Data;

// 一个产品类，由3个部分组成
@Data
public class Product2 {
    // 给定一个默认套餐
    private String partA = "汉堡";

    private String partB = "薯条";

    private String partC = "可乐";
}
