#Autor: Andrés Camilo Romero Ruiz

@UserStory_PopupForm
  Feature: Verify Validation form for colorlib
    ME as user WANT to enter the colorlib page TO verify the form Popup Validation

    @Valid_Popup_Form
    Scenario Outline: Verify the validation Popup form
      Given I enter with my credentials
        |user|password|
        |<user>|<password>|
      When I proceed with the authentication
      And deploy submenu of Forms
      And choose Form Validation
      And check the title of the form on the screen
      And fill all Popup fields
        |Required|Select|MultipleSelect|Url|Email|Password|ConfirmPassword|MinField|MaxField|Num|Ip|Date|DateE|
        |<Required>|<Select>|<MultipleSelect>|<Url>|<Email>|<Password>|<ConfirmPassword>|<MinField>|<MaxField>|<Num>|<Ip>|<Date>|<DateE>|
      And click button validate
      Then field required will be empty

      Examples:
        |user|password|Required|Select|MultipleSelect|Url|Email|Password|ConfirmPassword|MinField|MaxField|Num|Ip|Date|DateE|
        |admin|admin|prueba |option2|option3|http://dfsdfd.com|a@q.com|123|123 |1234567|null|123|192.168.3.0|2010-12-01|2010/12/01|
