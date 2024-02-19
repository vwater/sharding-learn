# sharding+dynamic

1. 在插入、更新时一定，分片键必须要要有值，不然
   IllegalStateException: Insert statement does not support sharding table routing to multiple data nodes.
2. V5.2.1时，自定义算法类上不需要交给spring管理，不能添加@Slf4j、@Component


