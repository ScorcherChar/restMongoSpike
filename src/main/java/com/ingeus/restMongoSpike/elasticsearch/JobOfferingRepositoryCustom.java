package com.ingeus.restMongoSpike.elasticsearch;


import org.springframework.data.elasticsearch.annotations.Query;

import com.ingeus.restMongoSpike.jobs.JobOffering;


import java.util.List;

public interface JobOfferingRepositoryCustom{
	@Query("{\"bool\" : {\"must\" : {\"field\" : {\"name\" : \"?\"}}}}")
	 List<JobOffering> someCustomMethod(String name);
}
