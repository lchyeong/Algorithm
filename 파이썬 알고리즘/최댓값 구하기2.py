
# 이건 최댓값의 인덱스를 찾는 문제이다.
numbers = []
numbers.extend(map(int, input("numbers : ").split()))



li = [17, 92, 18, 33, 58, 7, 33, 42]


def find_max(arr):
    maxNum = arr[0]
    for i in range(1, len(arr)):
        if(maxNum < arr[i]):
            find_max_idx = i
    return find_max_idx


print(find_max(numbers))

