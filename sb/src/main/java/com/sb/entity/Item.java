package com.sb.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DTYPE")
public abstract class Item {
	@Id
	@GeneratedValue
	@Column(name="ITEM_ID")
	private Long id;
	
	private String name;
	
	private int price;
	
	private int stockQunaty;

	
	
	//private List<Category> categories = new ArrayList<>();
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStockQunaty() {
		return stockQunaty;
	}

	public void setStockQunaty(int stockQunaty) {
		this.stockQunaty = stockQunaty;
	}
	

	
	
	
}
