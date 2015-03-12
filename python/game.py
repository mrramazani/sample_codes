from random import randint

num = randint(1,100)
win = False
chances = 7 #Surly wins
print('Guess the number. Hads bezan.')
for i in range (0, chances):
	guess = input()
	if guess > num:
		print('Smaller Kochik tare')
	elif guess < num:
		print('Bigger bozorg tare')
	elif guess == num:
		win = True
		print('Doroste. Sad Afarin')
		loop_var = (chances - i) * 2
		for i in range(0, loop_var + 1):
			print(' ') * (loop_var - i ), 
			print('*') * (1 +  2 * i)
		for i in range(0, loop_var):
			print(' ') * (i + 1), 
			print('*') * ((loop_var - i) * 2 - 1 )
		break
if win == False:
	print('Looseeeeeeeeeeeeer! Bakhti')
	print('Javb ' + str(num) + ' bood')
