package com.dashboard.dashboardapi.service;

import com.dashboard.dashboardapi.Entity.ParamsApi;
import com.dashboard.dashboardapi.Repository.ParamsApiRepository;
import com.dashboard.dashboardapi.Repository.UserRepository;
import com.dashboard.dashboardapi.Repository.WidgetApiRepository;
import com.dashboard.dashboardapi.model.ParamsApiModel;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ParamsApiService {
    private final WidgetApiRepository widgetApiRepository;
    private final ParamsApiRepository paramsApiRepository;
    private final UserRepository userRepository;

    public List<ParamsApi> getAllParams(){
        return paramsApiRepository.findAll();
    }

    public ParamsApiModel createParam(ParamsApiModel paramsApiModel) {
        ParamsApi paramsApiEntity = new ParamsApi();
        paramsApiEntity.setName(paramsApiModel.getName());
        paramsApiEntity.setType(paramsApiModel.getType());
        paramsApiEntity.setWidgetApi(widgetApiRepository.findById(paramsApiModel.getId_widget()).get());
        paramsApiRepository.save(paramsApiEntity);
        return paramsApiModel;
    }

    public void deleteParam(long id) {
        paramsApiRepository.deleteById(id);
    }
}
