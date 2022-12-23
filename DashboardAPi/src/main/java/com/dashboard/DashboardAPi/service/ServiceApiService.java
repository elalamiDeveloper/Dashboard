package com.dashboard.dashboardapi.service;

import com.dashboard.dashboardapi.Entity.AllServiceApi;
import com.dashboard.dashboardapi.Entity.ServiceApi;
import com.dashboard.dashboardapi.Entity.UserWidgetApi;
import com.dashboard.dashboardapi.Repository.AllServiceApiRepository;
import com.dashboard.dashboardapi.Repository.ServiceApiRepository;
import com.dashboard.dashboardapi.Repository.UserRepository;
import com.dashboard.dashboardapi.Repository.UserWidgetApiRepository;
import com.dashboard.dashboardapi.model.ServiceApiModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ServiceApiService {
    private final ServiceApiRepository serviceApiRepository;
    private final AllServiceApiRepository allServiceApiRepository ;
    private final UserWidgetApiRepository userWidgetApiRepository;
    private final UserRepository userRepository;

    public List<ServiceApi> getAllServices(){
        return serviceApiRepository.findAll();
    }
    public List<AllServiceApi> getAllServicesJson(){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        List<UserWidgetApi> userWidgetApis = new ArrayList<>();
        List<AllServiceApi> allServiceApis = new ArrayList<>();

        for(UserWidgetApi userWidgetApi : userWidgetApiRepository.findAll())
            if(userWidgetApi.getUser() == userRepository.findByUsername(auth.getName())) {
                userWidgetApis.add(userWidgetApi);
                if(!allServiceApis.contains(allServiceApiRepository.findById(userWidgetApi.getWidgetApi().getServiceApi().getId())))
                    allServiceApis.add(allServiceApiRepository.findAllById(userWidgetApi.getWidgetApi().getServiceApi().getId()));
            }

        return allServiceApis;
    }
    public ServiceApiModel createService(ServiceApiModel serviceApi) {
        ServiceApi serviceApiEntity = new ServiceApi();
        BeanUtils.copyProperties(serviceApi, serviceApiEntity);
        serviceApiRepository.save(serviceApiEntity);
        return serviceApi;
    }

    public void deleteService(long id) {
        serviceApiRepository.deleteById(id);
    }
}
