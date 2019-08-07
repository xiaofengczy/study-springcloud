#!/usr/bin/env bash
docker ps -a|grep 'server'|awk '{print $1}'|xargs docker rm -f
docker images -a|grep 'server'|awk '{print $3}'|xargs docker rmi

