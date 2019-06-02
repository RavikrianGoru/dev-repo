#!/bin/bash

# variables: variables names can only start with a-z, A-Z and _ 
#			 variable names are case sensitive
#			 $var_name

# read command


var_name="ravi"
echo "$var_name"
var_name="ravi's girlfriend"
echo "$var_name"



#echo  "Please enter your name:"
echo -e "Please enter your name:\c"
read my_name

echo "Hello $my_name"



