package org.codewithkamo.workingwithspringboot.Product.Service;

import org.codewithkamo.workingwithspringboot.Interfaces.Command;
import org.codewithkamo.workingwithspringboot.Interfaces.ProductRepository;
import org.codewithkamo.workingwithspringboot.Product.model.ProductDTO;
import org.codewithkamo.workingwithspringboot.Product.model.ProductEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateProductService  implements Command<ProductEntity, ProductDTO> {

    private final ProductRepository productRepository;

    public CreateProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<ProductDTO> execute(ProductEntity productEntity) {
        ProductEntity savedProduct = productRepository.save(productEntity);

        return ResponseEntity.status(HttpStatus.CREATED).body(new ProductDTO(savedProduct));
    }
}
