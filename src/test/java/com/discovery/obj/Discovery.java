package com.discovery.obj;

import java.util.TreeMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Discovery {
	
	
	public static WebDriver driver;
	public Discovery(WebDriver driver){
		this.driver=driver;
	}
	
	
	
	By _recommendedMenu=By.xpath("//div[@class='content carousel__content showCarousel__content']/div");
	By _addFavButton=By.xpath("//div[@class='my-favorites-button-container']");
	By _showTitle=By.xpath("//h3[@class='showTileSquare__title']");
	By _showDescription=By.xpath("//div[@class='showTileSquare__description']");
	
	public static TreeMap<String, String> input=new TreeMap<String, String>();
	public static TreeMap<String, String> result=new TreeMap<String, String>();
	
	 
	
	public void selectTheVideos() throws InterruptedException {	
		WebDriverWait wait=new WebDriverWait(driver, 10);
		List<WebElement> element=driver.findElements(_recommendedMenu);
		wait.until(ExpectedConditions.visibilityOf(element.get(0)));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", element.get(0));	
		System.out.println(element.size());
		Actions ac=new Actions(driver);

		for(int i=0;i<2;i++) {
			System.out.println("i:::"+i);
			ac.moveToElement(element.get(i)).build();
			ac.pause(2000);
			element.get(i).findElements(_addFavButton).get(i).click();
			String show_title=element.get(i).findElements(_showTitle).get(i).getText();
			String show_description=element.get(i).findElements(_showDescription).get(i).getText();
			input.put(show_title,show_description);
			Thread.sleep(4000);

		}
	}
	
	public void checkForFavourite() throws InterruptedException {	
		WebDriverWait wait=new WebDriverWait(driver, 10);
		List<WebElement> element=driver.findElements(_recommendedMenu);
		wait.until(ExpectedConditions.visibilityOf(element.get(0)));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", element.get(0));	
		System.out.println(element.size());
		Actions ac=new Actions(driver);

		for(int i=0;i<2;i++) {
			System.out.println("i:::"+i);
			ac.moveToElement(element.get(i)).build().perform();
			ac.pause(2000);
			element.get(i).findElements(_addFavButton).get(i);
			String show_title=element.get(i).findElements(_showTitle).get(i).getText();
			String show_description=element.get(i).findElements(_showDescription).get(i).getText();
			
			result.put(show_title,show_description);
			Thread.sleep(4000);

		}
	}
	
	

}
