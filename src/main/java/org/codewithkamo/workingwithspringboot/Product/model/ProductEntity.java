package org.codewithkamo.workingwithspringboot.Product.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity // maps java class to mysql
@Data
@Table(name="product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private  String description;

    @Column(name = "price")
    private Double price;
}
