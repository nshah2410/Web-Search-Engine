package com.webSearchEngine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.nodes.Document;


public class HtmlToTxt {

	public static void saveDoc(Document doc,String url) {
		try {
			BufferedWriter html = new BufferedWriter(
					new FileWriter(Path.htmlDirectoryPath + doc.title().replace('/', '-') + ".html"));
			html.write(doc.toString());
			html.close();

			BufferedWriter txt = new BufferedWriter(
					new FileWriter(Path.txtDirectoryPath + doc.title().replace('/', '-') + ".txt"));
			txt.write(url+"::"+doc.body().text().toLowerCase());
			txt.close();

		} catch (Exception e) {

		}
	}
}
