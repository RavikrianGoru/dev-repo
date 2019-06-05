#! /bin/bash

echo -e "Enter file name:\c"
read filename

[ -e $filename ] && echo "$filename is exist as file/dir" || echo "$filename is not exist as file/dir" 
[ -f $filename ] && echo "$filename is regular file";
[ -d $filename ] && echo "$filename is directory"
[ -s $filename ] && echo "$filename is not empty" || echo "$filename is  empty"

touch $filename

chmod -w $filename
[ -w $filename ] && { echo "Type msg to append and quit ctrl+d."; cat >> $filename; }

chmod +w $filename
[ -w $filename ] && { echo "Type msg to append and quit ctrl+d."; cat >> $filename; }





 
