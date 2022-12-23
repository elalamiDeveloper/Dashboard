package com.dashboard.dashboardapi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_widget_api")
public class UserWidgetApi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value ;
    @ManyToOne
    @JoinColumn(name ="id_widget")
    private WidgetApi widgetApi;
    @ManyToOne
    @JoinColumn(name ="id_param")
    private ParamsApi paramsApi;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name ="id_user")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public WidgetApi getWidgetApi() {
        return widgetApi;
    }

    public void setWidgetApi(WidgetApi widgetApi) {
        this.widgetApi = widgetApi;
    }

    public ParamsApi getParamsApi() {
        return paramsApi;
    }

    public void setParamsApi(ParamsApi paramsApi) {
        this.paramsApi = paramsApi;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
