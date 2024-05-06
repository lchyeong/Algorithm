name = ["Tom", "Jerry", "Mike", "Tom"]
name2 = ["Tom", "Jerry", "Mike", "Tom", "Mike"]


def find_same_name(li):
    answer = set()
    for i in range(len(li)):
        for j in range(i+1, len(li)):
            if li[i] == li[j]:
                answer.add(li[i])
    return answer


print(find_same_name(name))
print(find_same_name(name2))
