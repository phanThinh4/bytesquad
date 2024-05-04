package com.sms.bytesquad.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product_storages")
@Data
public class ProductStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer storageId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

    @ManyToOne
    @JoinColumn(name = "transaction_id")
    private InventoryTransaction inventoryTransaction;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private BigDecimal quantityDemanded;
}
