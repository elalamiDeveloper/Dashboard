package com.dashboard.dashboardapi.Repository;

import com.dashboard.dashboardapi.Entity.ServiceApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceApiRepository extends JpaRepository<ServiceApi, Long> {
}
