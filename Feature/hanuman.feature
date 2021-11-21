Feature: Orange Hrm function

Scenario: End to End Testing

Given userIsOnLoginPage
When userEnterValidUserName
And  UserEnterValidPassword
When UserClickOnLoginButton
Then UserIsOnHomePage
