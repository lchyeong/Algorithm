a = int(input("a : "))
b = int(input("b : "))


def gcd(x, y):
    i = 0
    if x < y:
        i = x
    else:
        i = y

    for i in range(i, 0, -1):
        if x % i == 0 and y % i == 0:
            return i

print(gcd(a, b))

# def gcd(a, b):
#     if b == 0:
#         return a
#     return gcd(b, a % b)
