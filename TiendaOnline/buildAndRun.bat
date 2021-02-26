@echo off
call mvn clean package
call docker build -t com.mycompany/TiendaOnline .
call docker rm -f TiendaOnline
call docker run -d -p 9080:9080 -p 9443:9443 --name TiendaOnline com.mycompany/TiendaOnline