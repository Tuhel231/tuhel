Feature: search funtinality





Scenario: Verify Login

Given Launch "<URL>"
Then click on signin Link
Then click on signin botton
Then Enter the UserPass and click login
Then Verify user login succesfully


Scenario: Verify financing link

Given Launch "<URL>"
Then mouse over to financing link
Then click on For Business Purchases
Then Click on Apply For Dell Business Credit
Then verify the page


Scenario: VeryfyTitle
Given Launch "<URL>"
Then verify Title

@Test
Scenario Outline: 
Given Launch "<URL>"
Then Click on Sign In
Then Click on Create Account
Then Enter "<First Name>", "<Last Name>", "<E-mail>","<NewPassword>"
#Then Click Create AccountTwo



Examples:
|First Name||Last Name||E-mail||NewPassword|
|Tuhel||Haque||Tuhelhaque20@gmail.com||Tuhel12345|
























