#!/bin/bash
#open Logstash

cd /Users/alanli/elasticsearch-1.7.2/logstash-1.5.4/bin
./logstash agent -f twitter-geo_logstash.conf
