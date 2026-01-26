#!/bin/bash
countRedBeads() {
  if (($1 < 2)); then
    echo 0
  fi
  
  echo $(( ($1 - 1) * 2 ))
}

countRedBeads $1