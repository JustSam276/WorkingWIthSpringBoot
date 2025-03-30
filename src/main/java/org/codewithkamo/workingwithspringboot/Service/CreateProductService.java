package org.codewithkamo.workingwithspringboot.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateProductService {

    public ResponseEntity<String> execute(){
        return ResponseEntity.status(HttpStatus.CREATED).body("Product Created");
    }
}
