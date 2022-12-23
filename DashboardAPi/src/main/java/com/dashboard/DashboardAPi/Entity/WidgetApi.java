package com.dashboard.dashboardapi.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "widgets_api")
public class WidgetApi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true,nullable = false)
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name ="id_service")
    private ServiceApi serviceApi;

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

    public ServiceApi getServiceApi() {
        return serviceApi;
    }

}
