def sel_sort(a):
    n = len(a)
    #마지막 n은 돌릴 필요는 없구나..!
    for i in range(0, n - 1):
        min_idx = i
        #i+1부터 j가 시작
        for j in range(i + 1, n):
            if a[j] < a[min_idx]:
                min_idx = j
        a[i], a[min_idx] = a[min_idx], a[i]
        #파이썬은 swap을 이렇게 간단하게 할 수 있다.
        #??? 내가 하고싶은 말을 왜 너가하는데


d = [2, 4, 5, 1, 3]
sel_sort(d)
print(d)