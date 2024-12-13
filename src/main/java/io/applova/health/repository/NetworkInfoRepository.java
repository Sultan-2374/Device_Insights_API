package io.applova.health.repository;

import io.applova.health.model.DeviceInfo;
import io.applova.health.model.NetworkInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkInfoRepository extends JpaRepository<NetworkInfo, Long> {
}
