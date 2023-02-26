package com.shiva.mapping.dto;

import com.shiva.mapping.model.Address;
import lombok.Data;

@Data
public class StudentDto {
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;
    private Address address;
}
