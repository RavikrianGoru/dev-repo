#!/bin/bash
#echo statements with escape sequences

echo "This is normal text. Hi all"
echo "This is normal text. \nHi all"
echo "This is normal text. \rHi all"
echo "This is normal text. \tHi all"
echo "This is normal text. \bHi all"
echo "\033[1mThis is normal text.\033[0m Hi all"
echo "\033[7mThis is normal text.\033[7m Hi all"