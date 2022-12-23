package com.dashboard.dashboardapi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MyClientFile {
    private String host ;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
