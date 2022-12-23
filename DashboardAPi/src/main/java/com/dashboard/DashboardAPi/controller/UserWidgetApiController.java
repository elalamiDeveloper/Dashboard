package com.dashboard.dashboardapi.controller;

import com.dashboard.dashboardapi.Entity.UserWidgetApi;
import com.dashboard.dashboardapi.Entity.WidgetApi;
import com.dashboard.dashboardapi.model.UserWidgetApiModel;
import com.dashboard.dashboardapi.model.WidgetApiModel;
import com.dashboard.dashboardapi.service.UserWidgetApiService;
import com.dashboard.dashboardapi.service.WidgetApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/userwidget")
public class UserWidgetApiController {
    private final UserWidgetApiService userWidgetApiService;

    @GetMapping(value = "/all")
    public List<UserWidgetApi> getAllUserWidgets(){
        return userWidgetApiService.getAllUserWidgets();
    }

    @GetMapping
    public List<UserWidgetApi> getThisUserWidgets(){
        return userWidgetApiService.getThisUserWidgets();
    }

    @PostMapping
    public UserWidgetApiModel createUserWidget(@RequestBody UserWidgetApiModel userWidgetApiModel){
        return userWidgetApiService.createUserWidget(userWidgetApiModel);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUserWidget(@PathVariable("id") long id){
        userWidgetApiService.deleteUserWidget(id);
    }
}
