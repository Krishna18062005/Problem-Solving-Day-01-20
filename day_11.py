
#check given input is in hexadecimal form 
a=input().strip()
try:
  int(a,16)
  print("yes")
except:
  print("no")
