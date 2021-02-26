#!/bin/sh
mvn clean package && docker build -t com.mycompany/TiendaOnline .
docker rm -f TiendaOnline || true && docker run -d -p 9080:9080 -p 9443:9443 --name TiendaOnline com.mycompany/TiendaOnline