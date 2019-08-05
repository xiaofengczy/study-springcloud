#!/usr/bin/env bash
sh /home/zycao/work/setup/apache-maven-3.6.1/bin/mvn clean package -Dmaven.test.skip=true
docker build -t user-server:latest .