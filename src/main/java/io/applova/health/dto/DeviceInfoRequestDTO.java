package io.applova.health.dto;

public class DeviceInfoRequestDTO {
    // DeviceInfo fields
    private String deviceId;
    private String businessId;
    private String deviceName;
    private String manufacturer;
    private String model;
    private String androidVersion;
    private String sdkVersion;

    // BatteryInfo fields
    private int batteryLevel;
    private boolean isCharging;
    private float batteryTemperature;
    private float batteryVoltage;

    // NetworkInfo fields
    private boolean isConnected;
    private String networkType;
    private String networkQuality;
    private String bandwidth;
    private String signalStrength;

    // StorageInfo fields
    private int totalStorage;
    private int availableStorage;
    private int appSize;
    private int userData;
    private int cacheSize;
    private int totalAppSize;
    private int realmSize;

    // Getters and Setters (omitted for brevity)

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

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

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isCharging() {
        return isCharging;
    }

    public void setCharging(boolean charging) {
        isCharging = charging;
    }

    public float getBatteryTemperature() {
        return batteryTemperature;
    }

    public void setBatteryTemperature(float batteryTemperature) {
        this.batteryTemperature = batteryTemperature;
    }

    public float getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
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
}
