package com.ingeus.restMongoSpike;

import static com.ingeus.restMongoSpike.HelperMethods.loadFromClassPath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ingeus.restMongoSpike.db.JobOfferingRepository;
import com.ingeus.restMongoSpike.jobs.JobListing;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestMongoSpikeApplication.class)
public class JobOfferingRepositoryTestsIT {

    @Autowired
    private JobOfferingRepository repository;


    @Test
    public void givenJobListingXMLHasMultipleJobs_whenXMLConvertedToPojo_thenPojoHasOneJob()throws Exception{
        String xml = loadFromClassPath("20150505_QAPA_AVAILABLE_OFFERS.xml");
        JobListing listing = JobListing.fromXML(xml);

        repository.save(listing.getJobOfferings());


    }
}
