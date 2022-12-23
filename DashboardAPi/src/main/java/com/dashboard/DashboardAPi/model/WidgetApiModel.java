package com.dashboard.dashboardapi.model;

import com.dashboard.dashboardapi.Entity.ServiceApi;

public class WidgetApiModel {
    private long id;
    private String name;
    private String description;
    private long id_service;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId_service() {
        return id_service;
    }

    public void setId_service(long id_service) {
        this.id_service = id_service;
    }
}
