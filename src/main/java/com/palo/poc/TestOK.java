package com.palo.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOK {
  @RequestMapping("/")
  private String testOK(){
    return "Test OK!";
  }

}