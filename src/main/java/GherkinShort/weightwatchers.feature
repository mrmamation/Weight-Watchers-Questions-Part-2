Feature: Weightwatchers Website Functions

Scenario: Weightwatchers Login Test

Given user is already on landing page
When title of landing page contains Weight Loss Program, Recipes & Help | Weight Watchers
Then user clicks on Find A Meeting
And user verifies web page contains Get Schedules & Times Near You
Then user enters text in the search field and clicks search
Then print result title and distance and verify
Then print TODAY’s hours of operation
Then close the browser

#if you want to test multiple zipcodes you can make a list through Examples keyword