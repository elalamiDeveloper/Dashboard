package com.dashboard.dashboardapi.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "params_api")
public class ParamsApi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true,nullable = false)
    private String name;
    @Column(nullable = false)
    private String type;
    @ManyToOne
    @JoinColumn(name ="id_widget")
    private WidgetApi widgetApi;

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

    public WidgetApi getWidgetApi() {
        return widgetApi;
    }

    public void setWidgetApi(WidgetApi widgetApi) {
        this.widgetApi = widgetApi;
    }
}
