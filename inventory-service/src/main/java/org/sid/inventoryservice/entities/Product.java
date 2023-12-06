package org.sid.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // pour creer un objet avec des parametres
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pour incrementer l id automatiquement
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
