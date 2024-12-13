package io.applova.health.model.id;

import java.io.Serializable;
import java.util.Objects;

public class DeviceInfoId implements Serializable {
    private String deviceId;
    private String businessId;

    // Default constructor
    public DeviceInfoId() {}

    // Parameterized constructor
    public DeviceInfoId(String deviceId, String businessId) {
        this.deviceId = deviceId;
        this.businessId = businessId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceInfoId that = (DeviceInfoId) o;
        return Objects.equals(deviceId, that.deviceId) && Objects.equals(businessId, that.businessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, businessId);
    }
}

