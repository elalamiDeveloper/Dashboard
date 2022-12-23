package com.dashboard.dashboardapi.service;

import com.dashboard.dashboardapi.Entity.UserWidgetApi;
import com.dashboard.dashboardapi.Repository.*;
import com.dashboard.dashboardapi.model.UserWidgetApiModel;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class UserWidgetApiService {
    private final UserWidgetApiRepository userWidgetApiRepository;
    private final WidgetApiRepository widgetApiRepository;
    private final ParamsApiRepository paramsApiRepository;
    private final UserRepository userRepository;

    public List<UserWidgetApi> getAllUserWidgets(){
        return userWidgetApiRepository.findAll();
    }

    public List<UserWidgetApi> getThisUserWidgets(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        List<UserWidgetApi> userWidgetApis = new ArrayList<>();

        for(UserWidgetApi userWidgetApi : userWidgetApiRepository.findAll())
            if(userWidgetApi.getUser() == userRepository.findByUsername(auth.getName()))
                userWidgetApis.add(userWidgetApi);

        return userWidgetApis;
    }

    public UserWidgetApiModel createUserWidget(UserWidgetApiModel userWidgetApiModel) {
        UserWidgetApi userWidgetApiEntity = new UserWidgetApi();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        userWidgetApiEntity.setValue(userWidgetApiModel.getValue());
        userWidgetApiEntity.setWidgetApi(widgetApiRepository.findByName(userWidgetApiModel.getName_widget()));
        userWidgetApiEntity.setUser(userRepository.findByUsername(auth.getName()));
        if(userWidgetApiModel.getName_param()!=null)
            userWidgetApiEntity.setParamsApi(paramsApiRepository.findByNameAndAndWidgetApi(
                    userWidgetApiModel.getName_param(),
                    userWidgetApiEntity.getWidgetApi()
            ));
        userWidgetApiRepository.save(userWidgetApiEntity);
        return userWidgetApiModel;
    }

    public void deleteUserWidget(long id) {
        userWidgetApiRepository.deleteById(id);
    }
}
