package com.dashboard.dashboardapi.model;

import com.dashboard.dashboardapi.Entity.AllServiceApi;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class MyServerFile {
    private long current_time;
    private List<AllServiceApi> services;

    public long getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(long current_time) {
        this.current_time = current_time;
    }

    public List<AllServiceApi> getServices() {
        return services;
    }

    public void setServices(List<AllServiceApi> services) {
        this.services = services;
    }
}
