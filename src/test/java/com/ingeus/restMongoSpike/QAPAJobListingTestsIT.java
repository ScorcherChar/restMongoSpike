package com.ingeus.restMongoSpike;


import static com.ingeus.restMongoSpike.HelperMethods.loadFromClassPath;

import org.junit.Assert;
import org.junit.Test;

import com.ingeus.restMongoSpike.jobs.JobOffering;
import com.ingeus.restMongoSpike.jobs.QAPAJobListing;
import com.ingeus.restMongoSpike.jobs.QAPAJobOffering;

public class QAPAJobListingTestsIT
{

    @Test
    public void givenQAPAJobListingXMLHasOneJob_whenXMLConvertedToPojo_thenPojoHasOneJob()throws Exception{
        String xml = loadFromClassPath("singleJobOffer.xml");
        QAPAJobListing listing = QAPAJobListing.fromXML(xml);
        Assert.assertEquals(1, listing.getJobOfferings().size());
    }

    @Test
    public void givenQAPAJobListingXMLHasMultipleJobs_whenXMLConvertedToPojo_thenPojoHasOneJob()throws Exception{
        String xml = loadFromClassPath("20150505_QAPA_AVAILABLE_OFFERS.xml");
        QAPAJobListing listing = QAPAJobListing.fromXML(xml);
        Assert.assertEquals(19314, listing.getJobOfferings().size());
    }

    @Test
    public void givenQAPAJobValid_whenConvertedToJobOffering_thenFieldsPopulated()throws Exception{
        String xml = loadFromClassPath("singleJobOffer.xml");
        QAPAJobListing listing = QAPAJobListing.fromXML(xml);
        QAPAJobOffering jobOffering = listing.getJobOfferings().get(0);

        JobOffering result = jobOffering.toJobObject();

     //   Assert.assertEquals(jobOffering.getDescription(), result.getDescription());
    }
}
