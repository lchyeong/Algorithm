x = int(input("number : "))


def fact(n):
    ans = 1
    for i in range(1, n + 1):
        ans *= i
    return ans


print(fact(x))
print(fact(1))
print(fact(5))
print(fact(10))
