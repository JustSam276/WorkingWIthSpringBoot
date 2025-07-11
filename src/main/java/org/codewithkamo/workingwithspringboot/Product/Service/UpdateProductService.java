package org.codewithkamo.workingwithspringboot.Product.Service;

import org.codewithkamo.workingwithspringboot.Interfaces.Command;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class UpdateProductService implements Command<Void, String> {

    @Override
    public ResponseEntity<String> execute(Void input) {
        return ResponseEntity.status(HttpStatus.OK).body("Product Updated");
    }
}
