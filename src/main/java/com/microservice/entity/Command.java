package com.microservice.entity;

import javax.persistence.*;

@Entity(name = "Command")
public class Command {

	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	private Long commandId;
	@Column(nullable = false)
	private double price;
	@Column(nullable = false,length = 50)
	private String currency;
	@Column(nullable = false,length = 50)
	private String method;
	@Column(nullable = false,length = 50)
	private String intent;
	@Column(nullable = false,length = 50)
	private String description;
	public Long getId() {
		return commandId;
	}
	public void setId(Long id) {
		commandId = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getIntent() {
		return intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
