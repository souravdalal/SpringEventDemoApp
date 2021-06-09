package com.blogspot.souravdalal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.var;

public class EventMgmtMain {

	public static void main(String[] args) {
		  try ( var ctx = new AnnotationConfigApplicationContext()){
	        ctx.scan("com.blogspot.souravdalal");
	        ctx.refresh();
	        
	        var bean = ctx.getBean(OrderEventProducer.class);
	        
	        bean.publishTestEvent();
		  }

	}

}
