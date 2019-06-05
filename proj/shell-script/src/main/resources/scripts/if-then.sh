#!/bin/bash

#if-then statement

echo "Enter file name to rename file name:"
read srcName destName

if mv $srcName $destName
then
	echo "Your file has been renames successfully"
fi