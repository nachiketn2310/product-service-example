package com.productservice.productservice.controllers;


import com.productservice.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

//    @Autowired
//    @AutoConfigureAfter
    ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }
    @GetMapping
    public void getAllProducts() {

    }
    @DeleteMapping("/{id}")
    public void deleteProductById() {

    }
    public void createProduct() {

    }
    public void updateProductById() {

    }
}
/*

3 ways of Dependency Injection :-

1. Constructor Injection
2. Field Injection
3. Setter Injection.
*/