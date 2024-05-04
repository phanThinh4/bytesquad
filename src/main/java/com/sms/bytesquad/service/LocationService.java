package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.Location;

public interface LocationService {
    List<Location> getAllLocations();

    Location getLocationById(Integer id);

}
