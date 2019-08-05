#!/usr/bin/env bash

sh /home/zycao/work/setup/apache-maven-3.6.1/bin/mvn clean package -Dmave.test.skip=true


rsync -av target/study-springcloud-server-user-1.0-SNAPSHOT.jar Dockerfile root@txy:/home/zycao/work/study-springcloud/user-server

echo '拷贝至服务器成功'
