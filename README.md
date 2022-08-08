# Lycherl Number Kata
## What is a Lychrel Number
A Lychrel number is a natural number that cannot form a palindrome through the iterative process of repeatedly reversing its digits and adding the resulting numbers. 
This process is sometimes called the 196-algorithm, after the most famous number associated with the process.
### Examples
- All numbers less than 10 are palandromic and are not a Lychrel Number
- 56 becomes palindromic and is not a Lychrel Number after one iteration: 56+65 = 121
- 57 becomes palindromic and is not a Lychrel Number after two iterations: 57+75 = 132, 132+231 = 363
- The smallest number that is not known to form a palindrome is 196. It is the smallest Lychrel number candidate.
## How to do this Kata
### Step 1 : is a number Lychrel after the first iteration ?
Write a method isLychrel that tells if a number is Lychrel after the first iteration
### Step 2 : is a number Lychrel after 1000 iterations ?
Write a method isLychrel that tells if a number is Lychrel with limit of 1000 iterations
### Step 3 : is a number Lychrel after 100000 iterations ?
Write a method isLychrel that tells if a number is Lychrel with limit of 100000 iterations
### Step 4 : do it all with Java Stream API
Use Java Stream API to implement your algorithm
### Step 5 : make it fast
Try to optimise your algorithm
