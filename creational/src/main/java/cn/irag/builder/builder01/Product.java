package cn.irag.builder.builder01;

import lombok.Data;

// 一个产品类，由3个部分组成
@Data
public class Product {
    private String partA;

    private String partB;

    private String partC;
}
