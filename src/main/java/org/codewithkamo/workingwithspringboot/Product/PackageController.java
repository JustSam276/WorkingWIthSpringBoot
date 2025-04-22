package org.codewithkamo.workingwithspringboot.Product;


import org.codewithkamo.workingwithspringboot.Product.Service.CreateProductService;
import org.codewithkamo.workingwithspringboot.Product.Service.DeleteProductService;
import org.codewithkamo.workingwithspringboot.Product.Service.GetProductService;
import org.codewithkamo.workingwithspringboot.Product.Service.UpdateProductService;
import org.codewithkamo.workingwithspringboot.Product.model.ProductDTO;
import org.codewithkamo.workingwithspringboot.Product.model.ProductEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PackageController {

    //Dependency Injection
    public final CreateProductService createProductService;

    public final GetProductService getProductService;

    public final UpdateProductService updateProductService;

    public final DeleteProductService deleteProductService;

    public PackageController(
            CreateProductService createProductService,
            GetProductService getProductService,
            UpdateProductService updateProductService,
            DeleteProductService deleteProductService
    ) {
        this.createProductService = createProductService;
        this.getProductService = getProductService;
        this.updateProductService = updateProductService;
        this.deleteProductService = deleteProductService;
    }


    //define the main mapping
    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductEntity productEntity){
        return createProductService.execute(productEntity);
    }

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getProducts(){
        return getProductService.execute(null);
    }

    @PutMapping
    public ResponseEntity<String> updateProduct(){
        return updateProductService.execute(null);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return deleteProductService.execute(null);
    }
}


