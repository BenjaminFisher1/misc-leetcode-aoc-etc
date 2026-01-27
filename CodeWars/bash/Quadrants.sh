#!/bin/bash

if (($1 > 0 && $2 > 0)); then
  echo "1"
elif (($1 < 0 && $2 > 0)); then  
  echo "2"
elif (($1 < 0 && $2 < 0)); then  
  echo "3"
else echo "4"
fi

exit