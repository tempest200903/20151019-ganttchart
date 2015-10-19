package com.github.tempest200903.ganttchart.model;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class ProjectExporter {

	void doExport(Project project, File file) throws FileNotFoundException, IOException {
		try (OutputStream out = new FileOutputStream(file)) {
			try (XMLEncoder xmlEncoder = new XMLEncoder(out)) {
				xmlEncoder.writeObject(project);
			}
		}
	}

}
