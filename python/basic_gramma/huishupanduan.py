import time
start=time.clock()
def is_palindrome(n):
    a = True
    n = str(n)
    for x in range (0,int(len(n)/2)):
        if n[x] != n[-x-1]:
            a = False
            break
    return a

output = filter(is_palindrome, range(1, 1000))
print(list(output))
end=time.clock()
print("final is in ",(end-start))