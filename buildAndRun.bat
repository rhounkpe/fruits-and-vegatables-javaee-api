@echo off
call mvn clean package
call docker build -t com.capgemini.fruits-vegatables/fruits-vegatables-api .
call docker rm -f fruits-vegatables-api
call docker run -d -p 9080:9080 -p 9443:9443 --name fruits-vegatables-api com.capgemini.fruits-vegatables/fruits-vegatables-api