#!/bin/bash
#Arithmetic operation

set -x
a=30 b=15
echo `expr $a + $b`
echo `expr $a - $b`
echo `expr $a \* $b`
echo `expr $a / $b`
echo `expr $a % $b`

a=10 b=20 c=6 d=5
echo `expr $a \* $b + $c / $d`
echo `expr $a \* \( $b + $c \) / $d`
