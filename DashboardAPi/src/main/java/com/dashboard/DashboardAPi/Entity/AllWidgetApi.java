package com.dashboard.dashboardapi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "widgets_api")
public class AllWidgetApi {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true,nullable = false)
    private String name;
    private String description;
    @OneToMany(targetEntity = AllParamsApi.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="id_widget",referencedColumnName = "id")
    private List<AllParamsApi> params;

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

    public List<AllParamsApi> getParams() {
        return params;
    }

    public void setParams(List<AllParamsApi> params) {
        this.params = params;
    }
}
