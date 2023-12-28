@Stack
Feature: Stack: Luanch the DS-Algo portal and test Stack module
  
 	@TS_stack_01
  Scenario: The user is logged in to DS Algo portal
   Given The user is on Signin page of DS Algo portal
    When The user enter valid "arshsquashers@gmail.com" and "Welcome12#"
    And The user click on login button
    Then The user redirected to homepage

   @TS_stack_02
  Scenario: The user is directed to "Stack" Page
    Given The user is on the "home page" after logged in
    When The user selects Stack item from the drop down menu
    Then The user should be directed to "Stack" Page

  @TS_stack_03
  Scenario: The user is able to navigate to "Operations in Stack" page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Operations in Stack link
    Then The user should then be directed to "Operations in Stack" Page

  @TS_stack_04
  Scenario: The user is able to navigate to a page having an tryEditor from Operations in Stack page
    Given The user is on the "Operations in Stack page" after logged in
    When The user clicks "Try Here" button in "stack" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_stack_05
  Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_stack_06
   Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_stack_07
  Scenario: The user is able to navigate to "Implementation" Page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Implementation button
    Then The user should be directed to Implementation Page

  @TS_stack_08
  Scenario: The user is able to navigate to Implementation page having an tryEditor 
    Given The user is on the "Stack Implementation page" after logged in
    When The user clicks "Try Here" button in "stack Implementation" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_stack_09
    Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_stack_10
   Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_stack_11
  Scenario: The user is able to navigate to "Applications" in stack Page
    Given The user is on the "Stackpage" after logged in
    When The user clicks on the Applications button
    Then The user should be directed to Applications Page

  @TS_stack_12
  Scenario: The user is able to navigate to Applications page having an tryEditor
    Given The user is on the "Application stack page" after logged in
    When The user clicks "Try Here" button in "stack Applications" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_stack_13
  Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_stack_14
   Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_stack_15
  Scenario: The user is able to navigate to "Practice Questions" in stack Page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Practice Questions button
    Then The user should be directed to Practice Questions  Page    