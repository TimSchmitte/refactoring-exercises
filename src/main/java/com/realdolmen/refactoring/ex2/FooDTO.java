package com.realdolmen.refactoring.ex2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FooDTO {
    private String baz;

    public FooDTO(String baz) {
        this.baz = baz;
    }

    public String getBaz() {
        return baz;
    }
}
