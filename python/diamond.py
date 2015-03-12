flag = False
loop_var  = input();
for i in range(0, loop_var + 1):
	print(' ') * (loop_var - i ), 
	print('*') * (1 +  2 * i)
for i in range(0, loop_var):
	print(' ') * (i + 1), 
	print('*') * ((loop_var - i) * 2 - 1 )
