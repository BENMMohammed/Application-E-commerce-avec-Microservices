package org.sid.orderservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.orderservice.enums.OrderStatus;
import org.sid.orderservice.model.Customer;

import java.util.Date;
import java.util.List;

@Entity @Table(name = "orders") // pour eviter le conflit avec le mot order dans sql
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    private OrderStatus status;
    private Long customerId;
    @Transient // pour ne pas creer une colonne dans la table
    private Customer customer;
    @OneToMany(mappedBy = "order") // pour dire que la relation est bidirectionnelle
    private List<ProductItem> productItems;



}
