numberOne = int(input("Enter any number "))

numberTwo = int(input("Enter another number "))

gcd = 0

lcm = 0

minimum = min(numberOne, numberTwo)

for number in range (1, minimum + 1):
    if(numberOne % number == 0 and numberTwo % number  == 0):
        gcd = number
        lcm = numberOne * numberTwo // gcd
print(lcm)
