package com.ingeus.restMongoSpike.db;

import com.ingeus.restMongoSpike.jobs.JobOffering;


import java.util.ArrayList;
import java.util.List;

public class JobOfferingRepositoryImpl implements JobOfferingRepositoryCustom{
	@Override
	public List<JobOffering> search(String keyword) {
		return new ArrayList<>();
	}
}
