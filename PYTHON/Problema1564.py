import sys

i = sys.stdin.readline() 
x = int(i)
while i != '':
	x = int(i)
	if x == 0:
		print('vai ter copa!')
	else:
		print('vai ter duas!')
	i = sys.stdin.readline()
