package com.dashboard.dashboardapi.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "services_api")
public class ServiceApi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true,nullable = false)
    private String name;

    @Override
    public String toString() {
        return "ServiceApi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
