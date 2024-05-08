def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)


print(gcd(1, 5))
print(gcd(3, 6))
print(gcd(60, 24))
print(gcd(81, 27))

#유클리드 수학자의 두 수 최대공약수 구하는 방법을 재귀적 형태로 구현한 코드.