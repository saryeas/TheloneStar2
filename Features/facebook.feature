Feature: Facebook sign up
@select3
Scenario Outline:
Given user visiting facebook url
When user enter "<First name>" and"<Last name>" and valid "<email address>" and "<new password>"
Then user select dropdown Month and dropdown Day and dropdown Year

Examples:
|First name| Last name| email address   |new password|Month  |Day|Year|
|Amy       | Bari     |esdy@gmail.com   |class@2020  |6      |6  |1999|