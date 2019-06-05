#!/bin/bash

echo -e "Enter number:\c"
read num1
if [ $num1 -lt 10 ]
then
	echo "Given number is < 10"
elif [ $num1 -gt 20 ]
then
	echo "Given number is > 20"
else
	echo "Given number is >=10 and <=20"
fi