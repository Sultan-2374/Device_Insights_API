package io.applova.health.model;

import io.applova.health.model.id.BatteryInfoId;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Battery_Info")
@IdClass(BatteryInfoId.class)
public class BatteryInfo {
    @Id
    @Column(name = "device_id")
    private String deviceID;

    @Id
    @Column(name = "business_id")
    private String businessID;

    private int level;
    private boolean isCharging;
    private float temperature;
    private float voltage;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isCharging() {
        return isCharging;
    }

    public void setCharging(boolean charging) {
        isCharging = charging;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
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


