package com.loginForm.springboot.service;


import com.loginForm.springboot.Registration.UserModel;
import com.loginForm.springboot.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User registerUser(UserModel userModel);

    String determineSuitableCrop(Long userId);

    String addNutrientTypeToUser(Long userId, String cropName);

    User getUserByEmail(String email);

}
