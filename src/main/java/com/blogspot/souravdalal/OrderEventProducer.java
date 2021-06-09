package com.blogspot.souravdalal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class OrderEventProducer {
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	public void publishTestEvent() {
		
		OrderEvent order = new OrderEvent();
		order.setItemName("Pen");
		order.setQuantity(5);
		
		log.info("Puslishing order");
		publisher.publishEvent(order);
		
	}

}
