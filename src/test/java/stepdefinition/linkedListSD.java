package stepdefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import pageobjects.linkedList;
import pageobjects.reusablePage;
import utilities.LoggerLoad;
import utilities.configReader;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class linkedListSD {
	
	linkedList link=new linkedList();
	String Excelpath = configReader.getexcelfilepath();
	static String expectedMsg;
	reusablePage reusecode = new reusablePage();
	
	
	//TS_LL_02
	@When("The user clicks getstarted for LinkedList module")
	public void the_user_clicks_getstarted_for_linkedlist_moduke() {
		LoggerLoad.info("The user select Linked List from the drop down menu");
		link.dropdown_LinkedList();
	}

	@Then("The user redirected to {string}  Page")
	public void the_user_redirected_to_page(String pagename) {
		LoggerLoad.info("User redirected to linked list data structure Page ");
		String Title = link.getLinkedListPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertNotEquals(Title, pagename, "Titles do not match");
	}
	
	
	//TS_LL_03

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		link.click_introduction();
	}

	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String pagename) {
		LoggerLoad.info("User redirected to the Page " + pagename);
		String Title = link.getLinkedListPageTitle();
		LoggerLoad.info("Title of current page is checking:" + Title);
		assertEquals(Title, pagename, "Title match");
	}
	
	
	//TS_LL_04
	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String string,String string2) {
		reusecode.click_Tryhere();
	}

	@Then("The user redirected to the page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = link.getLinkedListPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Titles match");
	}

	// TS_LL_07, TS_LL_08, TS_LL_09, TS_LL_10
	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() {
		link.click_creatingLinkedList();
	}

	// TS_LL_11, TS_LL_12, TS_LL_13, TS_LL_14
		@When("The user clicks the Types of Linked List button")
		public void the_user_clicks_the_types_of_linked_list_button() {
			link.click_typesOflLinkedList();
		}

		// TS_LL_15, TS_LL_16, TS_LL_17, TS_LL_18
		@When("The user clicks the Implement Linked List in Python button")
		public void the_user_clicks_the_implement_linked_list_in_python_button() {
			link.click_implementlinkedListInPython();
		}

		// TS_LL_19, TS_LL_20, TS_LL_21, TS_LL_22
		@When("The user clicks the Traversal button")
		public void the_user_clicks_the_traversal_button() {
			link.click_traversal();
		}

		// TS_LL_23, TS_LL_24, TS_LL_25, TS_LL_26
		@When("The user clicks the Insertion button")
		public void the_user_clicks_the_insertion_button() {
			link.click_insertion();
		}

		// TS_LL_27, TS_LL_28, TS_LL_29, TS_LL_30
		@When("The user clicks the Deletion button")
		public void the_user_clicks_the_deletion_button() {
			link.click_deletion();
		}

		// TS_LL_31
		@When("The user clicks on the Practice Questions")
		public void the_user_clicks_on_the_practice_questions() {
			link.click_practiceQuestion();
		}

		@Then("The user should be directed to Practice Questions of Linked List Page")
		public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
			String Title = link.getLinkedListPageTitle();
			LoggerLoad.info("Title of current page is :" + Title);
			assertEquals(Title, "Practice Questions", "Title do not match");
			LoggerLoad.info("NO questions found ");
		}
		
		@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
		public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
			String Title = link.getpageTitle();
			LoggerLoad.info("Title of current page is : " + Title);
			assertEquals(Title, "Assessment", "Title do not match");
		}
		
		@Then("The user should get the error message")
		public void the_user_should_get_the_error_message() {
			String actualMsg = link.getErrormsg();
			LoggerLoad.info("Actual result  :" + actualMsg);
			assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
		}

	}