package io.applova.health.controller;

import io.applova.health.dto.DeviceInfoRequestDTO;
import io.applova.health.service.DeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/api/device")
public class DeviceInfoController {

    @Autowired
    private DeviceInfoService deviceInfoService;

    @PostMapping
    public ResponseEntity<String> createDeviceInfo(@RequestBody @Validated DeviceInfoRequestDTO request) {
        deviceInfoService.createDeviceInfo(request);
        return ResponseEntity.status(HttpStatus.CREATED).body("Device info and related data created successfully");
    }
}

