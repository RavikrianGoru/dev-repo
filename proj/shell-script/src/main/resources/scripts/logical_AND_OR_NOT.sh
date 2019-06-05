#!/bin/bash

# Logical operator:
# AND -a  && 
# OR -o ||
# NOT -ne !=


n1=10
n2=20

if [ $n1 -le 10 -a $n2 -ge 20 ]
then
	echo "$?"
fi

if [[ $n1 -le 10 && $n2 -ge 20 ]]
then
	echo "$?"
fi


if [ $n1 -lt 5 -o $n2 -lt 50 ]
then
	echo "$?"
fi

if [[ $n1 -lt 5 || $n2 -lt 50 ]]
then
	echo "$?"
fi

if [ $n1 -ne 5  ]
then
	echo "$?"
fi

if [[ $n1 != 5  ]]
then
	echo "$?"
fi

