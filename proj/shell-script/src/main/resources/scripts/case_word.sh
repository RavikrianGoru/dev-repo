#!/bin/bash

echo -e "Enter you inpur:\c"
read var

case $var in
	[aeiou]* | [AEIOU]*)
					echo "input started with vowel."
					;;
	[0-9]*)
					echo "input started with digit"
					;;
	*[0-9])
					echo "input ended with didgit"
					;;
	???)
					echo "input contains 3 chars only"
					;;
	*)
					echo "defult case executed"
					;;
esac
