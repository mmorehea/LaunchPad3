#!/usr/bin/python

import sys
import os


first = sys.argv[1]
second = sys.argv[2]
third = sys.argv[3]
fourth = sys.argv[4]

new = sys.argv[5]

if (os.path.isfile(new)):
    os.remove(new)

newFile = open(new,'w')
firstFile = open(first, 'r')
secondFile = open(second,'r')
thirdFile = open(third, 'r')
fourthFile = open(fourth,'r')




for line1 in firstFile:
    newFile.write(line1)

for line2 in secondFile:
    newFile.write(line2)

for line3 in thirdFile:
    newFile.write(line3)

for line4 in fourthFile:
    newFile.write(line4)



