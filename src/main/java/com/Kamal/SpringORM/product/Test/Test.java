package com.Kamal.SpringORM.product.Test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Kamal.SpringORM.product.dao.ProductDao;
import com.Kamal.SpringORM.product.model.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/SpringORM/product/Test/config.xml");
		ProductDao pdao=(ProductDao)ctx.getBean("productDaoImpl");
		Product product =new Product();
		product.setId(1);
		product.setDesc("Iphone iphone");
		product.setName("phone");
		product.setPrice(500000);
	//	int result = pdao.create(product);
		
//		System.out.println("number of rows entered :"+result);

		/*pdao.update(product);
		pdao.delete(product);
		Product p=pdao.find(2);
		System.out.println(p);*/
		
		List<Product> findall = pdao.findall();
		System.out.println(findall);
	}

}
