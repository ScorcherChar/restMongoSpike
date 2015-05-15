package com.ingeus.restMongoSpike;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@ComponentScan("com.ingeus.restMongoSpike.elasticsearch")
@EnableElasticsearchRepositories("com.ingeus.restMongoSpike.elasticsearch")
public class AppConfig {
}
