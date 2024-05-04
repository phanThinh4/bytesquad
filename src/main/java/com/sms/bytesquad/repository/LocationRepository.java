package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}

