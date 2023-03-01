#!/bin/bash

git add .

read -p "Enter your commit message: " message

git commit -m "$message"

git push

echo -e "\n\aChanges successfully pushed!"

echo -e "Your commit message: $message\n"

