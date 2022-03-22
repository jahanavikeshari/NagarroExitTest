@tags
Feature: 
  Verify Adding of buttons

  @reverse
  Scenario: 
    

    Given User is on API Demos starting page.
    When The user will click on Animation.
   	And The user will click Reversing.
   	And User will select on Play ball starts moving in downwards direction.
   	And User will click on Reverse.
   	Then ball will go to its initial position. 
