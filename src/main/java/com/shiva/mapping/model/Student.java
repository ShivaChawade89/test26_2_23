package com.shiva.mapping.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Student {

        @Id
        private String ID;
        private String name;
        private String age;
        private String phoneNumber;
        private String branch;
        private String department;

        @Embedded
        private Address address;
}
