package com.dashboard.dashboardapi.Repository;

import com.dashboard.dashboardapi.Entity.AllServiceApi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllServiceApiRepository extends JpaRepository<AllServiceApi, Long> {
    AllServiceApi findAllById(long id);
}
