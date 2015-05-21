package com.ingeus.restMongoSpike;

import javax.xml.bind.JAXBException;

import org.apache.commons.io.IOUtils;

import com.ingeus.restMongoSpike.db.QAOAJobOfferingRepository;
import com.ingeus.restMongoSpike.elasticsearch.JobOfferingRepository;
import com.ingeus.restMongoSpike.jobs.JobOffering;
import com.ingeus.restMongoSpike.jobs.QAPAJobListing;
import com.ingeus.restMongoSpike.jobs.QAPAJobOffering;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class HelperMethods {
    public static String loadFromClassPath(String filename) throws IOException {
        ClassLoader classLoader = new HelperMethods().getClass().getClassLoader();
        InputStream file = classLoader.getResourceAsStream(filename);
        String data = IOUtils.toString(file);
        IOUtils.closeQuietly(file);
        return data;
    }

    public static void loadRepoWithJobs(JobOfferingRepository jobOfferingRepository, QAOAJobOfferingRepository qaoaJobOfferingRepository ) throws IOException, JAXBException {
        jobOfferingRepository.deleteAll();
        String xml = loadFromClassPath("singleJobOffer.xml");
        QAPAJobListing listing = QAPAJobListing.fromXML(xml);
        QAPAJobOffering qapaJobOffering = listing.getJobOfferings().get(0);
        List<JobOffering> jobOfferingList = listing.getJobOfferings().stream().map(j -> j.toJobObject()).collect(Collectors.toList());
       qaoaJobOfferingRepository.save(qapaJobOffering);
        JobOffering jo = qapaJobOffering.toJobObject();
        jobOfferingRepository.save(jo);
    }
}
