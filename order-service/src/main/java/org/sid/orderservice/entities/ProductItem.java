package org.sid.orderservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.orderservice.model.Product;

@Entity @Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    @Transient // pour ne pas creer une colonne dans la table
    private Product product;
    private double price;
    private double quantity;
    private double discount;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)  // pour eviter la boucle infinie entre Order et ProductItem
    private Order order;
}
