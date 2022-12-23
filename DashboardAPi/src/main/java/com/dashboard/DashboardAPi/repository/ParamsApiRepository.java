package com.dashboard.dashboardapi.Repository;

import com.dashboard.dashboardapi.Entity.ParamsApi;
import com.dashboard.dashboardapi.Entity.WidgetApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParamsApiRepository extends JpaRepository<ParamsApi, Long> {
    ParamsApi findByNameAndAndWidgetApi(String name, WidgetApi widgetApi);
}
