//package com.jimi.spring.redisdemo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//
//import static io.lettuce.core.ReadFrom.SLAVE_PREFERRED;
//
//@Configuration
//class WriteToMasterReadFromReplicaConfiguration {
//
//  @Bean
//  public LettuceConnectionFactory redisConnectionFactory() {
//
//    LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
//      .readFrom(SLAVE_PREFERRED)
//      .build();
//
//    RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration("127.0.0.1", 6379);
//
//    return new LettuceConnectionFactory(serverConfig, clientConfig);
//  }
//}