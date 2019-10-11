 **踩坑！！！** 
 
  server和client的pom依赖必须分开单独，否则客户端就是读不到server的！！坑！！！！！！
    server不能有spring-cloud-starter-config依赖
    client不能有spring-cloud-config-server依赖

    spring-cloud-starter-config中没有web依赖，必须手动引入boot-web！！！！否则启动不了，已删而过！！！！坑！！！！