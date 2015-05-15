package com.ingeus.restMongoSpike;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import com.ingeus.restMongoSpike.db.QAOAJobOfferingRepository;
import com.ingeus.restMongoSpike.elasticsearch.JobOfferingRepository;
import com.ingeus.restMongoSpike.elasticsearch.JobOfferingRepositoryCustom;
import com.ingeus.restMongoSpike.jobs.JobOffering;
import com.ingeus.restMongoSpike.jobs.QAPAJobListing;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class RestMongoSpikeApplication implements CommandLineRunner {

	@Autowired
	private QAOAJobOfferingRepository qaoaJobOfferingRepository;

	@Autowired
	private JobOfferingRepository jobOfferingRepository;

	@Autowired
	private JobOfferingRepositoryCustom jobOfferingRepositoryCustom;

	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;

	@Override
	public void run(String... strings) throws Exception {
		qaoaJobOfferingRepository.deleteAll();
		String xml = loadFromClassPath("20150505_QAPA_AVAILABLE_OFFERS.xml");
		QAPAJobListing listing = QAPAJobListing.fromXML(xml);
		qaoaJobOfferingRepository.save(listing.getJobOfferings());
		List<JobOffering> jobOfferingList = listing.getJobOfferings().stream().map(j -> j.toJobObject()).collect(Collectors.toList());
		jobOfferingRepository.save(jobOfferingList);

		elasticsearchTemplate.createIndex(JobOffering.class);

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
