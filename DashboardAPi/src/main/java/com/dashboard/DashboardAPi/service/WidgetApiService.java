package com.dashboard.dashboardapi.service;

import com.dashboard.dashboardapi.Entity.WidgetApi;
import com.dashboard.dashboardapi.Repository.ServiceApiRepository;
import com.dashboard.dashboardapi.Repository.WidgetApiRepository;
import com.dashboard.dashboardapi.model.WidgetApiModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class WidgetApiService {
    private final WidgetApiRepository widgetApiRepository;
    private final ServiceApiRepository serviceApiRepository;

    public List<WidgetApi> getAllWidgets(){
        return widgetApiRepository.findAll();
    }

    public WidgetApiModel createWidget(WidgetApiModel widgetApiModel) {
        WidgetApi widgetApiEntity = new WidgetApi();
        widgetApiEntity.setName(widgetApiModel.getName());
        widgetApiEntity.setDescription(widgetApiModel.getDescription());
        widgetApiEntity.setServiceApi(serviceApiRepository.findById(widgetApiModel.getId_service()).get());
        widgetApiRepository.save(widgetApiEntity);
        return widgetApiModel;
    }

    public void deleteWidget(long id) {
        widgetApiRepository.deleteById(id);
    }
}
