package com.github.tempest200903.ganttchart.model;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class ProjectExporterTest {

	public ProjectExporterTest() {
	}

	@Test
	public void testDoExport() throws FileNotFoundException, IOException {
		Project project = new Project();
		project.setName("name-dummy-1");
		project.setStartDate(new Date().getTime());
		ProjectExporter projectExporter = new ProjectExporter();
		File actualDirectory = new File("target/actual");
		FileUtils.forceMkdir(actualDirectory);
		File file = new File(actualDirectory, "project1001.xml");
		projectExporter.doExport(project, file);

		assertTrue(file.exists());
	}

}
