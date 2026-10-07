package example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import webtest.selenium.api.Page;
import webtest.selenium.api.PageElement;
import webtest.selenium.api.SeleniumTest;

public class SearchTest extends SeleniumTest {
	private static Logger logger = LoggerFactory.getLogger(SearchTest.class);

	
	
	@Test
	public void body() {
		var _pageStack = new ArrayList<Page>();
		var _page = new Page(driver, driver);
		driver.navigate().to("https://duckduckgo.com/");
		search("jwst");
		sleep(2);
	}
	
	private void search(String text) {
		var _pageStack = new ArrayList<Page>();
		var _page = new Page(driver, driver);
		new PageElement(_page, "input", "q").fill(text);
		new PageElement(_page, "button", "Search").click();
	}
	
}
