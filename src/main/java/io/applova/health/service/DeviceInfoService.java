package io.applova.health.service;

import io.applova.health.dto.DeviceInfoRequestDTO;
import io.applova.health.model.BatteryInfo;
import io.applova.health.model.DeviceInfo;
import io.applova.health.model.NetworkInfo;
import io.applova.health.model.StorageInfo;
import io.applova.health.repository.BatteryInfoRepository;
import io.applova.health.repository.DeviceInfoRepository;
import io.applova.health.repository.NetworkInfoRepository;
import io.applova.health.repository.StorageInfoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DeviceInfoService {

    @Autowired
    private DeviceInfoRepository deviceInfoRepository;
    @Autowired
    private BatteryInfoRepository batteryInfoRepository;
    @Autowired
    private NetworkInfoRepository networkInfoRepository;
    @Autowired
    private StorageInfoRepository storageInfoRepository;

    @Transactional
    public void createDeviceInfo(DeviceInfoRequestDTO request) {
        // Create DeviceInfo entity
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceId(request.getDeviceId());
        deviceInfo.setBusinessId(request.getBusinessId());
        deviceInfo.setDeviceName(request.getDeviceName());
        deviceInfo.setManufacturer(request.getManufacturer());
        deviceInfo.setModel(request.getModel());
        deviceInfo.setAndroidVersion(request.getAndroidVersion());
        deviceInfo.setSdkVersion(request.getSdkVersion());
        deviceInfo.setCreatedTime(LocalDateTime.now());
        deviceInfo.setUpdatedTime(LocalDateTime.now());

        // Create BatteryInfo entity
        BatteryInfo batteryInfo = new BatteryInfo();
        batteryInfo.setDeviceID(request.getDeviceId());
        batteryInfo.setBusinessID(request.getBusinessId());
        batteryInfo.setLevel(request.getBatteryLevel());
        batteryInfo.setCharging(request.isCharging());
        batteryInfo.setTemperature(request.getBatteryTemperature());
        batteryInfo.setVoltage(request.getBatteryVoltage());
        batteryInfo.setCreatedTime(LocalDateTime.now());
        batteryInfo.setUpdatedTime(LocalDateTime.now());
        batteryInfo.setDeviceInfo(deviceInfo);

        // Create NetworkInfo entity
        NetworkInfo networkInfo = new NetworkInfo();
        networkInfo.setDeviceID(request.getDeviceId());
        networkInfo.setBusinessID(request.getBusinessId());
        networkInfo.setConnected(request.isConnected());
        networkInfo.setType(request.getNetworkType());
        networkInfo.setNetworkQuality(request.getNetworkQuality());
        networkInfo.setBandwidth(request.getBandwidth());
        networkInfo.setSignalStrength(request.getSignalStrength());
        networkInfo.setCreatedTime(LocalDateTime.now());
        networkInfo.setUpdatedTime(LocalDateTime.now());
        networkInfo.setDeviceInfo(deviceInfo);

        // Create StorageInfo entity
        StorageInfo storageInfo = new StorageInfo();
        storageInfo.setDeviceID(request.getDeviceId());
        storageInfo.setBusinessID(request.getBusinessId());
        storageInfo.setTotalStorage(request.getTotalStorage());
        storageInfo.setAvailableStorage(request.getAvailableStorage());
        storageInfo.setAppSize(request.getAppSize());
        storageInfo.setUserData(request.getUserData());
        storageInfo.setCacheSize(request.getCacheSize());
        storageInfo.setTotalAppSize(request.getTotalAppSize());
        storageInfo.setRealmSize(request.getRealmSize());
        storageInfo.setCreatedTime(LocalDateTime.now());
        storageInfo.setUpdatedTime(LocalDateTime.now());
        storageInfo.setDeviceInfo(deviceInfo);

        // Persist all entities
        deviceInfoRepository.save(deviceInfo);
        batteryInfoRepository.save(batteryInfo);
        networkInfoRepository.save(networkInfo);
        storageInfoRepository.save(storageInfo);
    }
}

