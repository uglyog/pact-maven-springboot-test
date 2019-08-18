package com.github.uglyog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {

  @RequestMapping("/greeting")
  public Map<String, Object> greeting() {
    Map<String, Object> map = new HashMap<>();
    map.put("name", "ç é à í");
    return map;
  }

}
