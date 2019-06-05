#!/bin/bash
# wc


echo -e "Enter you inputs:\c"
read input


# input contains a chara and one new line/carrage return char so  count 2
if [ `echo $input | wc -c` -eq 2 ]
then
	echo "You entered a char"
	if [ $input = a -o $input = e -o $input = i -o $input = o -o $input = u  -o $input = A -o $input = E  -o $input = I  -o $input = O  -o $input = U ]
	then
		echo "Owvel"
	else
		echo "Consonents"
	fi 
else
	echo "invalid input"
	echo `echo $input | wc -c`
	echo `echo $input | wc -w`
	echo `echo $input | wc -l`
fi

