package com.dashboard.dashboardapi.Repository;

import com.dashboard.dashboardapi.Entity.WidgetApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WidgetApiRepository extends JpaRepository<WidgetApi, Long> {
    WidgetApi findByName(String name);
}
