#!/bin/bash

FILES=/Users/alanli/Desktop/Car2Go/Output/World/*
echo "*****UPLOAD STARTING*****"
for file in $FILES
do
    curl -XPOST 'localhost:9200/_bulk?pretty' --data-binary @$file
    echo "$file uploaded"
    sleep 0.05
done
echo "*****UPLOAD FINISHED*****"
