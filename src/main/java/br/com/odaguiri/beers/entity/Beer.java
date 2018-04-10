package br.com.odaguiri.beers.entity;

import java.io.Serializable;

public class Beer implements Serializable {

	private static final long serialVersionUID = 7035518683687399362L;
	
	private Integer id;
	private String name;
	private String type;
	private String label;
	
	public Beer(Integer id,String name, String type, String label) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.label = label;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
