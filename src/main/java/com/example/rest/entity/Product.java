package com.example.rest.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date expiredDate;
    private int stock;

}
