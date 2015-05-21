package com.ingeus.restMongoSpike.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ingeus.restMongoSpike.elasticsearch.JobOfferingRepository;
import com.ingeus.restMongoSpike.jobs.JobOffering;

@RestController
public class JobSearchController {

	private final JobOfferingRepository jobRepo;

	@Autowired
	public JobSearchController(JobOfferingRepository jobRepo) {
		this.jobRepo = jobRepo;
	}

	@RequestMapping(value = "/api/jobs", method = RequestMethod.GET)
	public Iterable<JobOffering> jobs() {
		Iterable<JobOffering> jobSearchResults = jobRepo.findAll();
		return jobSearchResults;
	}


	@RequestMapping(value = "/api/jobs/search/{term}", method = RequestMethod.GET)
	public Iterable<JobOffering> getJobByName(@PathVariable(value = "term") String term) {
		Iterable<JobOffering> jobSearchResults = jobRepo.findByNameLikeOrDescriptionLikeOrCompanyLike(term,term,term);
		return jobSearchResults;
	}
}
