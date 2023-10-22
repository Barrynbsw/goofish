package com.example.backened.service.imply;

import com.example.backened.controller.request.categoryrequest;
import com.example.backened.entity.categories;
import com.example.backened.mapper.CategoryMapper;
import com.example.backened.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ICategoryService implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    public List<categoryrequest> catepage(){
        List<categoryrequest> res=new ArrayList<>();
        //热门推荐
        categoryrequest hot=new categoryrequest();
        hot.setCategorName("热门推荐");
        hot.setCategoryID(0);
        List<categoryrequest> hotChildren=new ArrayList<>();
        Random random=new Random();
       Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<15;i++){
            int n=random.nextInt(18,50);
            set.add(n);
        }
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            int CategoryID=(Integer) iterator.next();
            categories tmp1=categoryMapper.getByID(CategoryID);
            if(tmp1==null)
                continue;
            categoryrequest tmp2=new categoryrequest();
            tmp2.setCategoryID(tmp1.getCategoryID());
            tmp2.setCategorName(tmp1.getCategoryName());
            tmp2.setCategoryimage(tmp1.getCategoryimage());
            hotChildren.add(tmp2);
        }
        hot.setChildren(hotChildren);
        res.add(hot);
        //查询分类
        List<categories> categories;
        categories=categoryMapper.catepage();
        for (int i=0;i<categories.size();i++){
            categoryrequest tmp=new categoryrequest();
            tmp.setCategoryID(categories.get(i).getCategoryID());
            tmp.setCategorName(categories.get(i).getCategoryName());
            tmp.setCategoryimage(categories.get(i).getCategoryimage());
            res.add(tmp);
        }
        for(categoryrequest i:res){
            List<categories> cateChildren=categoryMapper.getChildrenbyID(i.getCategoryID());
            List<categoryrequest> Children=new ArrayList<>();
            for (int j=0;j<cateChildren.size();j++){
                categoryrequest tmp=new categoryrequest();
                tmp.setCategoryID(cateChildren.get(j).getCategoryID());
                tmp.setCategorName(cateChildren.get(j).getCategoryName());
                tmp.setCategoryimage(cateChildren.get(j).getCategoryimage());
                Children.add(tmp);
            }
            i.setChildren(Children);
        }


        return res;
    }
}
