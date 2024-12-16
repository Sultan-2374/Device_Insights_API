CREATE TABLE IF NOT EXISTS device_info (
                             device_id VARCHAR(255) NOT NULL,
                             business_id VARCHAR(255) NOT NULL,
                             device_name VARCHAR(255),
                             manufacturer VARCHAR(255),
                             model VARCHAR(255),
                             android_version VARCHAR(50),
                             sdk_version VARCHAR(50),
                             created_time TIMESTAMP,
                             updated_time TIMESTAMP,
                             PRIMARY KEY (device_id, business_id)
);
