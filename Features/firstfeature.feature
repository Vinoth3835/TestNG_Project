Feature: Google search functionality

Scenario: validating the search functionality in google with Laptop as search item

Given open an chrome browser
And load the google URL
When in search text box provide laptop as search item and press ENTER key
And take snapshot of the search result
Then validate the outcome


Scenario: validating the search functionality in google with dynamic search item

Given open an chrome browser
And load the google URL
When in search text box provide "Iphone phones" as search item and press ENTER key
And take snapshot of the search result
Then validate the outcome


