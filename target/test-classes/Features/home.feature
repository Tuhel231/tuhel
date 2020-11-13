Feature: home page

@T
Scenario: Verification the financing page
Given Lanuch "<URL>"
Then mouse over to financing link
Then click on For Business Purchases
Then Click on Apply For Dell Business Credit
Then verify the page

@T
Scenario Outline: Verification if user can create an account
Given Lanuch "<URL>"
Then Click on Sign in
Then Click on Create Account
Then Enter "<First Name>","<Last Name>", "<E-Mail>","<NewPassword>"
Then Click create AccountTwo



Examples: 
|First Name||Last Name||E-Mail||NewPassword|
|Tuhel||Haque||TuhelHaque20@gmail.com||Tuhel12345|

@T
Scenario: Verification 
Given Lanuch "<URL>"
Then verify title


