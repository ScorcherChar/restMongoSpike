package com.ingeus.restMongoSpike.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Service;

import com.ingeus.restMongoSpike.jobs.JobOffering;
@Service
public interface JobOfferingRepository extends ElasticsearchCrudRepository<JobOffering, String>, JobOfferingRepositoryCustom {


}
