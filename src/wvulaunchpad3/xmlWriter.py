#!/usr/bin/python

import sys
import os

description = sys.argv[1]
beginning = sys.argv[2]
#setView = sys.argv[3]
middle = sys.argv[3]
#modelLoader = sys.argv[4]
end = sys.argv[4]
new = sys.argv[5]

if (os.path.isfile(new)):
    new.remove()

description = open(description, 'r')
beginningFile = open(beginning,'r')
#setView = open(setView, 'r')
middle = open(middle,'r')
#modelLoader = open(modelLoader, 'r')
end = open(end,'r')
new = open(new,'w')



for line1 in description:
    new.write(line1)

for line2 in beginningFile:
    new.write(line2)

#for line3 in setView:
 #   new.write(line3)

for line4 in middle:
    new.write(line4)

#for line5 in modelLoader:
 #   new.write(line5)

for line6 in end:
    new.write(line6)

