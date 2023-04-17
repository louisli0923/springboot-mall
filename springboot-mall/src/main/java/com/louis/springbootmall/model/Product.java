package com.louis.springbootmall.model;

import com.louis.springbootmall.constant.ProductCategory;
import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer productId;
    private String productName;
    private ProductCategory category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
//  預設使用英國格林威治時區
    private Date createDate;
    private Date lastModifiedDate;
}
