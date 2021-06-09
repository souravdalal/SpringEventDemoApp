package com.blogspot.souravdalal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderEvent {
	
	
	private String itemName;
	
	private int quantity;

}
