package com.web.springcloud.Controllers;

import com.web.springcloud.Services.GreetingService;
import com.web.springcloud.Services.NameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
  @Autowired
  private NameService nameService;
  @Autowired
  private GreetingService greetingService;

  @GetMapping(value = { "/hello", "/hello/{name}" })
  public String index(@PathVariable(required = false) String name) {
    // If name isn't present, it gets passed as null
    // In this case to make use of the logic in the Name service, convert this to an
    // empty string before passing it through
    if (name == null) {
      name = "";
    }
    String greeting = new StringBuilder().append(greetingService.getGreeting()).append(" ")
        .append(nameService.getName(name)).toString();
    return greeting;
  }
}
