package com.learn.kube.nameapi.model;

public class UserNotFoundException extends RuntimeException {

  public UserNotFoundException(Long id) {
    super("Could not find user " + id);
  }
}