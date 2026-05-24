# seckill-rag

`seckill-rag` 是一个基于 Spring Boot 3 的多模块秒杀系统项目，主要用于学习和实践高并发秒杀场景下的后端系统设计。项目围绕用户登录、商品查询、秒杀下单、订单处理、Redis 缓存、接口限流与分布式锁等核心流程展开。


## 项目模块

- `seckill-rag-app`：项目启动入口，负责整合各业务模块
- `seckill-rag-common`：公共模块，包含通用配置、响应封装、异常处理、Mapper、工具类等
- `seckill-rag-user`：用户模块，包含注册、登录、验证码、用户状态等功能
- `seckill-rag-goods`：商品模块，包含秒杀商品列表、商品详情等接口
- `seckill-rag-order`：订单模块，包含秒杀下单、订单查询、订单取消、模拟支付等功能

## 核心功能

- 用户注册与登录
- Sa-Token 登录认证
- 图形验证码校验
- 秒杀商品列表查询
- 秒杀商品详情查询
- 秒杀下单
- 订单查询与取消
- Redis 缓存支持
- 基于分布式锁的并发控制
- 全局异常处理
- 统一接口响应封装
- Log4j2 异步日志配置

## 技术亮点

- 使用 Maven 多模块拆分业务边界，结构清晰，便于维护和扩展
- 使用 Redis 提升热点数据访问性能
- 使用 Sa-Token 完成登录认证和 Token 管理
- 使用 MyBatis 进行数据库访问
- 使用统一响应对象和全局异常处理提升接口规范性
- 针对秒杀场景设计了订单创建和并发控制流程

## 本地运行

1. 准备 MySQL 和 Redis 环境
2. 修改 `seckill-rag-app/src/main/resources/application-dev.yml` 中的数据库和 Redis 配置
3. 在项目根目录执行：

```bash
mvn clean package
