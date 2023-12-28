@Queue
Feature: Queue feature
  
@Queue1
   Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "arshsquashers@gmail.com" and "Welcome12#"
    And The user click on login button
    Then The user redirected to homepage
    
@Queue2
  Scenario: Navigating to Queue page  
    Given The user is on the "home page" after logged in
    When The user clicks on the Get Started button below Array
    Then The user is redirected to "Queue" Page
    
@Queue3
    Scenario: Navigating Implementation of Queue in Python page 
    Given The user is in "Queue" page 
    When The user clicks Implementation of Queue in Python link
    Then The user is redirected to "Implementation of Queue in Python" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page

@Queue4
 	  Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

@Queue5
  	Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
@Queue6
    Scenario: Navigating Implementation using collections.deque page 
    Given The user is in "Queue" page 
    When The user clicks Implementation using collections.deque link
    Then The user is redirected to "Implementation using collections.deque" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
@Queue7
 	  Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

@Queue8
  	Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
@Queue9
    Scenario: Navigating Implementation using array page 
    Given The user is in "Queue" page 
    When The user clicks Implementation using array link
    Then The user is redirected to "Implementation using array" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
@Queue10
 	  Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

@Queue11
  	Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
@Queue12
    Scenario: Navigating Queue Operations page 
    Given The user is in "Queue" page 
    When The user clicks Queue Operations link
    Then The user is redirected to "Queue Operations" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page

@Queue13
 	  Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

@Queue14
  	Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
@Queue15
    Scenario: The user is able to click and navigate to Practice Questions
    Given The user is in "Implementation of Queue in Python" page 
    When The user clicks Practice Questions link
    Then The user is redirected to "Practice Questions Queue" page
