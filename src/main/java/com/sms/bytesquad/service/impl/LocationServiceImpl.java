package com.sms.bytesquad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bytesquad.entity.Location;
import com.sms.bytesquad.repository.LocationRepository;
import com.sms.bytesquad.service.LocationService;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location getLocationById(Integer id) {
        return locationRepository.findById(id).orElse(null);
    }

}

