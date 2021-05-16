package com.web.springcloud.Controllers;

import javax.servlet.http.HttpServletRequest;

import com.web.springcloud.Services.GreetingService;
import com.web.springcloud.Services.NameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;

@RestController
public class WebController {
  @Autowired
  private NameService nameService;
  @Autowired
  private GreetingService greetingService;

  @GetMapping("/locale")
  public String index(HttpServletRequest request) {
    String locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request).toLanguageTag();
    String greeting = new StringBuilder().append(greetingService.getGreeting(locale)).append(" ")
        .append(nameService.getName()).toString();
    return greeting;
  }
}
