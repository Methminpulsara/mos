package edu.icet.ecom.controller.product;


import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/product")

public class ProductController {

    final ProductService productService;


    @GetMapping("/getAll")
    public List<Product> getAll(){
        List<Product> all = productService.getAll();
        return all;
    }
}
