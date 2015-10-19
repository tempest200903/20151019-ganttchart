package com.github.tempest200903.ganttchart.model;

import java.time.LocalDate;

/**
 * �v���W�F�N�g�B
 * 
 * @author simei
 *
 */
public final class Project {

	/**
	 * �v���W�F�N�g���O�B
	 */
	private String projectName;

	/**
	 * �v���W�F�N�g�J�n���B
	 */
	private LocalDate startDate;

	public String getProjectName() {
		return projectName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

}
