package com.example.springgf.service.imply;

import com.example.springgf.controller.request.productrequest;
import com.example.springgf.entity.image;
import com.example.springgf.entity.products;
import com.example.springgf.mapper.CategoryMapper;
import com.example.springgf.mapper.ImageMapper;
import com.example.springgf.mapper.ProductMapper;
import com.example.springgf.service.ProductService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class IProductService implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    ImageMapper imageMapper;
    @Override
    public void add(HttpServletRequest r, products p, String catename){
        int userID=(int)r.getSession().getAttribute("user");
        int categoryID=categoryMapper.getIDByName(catename);
        Random random=new Random();
        int productID=random.nextInt(1000);
        int intentnum=random.nextInt(10000);
        products product=new products();
        product.setProductID(productID);
        product.setPrice(p.getPrice());
        product.setDescription(p.getDescription());
        product.setTitle(p.getTitle());
        product.setUserID(userID);
        product.setCategoryID(categoryID);
        product.setIntentnum(intentnum);
        productMapper.add(product);
    }
   public List<productrequest> guess(){
       List<productrequest> products=new ArrayList<>();
       Set<Integer> set=new HashSet<Integer>();
        Random random=new Random();
        for(int i=0;i<10;i++){
            int n=random.nextInt(20);//
            if(set.contains(n))
                continue;
            if(n<=0)
                continue;
            set.add(n);
            products tmp=productMapper.getByID(n);
            productrequest p=new productrequest();
            BeanUtils.copyProperties(tmp,p);
           image img=imageMapper.getByPID(tmp.getProductID());
           if(img!=null){
               p.setImageURL(img.getImageURL());
           }
         else continue;
            products.add(p);
        }
return products;
   }
}
