package com.dashboard.dashboardapi.controller;

import com.dashboard.dashboardapi.Entity.AllServiceApi;
import com.dashboard.dashboardapi.Entity.ServiceApi;
import com.dashboard.dashboardapi.model.ServiceApiModel;
import com.dashboard.dashboardapi.service.ServiceApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/service")
public class ServiceApiController {
    private final ServiceApiService serviceApiService;

    @GetMapping
    public List<ServiceApi> getAllServices(){
        return serviceApiService.getAllServices();
    }

    @PostMapping
    public ServiceApiModel createService(@RequestBody ServiceApiModel serviceApiModel){
        return serviceApiService.createService(serviceApiModel);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteService(@PathVariable("id") long id){
        serviceApiService.deleteService(id);
    }
}
