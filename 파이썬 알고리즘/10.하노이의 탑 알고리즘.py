#n = int(input("number : "))


def hanoi(x, from_pos, to_pos, aux_pos):
    if x == 1:
        print(from_pos, "->", to_pos)
        return
    hanoi(x-1, from_pos, aux_pos, to_pos)
    print(from_pos, "->", to_pos)
    hanoi(x-1, aux_pos, to_pos, from_pos)


print("n = 1")
hanoi(1, 1, 3, 2)  # 원반 한 개를 1번 기둥에서 3번 기둥으로 이동(2번을 보조 기둥으로)
print("n = 2")
hanoi(2, 1, 3, 2)  # 원반 두 개를 1번 기둥에서 3번 기둥으로 이동(2번을 보조 기둥으로)
print("n = 3")
hanoi(3, 1, 3, 2) # 원반 세 개를 1번 기둥에서 3번 기둥으로 이동(2번을 보조 기둥으로)


"""
하노이 탑 원반 옮기기. 재귀 사용해야하는데 2n-1번만에 옮길 수 있다.
홀수일 때는 목표 기둥부터 옮기고 짝수일 때는 보조 기둥으로 옮긴다.
->근데 이 방법은 의미는 없다.
재귀적 방법을 생각해내야 하는데 가장 큰 원판을 마지막 기둥으로 옮겨야 하므로
이전 원판의 총 개수의 두배 + 1만큼 이동이 일어난다.
1 + 2*f(n-1) 의 이동이 발생하는 것이다.
"""
