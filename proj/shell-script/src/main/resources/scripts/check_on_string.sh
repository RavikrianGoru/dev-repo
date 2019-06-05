#! /bin/bash
# checks on strings

str1="Hey You"
str2="What's up"
str3=
str4=""

echo $str1 $str2 $str3 $str4

[ "$str1" = "$str2" ]
echo "Status:$?"

[ "$str1" != "$str2" ]
echo "Status:$?"

[ -n "$str1" ]
echo "Status:$?"

[ -z "$str3" ]
echo "Status:$?"


 

echo "length of str1 is  ${#str1}"
echo "sub str1 is  ${str1:4}"
echo "sub str1 is  ${str1:4:2}"


str1="Ravikiran zGoru This si lart input Goru Ravi kiran"
str2="devi"

echo "${str1%%str2}"