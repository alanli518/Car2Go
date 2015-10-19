#!/bin/bash

FILES=/Users/alanli/Documents/Car2Go-Project/Output/Toronto/*;
echo "*****UPLOAD STARTING*****";
count=0;
for file in $FILES
do
	if [[ $count -eq 5 ]]
	then
		curl -XPOST 'localhost:9200/_bulk?pretty' --data-binary @$file;
	    echo "$file uploaded";
		let count=0;
	fi
	((count++));
done
echo "*****UPLOAD FINISHED*****";