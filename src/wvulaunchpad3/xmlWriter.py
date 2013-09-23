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

for line1 in beginningFile:
    new.write(line1)

for line2 in middle:
    new.write(line2)
    print line2

for line3 in end:
    new.write(line3)

