#!/bin/bash
#if-then-else statements

echo -e "Enter src file name and dest file name to rename:\c"
read srcFile destFile

if mv $srcFile $destFile
then
	echo "Renamed successfully"
else
	echo "Rename failed"
fi 