Feature: Login page feature

Scenario: Login page titile
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Frogot Password link
Given user is on login page
Then forgot password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "sruthireddy1002@gmail.com"
And user enters password "Sruthi123"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"

            

