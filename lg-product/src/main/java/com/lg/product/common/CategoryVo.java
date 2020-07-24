package com.lg.product.common;

import com.lg.product.entity.Category;
import lombok.Data;

import java.util.List;

@Data
public class CategoryVo extends Category {

    //存储子节点
    private List<CategoryVo> subList;
}
