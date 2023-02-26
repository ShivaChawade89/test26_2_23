package com.shiva.mapping.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
