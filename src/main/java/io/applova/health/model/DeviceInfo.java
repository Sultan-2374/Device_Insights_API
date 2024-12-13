package io.applova.health.model;

import io.applova.health.model.id.DeviceInfoId;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "device_info")
@IdClass(DeviceInfoId.class)
public class DeviceInfo {

    @Id
    @Column(name = "device_id")
    private String deviceId;

    @Id
    @Column(name = "business_id")
    private String businessId;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "model")
    private String model;

    @Column(name = "android_version")
    private String androidVersion;

    @Column(name = "sdk_version")
    private String sdkVersion;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

    @OneToOne(mappedBy = "deviceInfo", cascade = CascadeType.ALL)
    private NetworkInfo networkInfo;

    @OneToOne(mappedBy = "deviceInfo", cascade = CascadeType.ALL)
    private StorageInfo storageInfo;

    @OneToOne(mappedBy = "deviceInfo", cascade = CascadeType.ALL)
    private BatteryInfo batteryInfo;

    // Getters and setters

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public NetworkInfo getNetworkInfo() {
        return networkInfo;
    }

    public void setNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    public StorageInfo getStorageInfo() {
        return storageInfo;
    }

    public void setStorageInfo(StorageInfo storageInfo) {
        this.storageInfo = storageInfo;
    }

    public BatteryInfo getBatteryInfo() {
        return batteryInfo;
    }

    public void setBatteryInfo(BatteryInfo batteryInfo) {
        this.batteryInfo = batteryInfo;
    }
}
