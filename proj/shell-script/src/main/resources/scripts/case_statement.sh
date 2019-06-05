#!/bin/bash

#case statement to check lower case or not

echo -e "Enter you input:\c"
read input

case $input in
	[a-z])
		echo "Lower case input"
		;;
	[A-Z])
		echo "Upper case input"
		;;
	[0-9])
		echo "digits as input"
		;;
	?)
		echo "special chars"
		;;
	*)
		echo "mutliple chars"
		;;
	
esac
		
		
		
		
		 
		
		
		
		