a=input()
#print the distinct character in a string
d={}
for i in a:
  d[i]=0
for i in a:
  d[i]+=1
for i in a:
  if(d[i]==1):
    print(i,end="")
