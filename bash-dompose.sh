#!/usr/bin/env bash
scp docker-compose.yml root@148.70.30.245:/home/zycao/work/study-springcloud
ssh root@148.70.30.245 << remotessh
echo '登录服务器成功'
# 构建user-server镜像
cd /home/zycao/work/study-springcloud/user-server
docker build -t user-server:latest .
# 构建order-server镜像
cd /home/zycao/work/study-springcloud/order-server
docker build -t order-server:latest .
# 执行docker-compose.yml
cd  /home/zycao/work/study-springcloud
docker-compose down
docker-compose up -d
exit