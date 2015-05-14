package com.ingeus.restMongoSpike;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ingeus.restMongoSpike.db.JobOfferingRepository;
import com.ingeus.restMongoSpike.jobs.JobListing;


import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class RestMongoSpikeApplication implements CommandLineRunner {

	@Autowired
	private JobOfferingRepository repository;

	@Override
	public void run(String... strings) throws Exception {
		repository.deleteAll();
		String xml = loadFromClassPath("20150505_QAPA_AVAILABLE_OFFERS.xml");
		JobListing listing = JobListing.fromXML(xml);
		repository.save(listing.getJobOfferings());

	}

	private static String loadFromClassPath(String filename) throws IOException {
		ClassLoader classLoader = new RestMongoSpikeApplication().getClass().getClassLoader();
		InputStream file = classLoader.getResourceAsStream(filename);
		String data = IOUtils.toString(file);
		IOUtils.closeQuietly(file);
		return data;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RestMongoSpikeApplication.class, "--debug");
	}
}
