package stepdefinition;

import static org.testng.Assert.assertEquals;

import pageobjects.homePage;
import pageobjects.reusablePage;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Graph_Page;
import utilities.LoggerLoad;
//import utilities.configReader;

public class GraphSD {
	
	Graph_Page GraphPage = new Graph_Page();
	homePage home= new homePage();
	String expectedMsg;
	reusablePage reusecode = new reusablePage();

//GraphScenario_1:The user is logged in to DS-Algo portal  - reusablePage
//GraphScenario_2:The user is able to navigate to Graph home page
@When("The user clicks on the Get Started button on Graph or select Stack item from the drop down menu")
	public void the_user_clicks_on_the_get_started_button_on_graph_or_select_stack_item_from_the_drop_down_menu() {
		home.getStartedForModule("Graph");
		LoggerLoad.info("User is in Graph module page");
	}

@Then("The user is redirected to the {string} page")
	public void the_user_is_redirected_to_the_page(String string) {
		String Title = GraphPage.getGraphPageTitle();
		LoggerLoad.info("title of current page : " + Title);
		assertEquals(Title, "Graph", "Title not matched");
	}

//GraphScenario_3:The user is able to navigate to Graph Graph page
@When("The user clicks on the Graph link on Graph page")
	public void the_user_clicks_on_the_graph_link_on_graph_page() throws InterruptedException {
		Thread.sleep(1000);
		GraphPage.clickOnGraphLink();
	}

@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		String Title = GraphPage.getGraphPageTitle();
		LoggerLoad.info("Title of the current page is : " + Title);
		assertEquals(Title, "Graph", "Title not matched");
	}

//GraphScenario_4:The user should be redirected to try-editor page with run button to test python code
@When("The user clicks on {string} button on {string} page")
	public void the_user_clicks_on_button_on_page(String string, String string2) {
		reusecode.click_Tryhere();	
		LoggerLoad.info("User clicked on Graph Try here Button");
	}

@Then("The user should be redirected to tryEditor page with Run button")
	public void the_user_should_be_redirected_to_try_editor_page_with_run_button() {
		String Title = GraphPage.getGraphPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		System.out.println(Title);
		assertEquals(Title, "Assessment", "Title not matched");	   
	}
//GraphScenario_5 and 9: The user is able to run code in Editor for Graph page - reusablePage
//GraphScenario_6 and 10:The user is presented with error message for invalid code in Editor for Graph page  - reusablePage

//GraphScenario_7:The user is able to navigate to graph page and click on Graph Representations link
@When("The user clicks on Graph Representations link")
	public void the_user_clicks_on_graph_representations_link() throws InterruptedException {
		Thread.sleep(1000);
		GraphPage.clickOnGraphRepresentationsLink();
		LoggerLoad.info("user is in Graph Representation Page");
	}

@Then("The user is navigated to {string} page")
	public void the_user_is_navigated_to_page(String string) throws InterruptedException {
		String Title = GraphPage.getGraphPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Graph Representations", "Title not matched");
		//Thread.sleep(2000);
	}

//GraphScenario_8:  The user should be redirected to try-editor page with run button to test python code - reusablePage

//GraphScenario_11:The user is able to navigate to graph url and click on Practice Questions
@When("the user clicks on Practice Questions link")
	public void the_user_clicks_on_practice_questions_link() throws InterruptedException {
		Thread.sleep(1000); 
		GraphPage.clickOnGraphPracQuesLink();	
		LoggerLoad.info("user is in practice Questions Page");
	}

@Then("The user is directed to {string} page")
	public void the_user_is_directed_to_page(String string) {
		String Title = GraphPage.getGraphPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title not matched"); 
	}
}
