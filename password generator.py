# -*- coding: utf-8 -*-
"""
Created on Thu Dec 30 13:00:49 2021

@author: sd
"""
import random
final_pass=""
password=""
print("Welcome to password generator")
l1=["a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l","m", "n","o", "p", "q","r" , "s", "u", "v", "w","x", "y","z"]                                                        
s1=["!", "@", "#", "$", "$", "%", "^", "&", "*", "+"]
n1=['1','2','3','4','5','6','7','8','9','0']
cha=random.randint(8, 10)
sym=random.randint(2, 4)
num=random.randint(2, 4)
for i in range(1,cha+1):
    new=random.choice(l1)
    password=password + new
for i in range(1,sym+1):
    new1=random.choice(s1)
    password=password + new1
for i in range(1,num+1):
    new2=random.choice(n1)
    password=password + new2
pass1=password
new4=list(password)
for i in range(1,len(new4)+1):
    new5=random.choice(new4)
    final_pass=final_pass+new5
print(final_pass)
#pass2=pass1.append(password)
#c=pass2.split()
#print(c)