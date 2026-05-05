package com.pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucum.Baseclass;

public class SearchHotelPage extends Baseclass {
	
	public SearchHotelPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomNos;
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="Submit")
	private WebElement searchbtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}

		
	
}
