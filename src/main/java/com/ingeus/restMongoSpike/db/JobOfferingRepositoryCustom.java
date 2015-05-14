package com.ingeus.restMongoSpike.db;

import org.springframework.data.repository.query.Param;

import com.ingeus.restMongoSpike.jobs.JobOffering;


import java.util.List;

public interface JobOfferingRepositoryCustom{
	List<JobOffering> searchByKeyword(@Param("keyword") String keyword);
}
