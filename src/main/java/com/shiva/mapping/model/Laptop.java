package com.shiva.mapping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jdk.jfr.Enabled;
import lombok.Data;

@Data
@Entity
public class Laptop {
    @Id
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    private Student student;

}
