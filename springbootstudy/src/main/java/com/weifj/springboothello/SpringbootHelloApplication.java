package com.weifj.springboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author weifj
 */
@SpringBootApplication
@RestController
public class SpringbootHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloApplication.class, args);
    }

    /**
     * hello world
     *
     * @return  hello
     */
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return  new ResponseEntity<>("hello world", HttpStatus.OK);
    }

}
