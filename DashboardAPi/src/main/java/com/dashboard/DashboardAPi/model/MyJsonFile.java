package com.dashboard.dashboardapi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MyJsonFile {
    private MyClientFile client ;
    private MyServerFile server ;

    public MyClientFile getClient() {
        return client;
    }

    public void setClient(MyClientFile client) {
        this.client = client;
    }

    public MyServerFile getServer() {
        return server;
    }

    public void setServer(MyServerFile server) {
        this.server = server;
    }
}
