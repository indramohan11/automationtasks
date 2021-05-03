package reusablecomponents;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectRepo;

public class ExtentReport extends ObjectRepo  
{
	public  static ExtentReports setupReport()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date= new Date();
		String actualDate=format.format(date);
		String reportPath=System.getProperty("user.dir")+"/reports/ExecutionReport_"+actualDate+".html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
		 extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("Document title");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("reporterName");
		return extent;
		
	}
	
	
	
	
			

}
