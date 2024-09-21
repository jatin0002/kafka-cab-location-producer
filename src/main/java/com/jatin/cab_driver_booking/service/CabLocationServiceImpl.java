package com.jatin.cab_driver_booking.service;

import com.jatin.cab_driver_booking.constants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationServiceImpl implements CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstants.CAB_LOCATION, location);

        return true;
    }

}
