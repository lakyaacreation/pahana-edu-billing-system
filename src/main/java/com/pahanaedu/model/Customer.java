package com.pahanaedu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Customer {
    @Id
    private String accountNumber;

    @NotBlank
    private String name;

    private String address;

    @Pattern(regexp = "\\d{10}")
    private String telephone;

    private int unitsConsumed;

    // Getters and setters omitted for brevity
}
