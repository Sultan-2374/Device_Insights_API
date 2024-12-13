package io.applova.health.repository;

import io.applova.health.model.BatteryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatteryInfoRepository extends JpaRepository<BatteryInfo, Long> {
}
