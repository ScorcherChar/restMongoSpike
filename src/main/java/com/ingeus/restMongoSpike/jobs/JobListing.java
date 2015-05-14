package com.ingeus.restMongoSpike.jobs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.StringReader;
import java.util.ArrayList;

@XmlRootElement(name = "offers")
public class JobListing  {

    @XmlElement(name = "offer")
    private ArrayList<JobOffering> jobOfferings;

    public static JobListing fromXML(String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(JobListing.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        JobListing jobListing = (JobListing) jaxbUnmarshaller.unmarshal(new StringReader(xml));
        return jobListing;
    }


    public ArrayList<JobOffering> getJobOfferings() {
        return jobOfferings;
    }
}
