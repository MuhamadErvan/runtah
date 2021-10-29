#!/bin/bash

echo -n "Masukkan nilai: "
read nomer

if [[ $nomer -lt 75 ]]
then
  echo "Gagal"
else if [[ $nomer -lt 100 ]]
then
  echo "Lulus"
else
  echo "Invalid argument"
  fi
fi
