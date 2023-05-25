package com.cody;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @GetMapping("/")
  public GreetResponse greet() {
    GreetResponse response = new GreetResponse(
        "Hello",
        List.of("Java", "JavaScript", "TypeScript"),
        new Person("Cody"));
    return response;
  }

  record Person(String name) {
  }

  record GreetResponse(String greet, List<String> favProgrammingLang, Person person) {
  }

}
