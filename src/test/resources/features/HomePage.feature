Feature: Practice home page features

  Scenario: Practice home page Title Verification
    Given User is on Practice home page
    Then User sees Practice in the window title

  Scenario: Practice home page Header Verification
    Given User is on Practice home page
    Then User sees Test Automation Practice is in the main header

  Scenario: Practice home page Subtitle Verification
    Given User is on Practice home page
    Then User sees Available Examples is in the subtitle

  Scenario: Practice home page Home Link Verification
    Given User is on Practice home page
    Then User access Home link on top of the Page

  Scenario: Practice home page Cydeo Link Verification
    Given User is on Practice home page
    Then User access CYDEO link on the bottom of the Page


  Scenario Outline: list of practice links verification
    Given User is on Practice home page
  Then user clicks on each "<linkOption>" from the page
   # And user verify if the "<linkOption>" are displayed
  Examples:
    | linkOption                   |
    | A/B Testing                   |
   # | Add/Remove Elements           |
    #| Autocomplete                  |
  #  | Basic Auth                    |
   # | Broken Images                 |
  #  | Challenging DOM               |
   # | Checkboxes                    |
  #  | Context Menu                  |
