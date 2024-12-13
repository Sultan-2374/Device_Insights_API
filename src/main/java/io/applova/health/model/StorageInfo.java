package io.applova.health.model;

import io.applova.health.model.id.StorageInfoId;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Storage_Info")
@IdClass(StorageInfoId.class)
public class StorageInfo {

    @Id
    @Column(name = "device_id")
    private String deviceID;

    @Id
    @Column(name = "business_id")
    private String businessID;

    @Column(name = "total_storage")
    private int totalStorage;

    @Column(name = "available_storage")
    private int availableStorage;

    @Column(name = "app_size")
    private int appSize;

    @Column(name = "user_data")
    private int userData;

    @Column(name = "cache_size")
    private int cacheSize;

    @Column(name = "total_app_size")
    private int totalAppSize;

    @Column(name = "realm_size")
    private int realmSize;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "device_id", referencedColumnName = "device_id"),
            @JoinColumn(name = "business_id", referencedColumnName = "business_id")
    })
    private DeviceInfo deviceInfo;

    // Getters and setters

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getBusinessID() {
        return businessID;
    }

    public void setBusinessID(String businessID) {
        this.businessID = businessID;
    }

    public int getTotalStorage() {
        return totalStorage;
    }

    public void setTotalStorage(int totalStorage) {
        this.totalStorage = totalStorage;
    }

    public int getAvailableStorage() {
        return availableStorage;
    }

    public void setAvailableStorage(int availableStorage) {
        this.availableStorage = availableStorage;
    }

    public int getAppSize() {
        return appSize;
    }

    public void setAppSize(int appSize) {
        this.appSize = appSize;
    }

    public int getUserData() {
        return userData;
    }

    public void setUserData(int userData) {
        this.userData = userData;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public int getTotalAppSize() {
        return totalAppSize;
    }

    public void setTotalAppSize(int totalAppSize) {
        this.totalAppSize = totalAppSize;
    }

    public int getRealmSize() {
        return realmSize;
    }

    public void setRealmSize(int realmSize) {
        this.realmSize = realmSize;
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

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
}
