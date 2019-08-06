#!/usr/bin/env bash
scp docker-compose.yml root@148.70.30.245:/home/zycao/work/study-springcloud
ssh root@148.70.30.245 << remotessh
echo '登录服务器成功'
cd  /home/zycao/work/study-springcloud
docker-compose down
docker-compose up -d
exit