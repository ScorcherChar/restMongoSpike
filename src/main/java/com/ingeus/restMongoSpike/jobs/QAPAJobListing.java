package com.ingeus.restMongoSpike.jobs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.StringReader;
import java.util.ArrayList;

@XmlRootElement(name = "offers")
public class QAPAJobListing {

    @XmlElement(name = "offer")
    private ArrayList<QAPAJobOffering> jobOfferings;

    public static QAPAJobListing fromXML(String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(QAPAJobListing.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        QAPAJobListing jobListing = (QAPAJobListing) jaxbUnmarshaller.unmarshal(new StringReader(xml));
        return jobListing;
    }


    public ArrayList<QAPAJobOffering> getJobOfferings() {
        return jobOfferings;
    }
}
