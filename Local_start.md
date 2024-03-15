## 1. 打包：
mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U
ls -al distribution/target/

## 2. 启动： 
cd distribution/target/nacos-server-$version/nacos/bin
sh bin/startup.sh -m standalone


## 3. 访问
http://localhost:8848/nacos/
默认账号密码：nacos/nacos
./logs/start.out

## 4. 关闭
sh bin/shutdown.sh