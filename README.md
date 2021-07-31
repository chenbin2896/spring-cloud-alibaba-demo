## 服务说明

### city-service 【城市基础服务】
端口： 9003
描述： 查询中国行政数据
技术： JPA，涉及多线程、MySQL

### consumer—service【消费服务】
端口： 9002
描述： 远程调用基础服务，提供对外接口
技术： RPC、feign

### demo-service【基础服务】
端口： 9001
描述： 基本的springboot服务，测试用。

### es-service【es服务】
端口： 9004
描述： 搜索服务
技术： es

### redis-service【缓存服务】
端口： 9005
描述： 缓存相关的业务
技术： redis

### rocketMQ-service【消息基础服务】
端口： 9007
描述： 消息队列服务


