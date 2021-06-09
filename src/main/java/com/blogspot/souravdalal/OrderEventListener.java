package com.blogspot.souravdalal;

import java.util.concurrent.TimeUnit;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Component
@Log4j
@EnableAsync
public class OrderEventListener {
	
	
	@Async
	@EventListener
	@Order(1)
	public void sendEmailToCustomer(OrderEvent event) {
		log.info("Starting email sending");
		delay();
		log.info("sendEmailToCustomer:" + event);
	}

	@EventListener
	@Order(2)
	public void makePayment(OrderEvent event) {
		log.info("makePayment:" + event);
	}
	

	
	private void delay() {

		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
