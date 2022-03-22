@tags
Feature: 
  Verify Hiding of buttons

  @hide
  Scenario: 
    

    Given User is on API Demos starting page.
    When The user will click on Animation.
   	And The user will click Hide-ShowAimations.
   	And User will select on Hide(Gone)checkbox.
   	And User will click on all four buttons and the buttons get hide.
    And The User will click on Show buttons to show all the hidden buttons .
    Then All the Hidden buttons will show.
    
   