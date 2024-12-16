CREATE TABLE IF NOT EXISTS Storage_Info (
                              device_id VARCHAR(255) NOT NULL,
                              business_id VARCHAR(255) NOT NULL,
                              total_storage INT NOT NULL,
                              available_storage INT NOT NULL,
                              app_size INT NOT NULL,
                              user_data INT NOT NULL,
                              cache_size INT NOT NULL,
                              total_app_size INT NOT NULL,
                              realm_size INT NOT NULL,
                              created_time TIMESTAMP,
                              updated_time TIMESTAMP,
                              PRIMARY KEY (device_id, business_id),
                              CONSTRAINT fk_storage_device FOREIGN KEY (device_id, business_id)
                                  REFERENCES device_info (device_id, business_id)
);
