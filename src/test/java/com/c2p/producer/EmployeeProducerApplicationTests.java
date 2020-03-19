package com.c2p.producer;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
class EmployeeProducerApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	@Test
	void contextLoads() {
		//Mockito.wh
	}

}
