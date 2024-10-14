# problem_2_code.py
# LONG QUIZ

# Created by Lester Dann Lopez on 10/14/24.


def isPrime(x):
    if x <= 1:
        return False
    i = 2 #Starts at 2
    while(i <= x//2): #x / 2 = float,  x//2 = integer
        if(x % i == 0):
            return False
        i+=1 #increment i
    return True

#Output written in file

with open("problem_1_output.txt", "w") as file:
    for i in range(1, 10000+1):
        if(isPrime(i)):
            file.write(f"{i}\n")
print("Prime numbers have been written to problem_1_output.txt")
