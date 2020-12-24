package com.myclinic.doctor.registration.view;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
public class Qualification {

	@Id
	private String qualificaitonId;
	private String qualificationCode;
	private String description;
	private int year;
	public String getQualificationCode() {
		return qualificationCode;
	}
	public void setQualificationCode(String qualificationCode) {
		this.qualificationCode = qualificationCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
