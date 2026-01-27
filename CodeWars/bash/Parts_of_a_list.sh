#!/bin/bash
partlist() {
  arr=($1)
  length=$((${#arr[@]} - 1))

  for ((i = 1; i<=length; i++)); do
    left="${arr[@]:0:i}"
    right="${arr[@]:i}"
    printf "(%s,%s)" "$left" "$right"
  done
}

partlist "$1"