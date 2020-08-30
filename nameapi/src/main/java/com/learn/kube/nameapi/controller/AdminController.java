package com.learn.kube.nameapi.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
class AdminController {

  @GetMapping("/version/info")
  Map<String, String> geVersiont() {

    HashMap<String, String> map = new HashMap<>();
    map.put("version", "2.1-"+new Date().getTime());
    return map;
  }
}