package com.Lilaniya.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tutorial {
	
	private String id;
	private String title;
	private String description;
	private boolean published;
	
	
	public Tutorial(String id, String title, String description, boolean published) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.published = published;
	}

	@Id
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean getPublished() {
		return published;
	}


	public void setPublished(boolean published) {
		this.published = published;
	}
	
	
	
	

}
