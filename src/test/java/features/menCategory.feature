Feature: select product from men's section

@firstScenario
Scenario: Get total number of shirts from Mens category
Given Go to Mens category
When Select a shirt Section
Then Get total number of shirts

@secondScenario
Scenario Outline: Select a Shirts and add to bag
Given Select <shirtName> and mousehover on shirt image
When Select size and click on add to bag
Then Check number of items added into cart and badge digit are equal
Examples:
|shirtName|
|Zebra Print Cuban Collar Shirt|