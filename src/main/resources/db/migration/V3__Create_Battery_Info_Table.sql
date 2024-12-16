CREATE TABLE Battery_Info (
                              device_id VARCHAR(255) NOT NULL,
                              business_id VARCHAR(255) NOT NULL,
                              level INT NOT NULL,
                              is_charging BOOLEAN NOT NULL,
                              temperature FLOAT NOT NULL,
                              voltage FLOAT NOT NULL,
                              created_time DATETIME,
                              updated_time DATETIME,
                              PRIMARY KEY (device_id, business_id),
                              CONSTRAINT fk_device_info FOREIGN KEY (device_id, business_id)
                                  REFERENCES device_info (device_id, business_id)
);
