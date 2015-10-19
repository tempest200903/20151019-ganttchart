package com.github.tempest200903.ganttchart.model;

import java.time.LocalDate;

/**
 * プロジェクト。
 * 
 * @author simei
 *
 */
public final class Project {

	/**
	 * プロジェクト名前。
	 */
	private String projectName;

	/**
	 * プロジェクト開始日。
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
