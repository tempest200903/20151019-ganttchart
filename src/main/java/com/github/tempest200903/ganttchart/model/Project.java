package com.github.tempest200903.ganttchart.model;

import java.time.LocalDate;

/**
 * プロジェクト。
 * 
 * @author simei
 * @since 1.0
 */
public final class Project {

	/**
	 * プロジェクト名前。
	 */
	private String name;

	/**
	 * プロジェクト開始日。
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
