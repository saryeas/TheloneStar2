Feature: Delta airline validation.


@Dalta
Scenario Outline::

Given user launch URL
When click TureBlue And click join today and enter valid  "<email>" and click next
Then able to see sing up 

Examples:
|        email       |
| shormir15@gmail.com|