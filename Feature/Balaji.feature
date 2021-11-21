Feature: navigating from one url to other

@SanityTesting
Scenario: Sanity testing
Given userIsOnLoginpage
When userEnterValidUsernameandValidPassword


@EndToEndTesting
Scenario: EndEndTesting
When UserNavigateToInstagram
Then UserEntervalidUserNameAndPassword
