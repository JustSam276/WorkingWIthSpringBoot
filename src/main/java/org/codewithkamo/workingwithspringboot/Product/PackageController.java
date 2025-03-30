package org.codewithkamo.workingwithspringboot.Product;


import org.codewithkamo.workingwithspringboot.Service.CreateProductService;
import org.codewithkamo.workingwithspringboot.Service.DeleteProductService;
import org.codewithkamo.workingwithspringboot.Service.GetProductService;
import org.codewithkamo.workingwithspringboot.Service.UpdateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<String> createProduct(){

        return createProductService.execute();
    }

    @GetMapping
    public ResponseEntity<String> getProduct(){
        return getProductService.execute();
    }

    @PutMapping
    public ResponseEntity<String> updateProduct(){
        return updateProductService.execute();
    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return deleteProductService.excute();
    }
}


