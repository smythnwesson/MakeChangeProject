# Make Change

### Overview

This project should act as a cash register in a transaction. 
The console should ask for the cost of the item being purchased, then ask for the amount being tendered.
After those numbers are entered, the program should accurately calculate the appropriate amount of change and 
print the change out to the console. It will then calculate how many of each type of dollar amount from $20 down to .01 cents to distribute back to the customer, and only display the tender being distributed..
ie. change is $25.15 (Twenties: 1  Fives: 1  Dimes: 1  Nickels: 1);

### How to Use

When you run the program, the console will prompt you to enter the cost of an item being purchased. 
You will enter a number.

The console will then ask you to enter the amount you are using to pay for the item.
You will enter another number.

The program will then run and calculate exact change and will display the amount to be distributed back to the customer. 

### Technologies

* Conditionals (if-else statements)
* Modulus Operator
* Division Operator
* Scanner
* Variable types double and int
* Casting


### Lessons Learned
I realized early that I knew more than I had initially thought.

My main struggle came from figuring out how to use modulus and get the appropriate remainder 
for each dollar amount to be redistributed. After a little trial and error, 
I was able to get the whole dollar amounts to print out but was unable to see any change due.

After receiving a little help, I learned that by putting parentheses around "change * 100" on line 32, that it would allow java to read the equation before casting the double into an integer. 
