package com.example.examplemodule4.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "tên không để trống")
    private String name;
    @ManyToOne
    private Country country;
    @Min(value = 1, message = "nhap lai ")
    private Double area;
    @Min(value = 1, message = "nhap lai")
    private Long population;
    @Min(value = 1L, message = "nhap lai")
    private double GDP;
    private String description;


}
