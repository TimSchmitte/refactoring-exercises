package com.realdolmen.refactoring.ex1;

import java.util.ArrayList;
import java.util.List;

public class FooService {

    public List<Foo> foos = new ArrayList<>();


    public List<Foo> getFoos() {
        return foos;
    }
}
