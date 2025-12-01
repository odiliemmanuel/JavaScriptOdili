number = int(input("Enter any number "))

factor = 0

for count in range(1, number):
    if(number % count == 0):
        factor += count
if(number == factor):
    print("Perfect Number")  
else:
    print("Not a Perfect Number")  
