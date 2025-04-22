package org.codewithkamo.workingwithspringboot.Product.model;

import lombok.Data;

@Data
public class ProductDTO {

    private Integer id;
    private String name;
    private String description;

    public ProductDTO(ProductEntity productEntity){
        this.id = productEntity.getId();
        this.name = productEntity.getName();
        this.description = productEntity.getDescription();
    }
}
