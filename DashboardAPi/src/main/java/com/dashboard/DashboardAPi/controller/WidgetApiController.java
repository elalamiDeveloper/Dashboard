package com.dashboard.dashboardapi.controller;

import com.dashboard.dashboardapi.Entity.WidgetApi;
import com.dashboard.dashboardapi.model.WidgetApiModel;
import com.dashboard.dashboardapi.service.WidgetApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/widget")
public class WidgetApiController {
    private final WidgetApiService widgetApiService;

    @GetMapping
    public List<WidgetApi> getAllWidgets(){
        return widgetApiService.getAllWidgets();
    }

    @PostMapping
    public WidgetApiModel createWidget(@RequestBody WidgetApiModel widgetApiModel){
        return widgetApiService.createWidget(widgetApiModel);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteWidget(@PathVariable("id") long id){
        widgetApiService.deleteWidget(id);
    }
}
