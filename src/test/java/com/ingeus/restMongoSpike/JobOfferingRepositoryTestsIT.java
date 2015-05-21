package com.ingeus.restMongoSpike;

import org.elasticsearch.common.collect.Iterators;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ingeus.restMongoSpike.db.QAOAJobOfferingRepository;
import com.ingeus.restMongoSpike.elasticsearch.JobOfferingRepository;
import com.ingeus.restMongoSpike.jobs.JobOffering;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestMongoSpikeApplication.class)
public class JobOfferingRepositoryTestsIT {

	@Autowired
	JobOfferingRepository elasticSearchRepo;

	@Autowired
	QAOAJobOfferingRepository qaoaJobOfferingRepository;

	@BeforeClass
	public static void setup(){
		//Ensure data setup in db
		System.setProperty("refreshData", "true");
	}

	@Test
	public void givenASetOfJobsInRepo_whenFindAllCalled_thenCorrectAmountReturned()throws Exception{
		Iterable<JobOffering> jobs = elasticSearchRepo.findAll();
		int count = Iterators.size(jobs.iterator());
		Assert.assertEquals(19314, count);
	}


	@Test
	public void givenASetOfJobsInRepo_whenFindByNameLikeCalled_thenCorrectAmountReturned()throws Exception{
		Iterable<JobOffering> jobs = elasticSearchRepo.findByNameLike("e");
		int count = Iterators.size(jobs.iterator());
		Assert.assertEquals(10, count);
	}

	@Test
	public void givenASetOfJobsInRepo_whenfindByNameLikeOrDescriptionLikeOrCompanyLikeCalled_thenCorrectAmountReturned()throws Exception{
		Iterable<JobOffering> jobs = elasticSearchRepo.findByNameLikeOrDescriptionLikeOrCompanyLike("a","a","a");
		int count = Iterators.size(jobs.iterator());
		Assert.assertEquals(10, count);
	}
/*
//TODO - fix me. I'm broken ;_;
	@Test
	public void givenASetOfJobsInRepo_whenFindByLocationCalled_thenCorrectAmountReturned()throws Exception{
		GeoPoint point = new GeoPoint(new Double("1"), new Double("1"));
		Iterable<JobOffering> jobs = elasticSearchRepo.findByLocationNear(new Double(3), new Double(3));
		int count = Iterators.size(jobs.iterator());
		Assert.assertEquals(10, count);
	}
	*/
}
