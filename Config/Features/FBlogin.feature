Feature: FBlogin

User want to log in FB
In order to Sign in FB
As a register user
I want to enter E-Mail Address, password, and click sign-in to login
@UserFB
Scenario Outline: Positive login with valid E-Mail Address and Password
Given User visit FB homepage
When user type valid "<E-Mail Address>" and valid "<password>"
And click login button
Then user should be able to enter

Examples:

| E-Mail Address       | password  |
|shormi_r15@yahoo.com  | Covid@2020|

