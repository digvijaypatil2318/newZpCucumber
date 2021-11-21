Feature: check instagram login functionality

Scenario Outline: Sanity testing 
When EnterValid"username"and"password"
Then userIsOnHomePage

Examples:

|username|password|
|digvijy|digvijay@s|
|radha|radha@s|
|pranita|pranita@s|
|sham|bhSBD@s|
|ganesh|ljhjkdb@c| 