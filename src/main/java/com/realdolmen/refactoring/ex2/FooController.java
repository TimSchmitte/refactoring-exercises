package com.realdolmen.refactoring.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FooController {

    @GetMapping("foos")
    public List<FooDTO> getFoos(){
        return List.of(new FooDTO("bar1"), new FooDTO("bar2"));
    }
}
