#maximum no of occurance of character;
a=input()
d={}
for i in a:
    d[i]=0
for i in a:
    d[i]+=1
print(max(d.values()))
#two sum
a=list(map(int,input().split()))
b=int(input())
for i in range(0,len(a)):
    for j in range(i+1,len(a)):
        if a[i]+a[j]==b:
            print(f"[{i}, {j}]")
            break
