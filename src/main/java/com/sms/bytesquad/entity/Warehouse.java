package com.sms.bytesquad.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "warehouses")
@Data
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer warehouseId;

    @ManyToOne
    @JoinColumn(name = "warehouse_type_id")
    private WarehouseType warehouseType;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    private String name;
}
