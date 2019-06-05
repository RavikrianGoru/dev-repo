#!/bin/bash
#tput in action
clear
echo -e "Total number of rows on screens=\c"
tput lines
echo -e "Total number of columns on screens=\c"
tput cols
tput cup 15 20
tput bold
echo "This text should be in bold"
echo "\033[0mBye Bye..."


