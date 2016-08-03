package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private int total;
	private int gold;
	private int silver;
	private int bronze;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int medals) {
		this.total = medals;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int medals) {
		this.gold = medals;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int medals) {
		this.silver = medals;
	}

	public int getBronze() {
		return bronze;
	}

	public void setBronze(int medals) {
		this.bronze = medals;
	}
}
