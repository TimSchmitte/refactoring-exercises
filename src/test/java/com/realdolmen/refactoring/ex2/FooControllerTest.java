package com.realdolmen.refactoring.ex2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Iterator;


public class FooControllerTest {
    @Test
    void testFooContract() throws Exception {
        JsonNode jsonNode = fetchFoos();

        Iterator<JsonNode> contents = jsonNode.elements();
        JsonNode element1= contents.next();
        JsonNode element2 = contents.next();

        JsonNode bar = element1.get("bar");
        Assertions.assertThat(bar.asText()).isEqualTo("bar1");


        JsonNode bar2 = element2.get("bar");
        Assertions.assertThat(bar2.asText()).isEqualTo("bar2");
    }

    private JsonNode fetchFoos() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new FooController()).build();
        ResultActions perform = mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET, "/foos"));
        MvcResult mvcResult = perform.andReturn();

        String contentAsString = mvcResult.getResponse().getContentAsString();

        return new ObjectMapper().readTree(contentAsString);
    }
}
