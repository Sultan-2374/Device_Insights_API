package io.applova.health.repository;

import io.applova.health.model.DeviceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceInfoRepository extends JpaRepository<DeviceInfo, Long> {
}

