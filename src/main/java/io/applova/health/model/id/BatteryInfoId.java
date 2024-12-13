package io.applova.health.model.id;

import java.io.Serializable;
import java.util.Objects;

public class BatteryInfoId implements Serializable {
    private String deviceID;
    private String businessID;

    // Default constructor
    public BatteryInfoId() {}

    // Parameterized constructor
    public BatteryInfoId(String deviceID, String businessID) {
        this.deviceID = deviceID;
        this.businessID = businessID;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatteryInfoId that = (BatteryInfoId) o;
        return Objects.equals(deviceID, that.deviceID) && Objects.equals(businessID, that.businessID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceID, businessID);
    }
}
