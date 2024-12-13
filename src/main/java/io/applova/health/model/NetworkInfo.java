package io.applova.health.model;

import io.applova.health.model.id.NetworkInfoId;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Network_Info")
@IdClass(NetworkInfoId.class)
public class NetworkInfo {

    @Id
    @Column(name = "device_id")
    private String deviceID;

    @Id
    @Column(name = "business_id")
    private String businessID;

    @Column(name = "is_connected")
    private boolean isConnected;

    private String type;
    private String networkQuality;
    private String bandwidth;
    private String signalStrength;

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

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNetworkQuality() {
        return networkQuality;
    }

    public void setNetworkQuality(String networkQuality) {
        this.networkQuality = networkQuality;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(String signalStrength) {
        this.signalStrength = signalStrength;
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
