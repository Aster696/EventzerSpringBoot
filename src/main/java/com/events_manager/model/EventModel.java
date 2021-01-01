package com.events_manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "events")
public class EventModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int eventId;
	@Column(name = "Name", unique = true)
	private String eventName;
	@Column(name = "Category")
	private String category;
	@Column(name = "Description", length = 99999)
	private String description;
	@Column(name = "Date")
	private String date;
	@Column(name = "Start_Time")
	private String timeIn;
	@Column(name = "End_Time")
	private String timeOut;
	@Column(name = "Images", length = 99999)
	private String images;

	@ManyToOne()
	private UserModel user;
	
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}
	
	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}
	
	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "EventModel [eventId=" + eventId + ", eventName=" + eventName + ", category=" + category
				+ ", description=" + description + ", date=" + date + ", timeIn=" + timeIn + ", timeOut=" + timeOut
				+ ", images=" + images + ", user=" + user + "]";
	}

}
