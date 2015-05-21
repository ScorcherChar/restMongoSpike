package com.ingeus.restMongoSpike.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.ingeus.restMongoSpike.jobs.JobOffering;

public interface JobOfferingRepository extends ElasticsearchRepository<JobOffering, String> {
	Iterable<JobOffering> findByName(String name);
	Iterable<JobOffering> findByNameLike(String name);
	Iterable<JobOffering> findByLocationNear(double lat, double lng);
	Iterable<JobOffering> findByNameLikeOrDescriptionLikeOrCompanyLike(String name, String description,String company);

}
