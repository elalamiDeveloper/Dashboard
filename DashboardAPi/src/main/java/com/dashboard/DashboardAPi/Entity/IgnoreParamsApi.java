package com.dashboard.dashboardapi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "params_api")
public class IgnoreParamsApi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true,nullable = false)
    private String name;
    @Column(nullable = false)
    private String type;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name ="id_widget")
    private WidgetApi widgetApi;
}
