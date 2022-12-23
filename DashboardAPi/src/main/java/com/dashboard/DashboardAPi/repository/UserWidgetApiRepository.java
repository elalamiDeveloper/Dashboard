package com.dashboard.dashboardapi.Repository;

import com.dashboard.dashboardapi.Entity.UserWidgetApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWidgetApiRepository extends JpaRepository<UserWidgetApi,Long> {
}
