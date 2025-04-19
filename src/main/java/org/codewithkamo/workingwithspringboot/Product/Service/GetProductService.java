package org.codewithkamo.workingwithspringboot.Product.Service;

import org.codewithkamo.workingwithspringboot.Interfaces.ProductRepository;
import org.codewithkamo.workingwithspringboot.Interfaces.Query;
import org.codewithkamo.workingwithspringboot.Product.model.ProductEntity;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProductService implements Query<Void, List<ProductEntity>> {

    private final ProductRepository productRepository;

    public GetProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<List<ProductEntity>> execute(Void input) {
        List<ProductEntity> products = productRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }
}
