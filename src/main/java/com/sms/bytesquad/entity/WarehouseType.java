package com.sms.bytesquad.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "warehouse_types")
@Data
public class WarehouseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer warehouseTypeId;
    private String name;
    private String description;
}
