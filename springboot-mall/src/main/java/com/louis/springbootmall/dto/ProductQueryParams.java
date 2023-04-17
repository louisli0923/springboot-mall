package com.louis.springbootmall.dto;

import com.louis.springbootmall.constant.ProductCategory;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class ProductQueryParams {

    private ProductCategory category;
    private String search;
    private String orderBy;
    private String sort;
}
