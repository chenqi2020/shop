package com.lg.product.service.impl;

import com.lg.product.common.CategoryVo;
import com.lg.product.entity.Category;
import com.lg.product.mapper.CategoryMapper;
import com.lg.product.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务实现类
 * </p>
 *
 * @author wangxianhui
 * @since 2020-07-22
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Override
    public List<CategoryVo> getAllCategory() {
        List<CategoryVo> result=new ArrayList<>();
        List<CategoryVo> all=this.getBaseMapper().getAll();
        all.forEach(category->{
            if(category.getIsParent()){
                result.add(category);
            }
        });

        result.forEach(category1->{
            List<CategoryVo> list2=new ArrayList<>();
            all.forEach(category2->{
                if(category2.getParentId()==category1.getId()){
                    list2.add(category2);
                }

                List<CategoryVo> list3=new ArrayList<>();
                all.forEach(category3->{
                    if(category3.getParentId()==category2.getId()){
                        list3.add(category3);
                    }
                });
                category2.setSubList(list3);
            });
            category1.setSubList(list2);
        });
        return result;
    }
}
