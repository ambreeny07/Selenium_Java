package com.vetscout.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.utilities.Waits;

public class ExcerciseObjectsPage extends BaseClass {
	@FindBy(xpath = ("//div[@data-index='3']//div[@style='display: flex; padding-top: 10px;']"))
	List <WebElement> vendorsShowing;
	public ExcerciseObjectsPage() {
		PageFactory.initElements(driver, this);
	}
}
