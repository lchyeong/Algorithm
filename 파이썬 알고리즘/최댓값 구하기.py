li = [17,92,18,33,58,7,33,42]

def find_max(li):
     for i in range(1 , len(li)):
        maxNum = li[0]
        if(maxNum < li[i]):
            maxNum = li[i]    
        return maxNum
            

print(find_max(li))


