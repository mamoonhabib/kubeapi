package com.learn.kube.nameapi.service;

import com.learn.kube.nameapi.model.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
}