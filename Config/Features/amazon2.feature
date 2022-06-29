Feature: amazon search bar validation


@search
Scenario:
Given User goes to to Amazon HomePage
When User enter goes to search bar and type "gift card"
Then User rederects to the gift card search page 
