#!/usr/bin/python

import sys
import os


beginning = sys.argv[1]
setView = sys.argv[2]
middle = sys.argv[3]
modelLoader = sys.argv[4]
end = sys.argv[5]
new = sys.argv[6]




beginningFile = open(beginning,'r')
setView = open(setView, 'r')
middle = open(middle,'r')
modelLoader = open(modelLoader, 'r')
end = open(end,'r')
new = open(new,'w')

for line1 in beginningFile:
    new.write(line1)

for line2 in setView:
    new.write(line2)

for line3 in middle:
    new.write(line3)

for line4 in modelLoader:
    new.write(line4)

for line5 in end:
    new.write(line5)

