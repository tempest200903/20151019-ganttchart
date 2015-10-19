package com.github.tempest200903.ganttchart.model;

import java.time.LocalDate;

/**
 * �v���W�F�N�g�B
 * 
 * @author simei
 * @since 1.0
 */
public final class Project {

	/**
	 * �v���W�F�N�g���O�B
	 */
	private String name;

	/**
	 * �v���W�F�N�g�J�n���B
	 */
	private long startDate;

	public String getName() {
		return name;
	}

	public long getStartDate() {
		return startDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}

}
