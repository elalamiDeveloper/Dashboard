package com.dashboard.dashboardapi.controller;

import com.dashboard.dashboardapi.Entity.ParamsApi;
import com.dashboard.dashboardapi.model.ParamsApiModel;
import com.dashboard.dashboardapi.service.ParamsApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/param")
public class ParamsApiController {
    private final ParamsApiService paramsApiService;

    @GetMapping
    public List<ParamsApi> getAllParams(){
        return paramsApiService.getAllParams();
    }

    @PostMapping
    public ParamsApiModel createParam(@RequestBody ParamsApiModel paramsApiModel){
        return paramsApiService.createParam(paramsApiModel);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteParam(@PathVariable("id") long id){
        paramsApiService.deleteParam(id);
    }
}
