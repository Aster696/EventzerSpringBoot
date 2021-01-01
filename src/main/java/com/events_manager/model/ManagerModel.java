package com.events_manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "event_manager")
public class ManagerModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerId;
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	UserModel user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	EventModel event;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
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

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public EventModel getEvent() {
		return event;
	}

	public void setEvent(EventModel event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "ManagerModel [managerId=" + managerId + ", eventName=" + eventName + ", category=" + category
				+ ", description=" + description + ", date=" + date + ", timeIn=" + timeIn + ", timeOut=" + timeOut
				+ ", images=" + images + ", user=" + user + ", event=" + event + "]";
	}
	
}
