CREATE TABLE IF NOT EXISTS Network_Info (
                              device_id VARCHAR(255) NOT NULL,
                              business_id VARCHAR(255) NOT NULL,
                              is_connected BOOLEAN NOT NULL,
                              type VARCHAR(255),
                              network_quality VARCHAR(255),
                              bandwidth VARCHAR(255),
                              signal_strength VARCHAR(255),
                              created_time TIMESTAMP,
                              updated_time TIMESTAMP,
                              PRIMARY KEY (device_id, business_id),
                              CONSTRAINT fk_network_device FOREIGN KEY (device_id, business_id)
                                  REFERENCES device_info (device_id, business_id)
);
