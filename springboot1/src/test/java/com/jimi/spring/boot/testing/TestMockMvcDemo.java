package com.jimi.spring.boot.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/21 15:06
 */
@AutoConfigureMockMvc //test with mock environment
public class TestMockMvcDemo {

    @Test
    void exampleTest(@Autowired MockMvc mvc) throws Exception {
        mvc.perform(get("/")).andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }

}
