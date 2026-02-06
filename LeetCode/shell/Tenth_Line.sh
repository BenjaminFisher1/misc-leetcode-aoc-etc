#!/bin/bash
# Read from the file file.txt and output the tenth line to stdout.


COUNT=1

while read -r line; do
   
    if [ $COUNT -eq 10 ]; then
        printf '%s\n' "$line"
        break
    fi
    ((COUNT++))
done < "file.txt"