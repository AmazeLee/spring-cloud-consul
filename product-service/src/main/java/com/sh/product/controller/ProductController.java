package com.sh.product.controller;

import com.sh.product.entity.Product;
import com.sh.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

//	@Value("${server.port}")
//	private String port;
//
//	@Value("${spring.cloud.client.ip-address}") //spring cloud 自动的获取当前应用的ip地址
//	private String ip;

	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Product findById(@PathVariable Long id) {
		Product product = productService.findById(id);
		return product;
	}
}
