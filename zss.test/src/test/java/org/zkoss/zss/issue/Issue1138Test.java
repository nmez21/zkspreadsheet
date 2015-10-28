package org.zkoss.zss.issue;

import java.util.Locale;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.zkoss.zss.Setup;
import org.zkoss.zss.Util;
import org.zkoss.zss.api.Range;
import org.zkoss.zss.api.Ranges;
import org.zkoss.zss.api.model.Book;
import org.zkoss.zss.api.model.CellData;
import org.zkoss.zss.api.model.CellData.CellType;
import org.zkoss.zss.api.model.Sheet;
import org.zkoss.zss.model.SBook;
import org.zkoss.zss.model.SBooks;
import org.zkoss.zss.model.SSheet;
import org.zkoss.zss.range.SRange;
import org.zkoss.zss.range.SRanges;
import org.zkoss.zss.api.Exporters;

public class Issue1138Test {
	
	@BeforeClass
	public static void setUpLibrary() throws Exception {
		Setup.touch();
	}
	
	@Before
	public void startUp() throws Exception {
		Setup.pushZssLocale(Locale.TAIWAN);
	}
	
	@After
	public void tearDown() throws Exception {
		Setup.popZssLocale();
	}

	/**
	 * Test a book with print area and export it and it should not throw exception
	 * @throws IOException 
	 */
	@Test
	public void testExportRichText() throws IOException {
		File temp = Setup.getTempFile("Issue1138ExportRichText",".xls");
		File temp2 = Setup.getTempFile("Issue1138ExportRichText",".xlsx");
		try  {
			Book book = Util.loadBook(this, "book/1138-export-richtext.xls");
			Assert.assertTrue("No Exception", true);
			Exporters.getExporter("xls").export(book, temp);
			
			Assert.assertTrue("No Exception", true);
			Exporters.getExporter("xlsx").export(book, temp2);
//			Filedownload.save(os.toByteArray(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "scale0.xlsx"); 
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Exception when load \"issue/book/1138-export-richtext.xls\":\n" + e, false);
		}
	}
}
