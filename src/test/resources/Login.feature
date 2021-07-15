@A
Feature: Validating login field of facebook application

@A
Scenario Outline: Validating login field with incorrect username and incorrect password
Given User is on facebook page
When User enters the "<username>" and "<password>"
And User should click login button
Then User should validate login page displayed or not

Examples:
|username|password|
|sdefgrth|11111111|
|sqwertyw|11111111|
|asddfcvh|11111111|
|xcvbhgfd|98765765|

@B
Scenario Outline: Validating login field with correct username and incorrect password
Given User is on facebook page
When User enters the "<username>" and "<password>"
And User should click login button
Then User should validate login page displayed or not

Examples:
|username|password|
|sdefgrth|23456234|
|sqwertyw|23456345|
|asddfcvh|23456456|
|xcvbhgfd|98765765|
@C
Scenario Outline: Validating login field with incorrect username and incorrect password
Given User is on facebook page
When User enters the "<username>" and "<password>"
And User should click login button
Then User should validate login page displayed or not

Examples:
|username|password|
|sdefgrth|23456234|
|sqwertyw|23456345|
|asddfcvh|23456456|
|xcvbhgfd|98765765|

@D
Scenario Outline: Validating login field with incorrect username and incorrect password
Given User is on facebook page
When User enters the "<username>" and "<password>"
And User should click login button
Then User should validate login page displayed or not

Examples:
|username|password|
|sdefgrth|23456234|
|sqwertyw|23456345|
|asddfcvh|23456456|
|xcvbhgfd|98765765|


