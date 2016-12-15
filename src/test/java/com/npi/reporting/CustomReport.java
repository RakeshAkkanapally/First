package com.npi.reporting;

import java.io.PrintWriter;
import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.TestListenerAdapter;
import org.testng.reporters.TestHTMLReporter;
import org.testng.xml.XmlSuite;

public class CustomReport extends TestListenerAdapter implements IReporter{

	private PrintWriter pwriter;
	/*
	
	
	public void generateReport(List<XmlSuite> xmlsuite, List<ISuite> isuite,
			String outdir) {
		
		try {
			pwriter = createWriter(outdir);
		} catch (IOException e) {
			System.err.println("Unable to create output file");
			e.printStackTrace();
			return;
		}
		startHtml();
		startTable();
		endTable();
		endHtml();
		TestHTMLReporter.generateTable(arg0, arg1, arg2, arg3, arg4);	
	}

	private void endHtml() {
		pwriter.println("</body>");
		pwriter.println("</html>");
	}

	private void endTable() {
		pwriter.println("</table>");
	}

	private void startTable() {
		pwriter.println("<table width='100%' border='5' cellpadding='2' cellspacing='2'>");
		
	}

	private void startHtml() {
		pwriter.println("<html>");
		pwriter.println("<head> <h> Automation Test Report </h> </head>");
		pwriter.println("<body>");
		
	}

	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,
			String arg2) {
		// TODO Auto-generated method stub
		
	}
	
*/

	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,
			String arg2) {
		// TODO Auto-generated method stub
		
	}
}
