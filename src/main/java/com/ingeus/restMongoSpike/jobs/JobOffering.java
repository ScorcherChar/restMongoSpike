package com.ingeus.restMongoSpike.jobs;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;

@Document(indexName = "joboffering",type = "joboffering" , shards = 1, replicas = 0, indexStoreType = "memory", refreshInterval = "-1")
public class JobOffering {
	@Id
	private String id;

	@Field(index = FieldIndex.analyzed)
	private String name;

	public JobOffering(){

	}

	public JobOffering(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
