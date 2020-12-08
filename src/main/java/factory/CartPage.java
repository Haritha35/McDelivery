package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage {
	WebDriver driver;
	//Constructor of CartPage class
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Declaring the WebElements using @FindBy
	@FindBy(xpath="//*[@id='menu-search']")
	WebElement searchItem;
	
	@FindBy(xpath="//*[@id='home-page-wrapper']/div[4]/app-search-items/div/div/div/div[3]/app-menu-items/div/app-menu-item[1]/div/div/div/app-price-section/div/div/button")
	WebElement addButton ;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/label")
	WebElement addCoke;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/p")
	WebElement removeCoke;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[3]/button[2]")
	WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id='home-page-wrapper']/div[4]/app-search-items/div/div/div/div[4]/div")
	WebElement noResultFound;
	
	@FindBy(xpath="//*[@id='home-page-wrapper']/div[5]/app-cart-card/div/div[2]/button")
	WebElement viewCartButton;
	//Entering the items to search in the search bar
	public void enterSearchItem(String item)
	{
		searchItem.sendKeys(item);
	}
	//Checking whether the add button is available or not
	public void checkAddButton()
	{
		Assert.assertTrue(addButton.isDisplayed());
	}
	//Clicking on the add button
	public void clickAddButton()
	{
		addButton.click();
	}
	//Adding the Coke
	public void clickAddCoke()
	{
		addCoke.click();
	}
	//Removing the Coke
	public void clickRemoveCoke()
	{
		removeCoke.click();
	}
	//Clicking on adding items to cart
	public void clickAddToCartButton()
	{
		addToCartButton.click();
	}
	//Check whether the cart is viewed
	public void checkViewCartButton()
	{
		Assert.assertTrue(viewCartButton.isDisplayed());
	}
	//Check whether the results are found or not
	public void checkNoResultFound()
	{
		Assert.assertTrue(noResultFound.isDisplayed());
	}	
}

	


