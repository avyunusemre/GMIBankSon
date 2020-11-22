@US08TC01
  Feature:
Scenario: user change own password
Given  Go to home page link
And Enter the username with valid credential "Team5User"
And Enter the password with valid credential "userTeam5"
And Click to Sign in button
And Click to User Account drop down menu and Click to Password
And Enter the Current Password with credential "userTeam5"
And Enter the Current Password with credential1 "userTeam5"
And Enter the Current Password with credential2 "userTeam5"
And Click to Save in button
Then conformed failed message
@US08TC02
Scenario: Change Password
Given  Go to home page link
And Enter the username with valid credential "Team5User"
And Enter the password with valid credential "userTeam5"
And Click to Sign in button
And Click to User Account drop down menu and Click to Password
And Enter the Current Password with credential "userTeam5"
And Enter the New Password "userTeam5"
And Enter the New Password Confirmation "userTeam5"
And Click to Save in button
Then Confirmed password changed message
