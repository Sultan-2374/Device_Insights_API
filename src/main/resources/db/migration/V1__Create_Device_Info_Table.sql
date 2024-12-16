CREATE TABLE device_info (
                             device_id VARCHAR(255) NOT NULL,
                             business_id VARCHAR(255) NOT NULL,
                             device_name VARCHAR(255),
                             manufacturer VARCHAR(255),
                             model VARCHAR(255),
                             android_version VARCHAR(50),
                             sdk_version VARCHAR(50),
                             created_time DATETIME,
                             updated_time DATETIME,
                             PRIMARY KEY (device_id, business_id)
);
