
# 本地启动
1. 根目录执行： mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U
2. cd distribution/target/nacos-server-2.2.3/nacos/bin
3. 启动： ./startup.sh -m standalone&
4. tail -100f /Users/huleilei9/source/github/hill/nacos-fork/distribution/target/nacos-server-2.2.3/nacos/logs/start.out
5. 访问： http://localhost:8848/nacos/index.html

