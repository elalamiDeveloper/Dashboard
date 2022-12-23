package com.dashboard.dashboardapi.model;

public class ParamsApiModel {
    private long id;
    private String name;
    private String type;
    private long id_widget;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId_widget() {
        return id_widget;
    }

    public void setId_widget(long id_widget) {
        this.id_widget = id_widget;
    }
}
