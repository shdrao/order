package com.capgemini.orders;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.capgemini.orders.controller.OrderController;
import com.capgemini.orders.service.impl.OrderServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ControllerTest {
	@InjectMocks
	private OrderController orderController;
	
	MockMvc mockMvc;
	
	@Mock
	private OrderServiceImpl orderServiceImpl;
	
	

}
