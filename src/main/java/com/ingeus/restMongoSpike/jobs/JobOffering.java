package com.ingeus.restMongoSpike.jobs;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;


import java.util.Date;

@Document(indexName = "joboffering", type = "joboffering", shards = 1, replicas = 0, indexStoreType = "memory", refreshInterval = "-1")
public class JobOffering {
	@Id
	private String id;

	@Field(index = FieldIndex.analyzed, type = FieldType.String)
	private String name;

	@GeoPointField
	private GeoPoint location;

	@Field(type = FieldType.String)
	private String phone;

	@Field(type = FieldType.String)
	private String rome_v3;

	@Field(type = FieldType.String)
	private String remote_id;

	@Field(type = FieldType.Date, format = DateFormat.date)
	private Date publication_date;

	@Field(type = FieldType.String)
	private String description;

	@Field(type = FieldType.Double)
	private double salary_range_end;

	@Field(type = FieldType.Double)
	private double salary_range_begin;

	@Field(type = FieldType.String)
	private String url;

	@Field(type = FieldType.String)
	private String email;

	@Field(type = FieldType.String)
	private String company;

	public JobOffering() {
	}

	public JobOffering(String id, String name, GeoPoint location, String[] skills, String phone, String rome_v3, String remote_id, Date publication_date, String description,
					   double salary_range_end, double salary_range_begin, String url, String email, String company) {
		this.id = id;
		this.location = location;
		this.name = name;
		this.phone = phone;
		this.rome_v3 = rome_v3;
		this.remote_id = remote_id;
		this.publication_date = publication_date;
		this.description = description;
		this.salary_range_end = salary_range_end;
		this.salary_range_begin = salary_range_begin;
		this.url = url;
		this.email = email;
		this.company = company;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GeoPoint getLocation() {
		return location;
	}

	public void setLocation(GeoPoint location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRome_v3() {
		return rome_v3;
	}

	public void setRome_v3(String rome_v3) {
		this.rome_v3 = rome_v3;
	}

	public String getRemote_id() {
		return remote_id;
	}

	public void setRemote_id(String remote_id) {
		this.remote_id = remote_id;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSalary_range_end() {
		return salary_range_end;
	}

	public void setSalary_range_end(double salary_range_end) {
		this.salary_range_end = salary_range_end;
	}

	public double getSalary_range_begin() {
		return salary_range_begin;
	}

	public void setSalary_range_begin(double salary_range_begin) {
		this.salary_range_begin = salary_range_begin;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
