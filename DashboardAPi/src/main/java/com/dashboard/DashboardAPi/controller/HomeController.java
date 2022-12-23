package com.dashboard.dashboardapi.controller;

import com.dashboard.dashboardapi.Entity.AllServiceApi;
import com.dashboard.dashboardapi.model.*;
import com.dashboard.dashboardapi.service.CustomUserDetailsService;
import com.dashboard.dashboardapi.service.ServiceApiService;
import com.dashboard.dashboardapi.utility.JWTUtility;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.util.List;

@RestController
@AllArgsConstructor
public class HomeController {

    private JWTUtility jwtUtility;
    private final ServiceApiService serviceApiService;

    private AuthenticationManager authenticateManager;

    private CustomUserDetailsService userService;

    @GetMapping("/home")
    public String home() {
        return ("Welcome to Dashboard");
    }

    @GetMapping(value = "/about.json")
    public @ResponseBody MyJsonFile getAboutJson(HttpServletRequest request){
         return new MyJsonFile(
                 new MyClientFile(request.getRemoteAddr()),
                 new MyServerFile(Instant.now().toEpochMilli(),serviceApiService.getAllServicesJson())
         ) ;
    }

    @PostMapping("/login")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
        try {
            authenticateManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid credentials", e);
        }
        final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUsername());
        final String token = jwtUtility.generateToken(userDetails);
        return new JwtResponse(token);
    }

    @PostMapping("/signup")
    public Object createEmployee(@RequestBody UserModel user) {
        user.setRole("USER");
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userService.createEmployee(user);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
