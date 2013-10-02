#!/usr/bin/python

import sys
import os


beginning = sys.argv[1]
middle = sys.argv[2]
end = sys.argv[3]
new = sys.argv[4]




beginningFile = open(beginning,'r')
middle = open(middle,'r')
end = open(end,'r')
new = open(new,'w')

for line2 in beginningFile:
    new.write(line2)

for line3 in middle:
    new.write(line3)

for line4 in end:
    new.write(line4)

