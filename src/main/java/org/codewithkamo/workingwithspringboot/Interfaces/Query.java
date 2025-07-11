package org.codewithkamo.workingwithspringboot.Interfaces;

import org.springframework.http.ResponseEntity;

// This will only be used for the get request
public interface Query<I, O> {

    ResponseEntity<O> execute(I input);
}
