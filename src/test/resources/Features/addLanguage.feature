Feature: Language

@smoke3
Scenario: Add Different Language

# Given open the browser and launch HRMS application
When user enters a valid email and password
And click on Login Button
And User clicks on Admin button
When User navigates to Qualification
And User selects Language option
And User clicks on Add button
And User adds a Language into selected box
And User clicks on save button
  And query the language information in backend
  Then verify the language results from frontend and backend