package com.ingeus.restMongoSpike.jobs;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class QAPAJobOffering implements GenericJobOffering {

	//Mongodb Id
	@Id
	private String id;

	private String[] skills;

	private String ref_trades_id;

	private String phone;

	private String rome_v3;

	private String offer_id;

	private String ref_position_levels_id;

	private String publication_start_date;

	private String lng_ne;

	private String ref_contract_durations_id;

	private String posts;

	private String ref_studies_levels_id;

	private String timetable;

	private String first_name;

	private String ref_sectors_id;

	private String lat_center;

	private String lng_center;

	private String description;

	private String recruiter_administrative_area_level_1;

	private String recruiter_id;

	private String seniority;

	private String salary_range_end;

	private String ref_salary_types_id;

	private String offer_postal_code;

	private String ref_company_sizes_id;

	private String lng_sw;

	private String[] contract_types;

	private String offer_locality;

	private String contract_start_date;

	private String url;

	private String country;

	private String lat_ne;

	private String recruiter_locality;

	private String recruiter_postal_code;

	private String salary_range_begin;

	private String email;

	private String lat_sw;

	private String company;

	private String last_name;

	private String[] benefits;

	private String offer_administrative_area_level_1;

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getRef_trades_id() {
		return ref_trades_id;
	}

	public void setRef_trades_id(String ref_trades_id) {
		this.ref_trades_id = ref_trades_id;
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

	public String getOffer_id() {
		return offer_id;
	}

	public void setOffer_id(String offer_id) {
		this.offer_id = offer_id;
	}

	public String getRef_position_levels_id() {
		return ref_position_levels_id;
	}

	public void setRef_position_levels_id(String ref_position_levels_id) {
		this.ref_position_levels_id = ref_position_levels_id;
	}

	public String getPublication_start_date() {
		return publication_start_date;
	}

	public void setPublication_start_date(String publication_start_date) {
		this.publication_start_date = publication_start_date;
	}

	public String getLng_ne() {
		return lng_ne;
	}

	public void setLng_ne(String lng_ne) {
		this.lng_ne = lng_ne;
	}

	public String getRef_contract_durations_id() {
		return ref_contract_durations_id;
	}

	public void setRef_contract_durations_id(String ref_contract_durations_id) {
		this.ref_contract_durations_id = ref_contract_durations_id;
	}

	public String getPosts() {
		return posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

	public String getRef_studies_levels_id() {
		return ref_studies_levels_id;
	}

	public void setRef_studies_levels_id(String ref_studies_levels_id) {
		this.ref_studies_levels_id = ref_studies_levels_id;
	}

	public String getTimetable() {
		return timetable;
	}

	public void setTimetable(String timetable) {
		this.timetable = timetable;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getRef_sectors_id() {
		return ref_sectors_id;
	}

	public void setRef_sectors_id(String ref_sectors_id) {
		this.ref_sectors_id = ref_sectors_id;
	}

	public String getLat_center() {
		return lat_center;
	}

	public void setLat_center(String lat_center) {
		this.lat_center = lat_center;
	}

	public String getLng_center() {
		return lng_center;
	}

	public void setLng_center(String lng_center) {
		this.lng_center = lng_center;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRecruiter_administrative_area_level_1() {
		return recruiter_administrative_area_level_1;
	}

	public void setRecruiter_administrative_area_level_1(String recruiter_administrative_area_level_1) {
		this.recruiter_administrative_area_level_1 = recruiter_administrative_area_level_1;
	}

	public String getRecruiter_id() {
		return recruiter_id;
	}

	public void setRecruiter_id(String recruiter_id) {
		this.recruiter_id = recruiter_id;
	}

	public String getSeniority() {
		return seniority;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}

	public String getSalary_range_end() {
		return salary_range_end;
	}

	public void setSalary_range_end(String salary_range_end) {
		this.salary_range_end = salary_range_end;
	}

	public String getRef_salary_types_id() {
		return ref_salary_types_id;
	}

	public void setRef_salary_types_id(String ref_salary_types_id) {
		this.ref_salary_types_id = ref_salary_types_id;
	}

	public String getOffer_postal_code() {
		return offer_postal_code;
	}

	public void setOffer_postal_code(String offer_postal_code) {
		this.offer_postal_code = offer_postal_code;
	}

	public String getRef_company_sizes_id() {
		return ref_company_sizes_id;
	}

	public void setRef_company_sizes_id(String ref_company_sizes_id) {
		this.ref_company_sizes_id = ref_company_sizes_id;
	}

	public String getLng_sw() {
		return lng_sw;
	}

	public void setLng_sw(String lng_sw) {
		this.lng_sw = lng_sw;
	}

	public String[] getContract_types() {
		return contract_types;
	}

	public void setContract_types(String[] contract_types) {
		this.contract_types = contract_types;
	}

	public String getOffer_locality() {
		return offer_locality;
	}

	public void setOffer_locality(String offer_locality) {
		this.offer_locality = offer_locality;
	}

	public String getContract_start_date() {
		return contract_start_date;
	}

	public void setContract_start_date(String contract_start_date) {
		this.contract_start_date = contract_start_date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLat_ne() {
		return lat_ne;
	}

	public void setLat_ne(String lat_ne) {
		this.lat_ne = lat_ne;
	}

	public String getRecruiter_locality() {
		return recruiter_locality;
	}

	public void setRecruiter_locality(String recruiter_locality) {
		this.recruiter_locality = recruiter_locality;
	}

	public String getRecruiter_postal_code() {
		return recruiter_postal_code;
	}

	public void setRecruiter_postal_code(String recruiter_postal_code) {
		this.recruiter_postal_code = recruiter_postal_code;
	}

	public String getSalary_range_begin() {
		return salary_range_begin;
	}

	public void setSalary_range_begin(String salary_range_begin) {
		this.salary_range_begin = salary_range_begin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLat_sw() {
		return lat_sw;
	}

	public void setLat_sw(String lat_sw) {
		this.lat_sw = lat_sw;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String[] getBenefits() {
		return benefits;
	}

	public void setBenefits(String[] benefits) {
		this.benefits = benefits;
	}

	public String getOffer_administrative_area_level_1() {
		return offer_administrative_area_level_1;
	}

	public void setOffer_administrative_area_level_1(String offer_administrative_area_level_1) {
		this.offer_administrative_area_level_1 = offer_administrative_area_level_1;
	}

	@Override
	public String toString() {
		return "ClassPojo [skills = " + skills + ", ref_trades_id = " + ref_trades_id + ", phone = " + phone + ", rome_v3 = " + rome_v3 + ", offer_id = " + offer_id +
				", ref_position_levels_id = " + ref_position_levels_id + ", publication_start_date = " + publication_start_date + ", lng_ne = " + lng_ne +
				", ref_contract_durations_id = " + ref_contract_durations_id + ", posts = " + posts + ", ref_studies_levels_id = " + ref_studies_levels_id + ", timetable = " +
				timetable + ", first_name = " + first_name + ", ref_sectors_id = " + ref_sectors_id + ", lat_center = " + lat_center + ", lng_center = " + lng_center +
				", description = " + description + ", recruiter_administrative_area_level_1 = " + recruiter_administrative_area_level_1 + ", recruiter_id = " + recruiter_id +
				", seniority = " + seniority + ", salary_range_end = " + salary_range_end + ", ref_salary_types_id = " + ref_salary_types_id + ", offer_postal_code = " +
				offer_postal_code + ", ref_company_sizes_id = " + ref_company_sizes_id + ", lng_sw = " + lng_sw + ", contract_types = " + contract_types + ", offer_locality = " +
				offer_locality + ", contract_start_date = " + contract_start_date + ", url = " + url + ", country = " + country + ", lat_ne = " + lat_ne +
				", recruiter_locality = " + recruiter_locality + ", recruiter_postal_code = " + recruiter_postal_code + ", salary_range_begin = " + salary_range_begin +
				", email = " + email + ", lat_sw = " + lat_sw + ", company = " + company + ", last_name = " + last_name + ", benefits = " + benefits +
				", offer_administrative_area_level_1 = " + offer_administrative_area_level_1 + "]";
	}

	@Override
	public JobOffering toJobObject() {

		GeoPoint location = getLocation();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Date pubDate = Date.from(LocalDate.parse(publication_start_date, formatter).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		//LocalDate pubDate = LocalDate.parse(publication_start_date, formatter);

		JobOffering offering = new JobOffering(id, getFirst_name(), location, getSkills(), getPhone(), getRome_v3(), getOffer_id(), pubDate, getDescription(), tryGetDouble(salary_range_end), tryGetDouble(
				salary_range_begin), getUrl(), getEmail(), getCompany());
		return offering;
	}

	private double tryGetDouble(String numStr) {
		try {
			return numStr != null && numStr.isEmpty() ? 0 : new Double(numStr);
		}catch (NumberFormatException ex){
			return 0;
		}

	}

	private GeoPoint getLocation() {
		if (getLat_center() != null && !getLat_center().isEmpty() && getLng_center() != null && !getLng_center().isEmpty()) {
			return new GeoPoint(new Double(getLat_center()), new Double(getLng_center()));
		}
		return null;
	}
}

