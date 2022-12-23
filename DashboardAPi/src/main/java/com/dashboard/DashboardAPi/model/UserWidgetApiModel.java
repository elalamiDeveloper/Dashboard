package com.dashboard.dashboardapi.model;

public class UserWidgetApiModel {
    private String value ;
    private String name_widget;
    private String name_param;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName_widget() {
        return name_widget;
    }

    public void setName_widget(String name_widget) {
        this.name_widget = name_widget;
    }

    public String getName_param() {
        return name_param;
    }

    public void setName_param(String name_param) {
        this.name_param = name_param;
    }
}
