package org.testing.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

public class ExtentReport 
{

	public static ExtentReports extent()
	{
		String filename=new SimpleDateFormat("yyyy-MM-dd-HH-mm").format(new Date());
		String reportLocation = "C:\\Users\\anurag.v.singh\\Documents\\Sel\\API\\Reports" + filename + ".html";
		ExtentHtmlReporter html = new ExtentHtmlReporter(reportLocation);
		ExtentXReporter extentx = new ExtentXReporter("localhost");
		ExtentReports ex=new ExtentReports();
		ex.attachReporter(html, extentx);
		return ex;
	}
}
