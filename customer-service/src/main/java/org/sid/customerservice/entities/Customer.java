package org.sid.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // pour créer des objets avec le design pattern builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pour que l'ID soit auto-incrémenté
    private Long id;
    private String name;
    private String email;
}
