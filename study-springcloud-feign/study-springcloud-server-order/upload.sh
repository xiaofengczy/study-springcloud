#!/usr/bin/env bash
# 打包
sh /home/zycao/work/setup/apache-maven-3.6.1/bin/mvn clean package -Dmaven.test.skip=true
echo 'jar包打包成完成'
### 上传jar报至服务器
#rsync -av target/study-springcloud-server-order-1.0-SNAPSHOT.jar Dockerfile root@148.70.30.245:/home/zycao/work/study-springcloud/order-server
#echo '上传jar包完成'
