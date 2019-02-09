Feature: login into the facebook

Scenario: Login to Facebook
Given I navigate to Facebook
When I put username and password
And I click on Login button
Then I should be on Home Page with Title