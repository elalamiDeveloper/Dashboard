package com.dashboard.dashboardapi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "services_api")
public class AllServiceApi {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true,nullable = false)
    private String name;
    @OneToMany(targetEntity = AllWidgetApi.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="id_service",referencedColumnName = "id")
    private List<AllWidgetApi> widgets;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<AllWidgetApi> getWidgets() {
        return widgets;
    }
}
