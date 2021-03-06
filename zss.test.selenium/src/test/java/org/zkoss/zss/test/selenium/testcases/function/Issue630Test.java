package org.zkoss.zss.test.selenium.testcases.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.zkoss.zss.test.selenium.AssertUtil;
import org.zkoss.zss.test.selenium.Setup;
import org.zkoss.zss.test.selenium.ZSSTestCase;
import org.zkoss.zss.test.selenium.entity.CellWidget;
import org.zkoss.zss.test.selenium.entity.SheetCtrlWidget;
import org.zkoss.zss.test.selenium.entity.SpreadsheetWidget;
import org.zkoss.zss.test.selenium.entity.ZSStyle;

public class Issue630Test extends ZSSTestCase {
	
	@Test
	public void testZSS631() throws Exception {
		getTo("/issue3/631-fill-merge.zul");
		
		SpreadsheetWidget spreadsheet = getSpreadsheet();
		SheetCtrlWidget sheetCtrl = spreadsheet.getSheetCtrl();
	    CellWidget cellC2 = sheetCtrl.getCell("C2");
	    CellWidget cellC3 = sheetCtrl.getCell("C3");
	    CellWidget cellC4 = sheetCtrl.getCell("C4");
	    CellWidget cellC5 = sheetCtrl.getCell("C5");
	    CellWidget cellC6 = sheetCtrl.getCell("C6");
	    CellWidget cellC9 = sheetCtrl.getCell("C9");
	    CellWidget cellC10 = sheetCtrl.getCell("C10");
	    CellWidget cellC11 = sheetCtrl.getCell("C11");
	    CellWidget cellC12 = sheetCtrl.getCell("C12");
	    CellWidget cellC13 = sheetCtrl.getCell("C13");
	    CellWidget cellC14 = sheetCtrl.getCell("C14");
	    CellWidget cellC15 = sheetCtrl.getCell("C15");
		CellWidget cellF2 = sheetCtrl.getCell("F2");
		CellWidget cellF3 = sheetCtrl.getCell("F3");
		CellWidget cellF4 = sheetCtrl.getCell("F4");
		CellWidget cellF5 = sheetCtrl.getCell("F5");
		CellWidget cellF6 = sheetCtrl.getCell("F6");
		CellWidget cellF9 = sheetCtrl.getCell("F9");
		CellWidget cellF10 = sheetCtrl.getCell("F10");
		CellWidget cellF11 = sheetCtrl.getCell("F11");
		CellWidget cellF12 = sheetCtrl.getCell("F12");
		CellWidget cellF13 = sheetCtrl.getCell("F13");
		CellWidget cellF14 = sheetCtrl.getCell("F14");
		CellWidget cellF15 = sheetCtrl.getCell("F15");
	    CellWidget cellG2 = sheetCtrl.getCell("G2");
	    CellWidget cellG3 = sheetCtrl.getCell("G3");
	    CellWidget cellG4 = sheetCtrl.getCell("G4");
	    CellWidget cellG5 = sheetCtrl.getCell("G5");
	    CellWidget cellG6 = sheetCtrl.getCell("G6");
	    CellWidget cellG9 = sheetCtrl.getCell("G9");
	    CellWidget cellG10 = sheetCtrl.getCell("G10");
	    CellWidget cellG11 = sheetCtrl.getCell("G11");
	    CellWidget cellG12 = sheetCtrl.getCell("G12");
	    CellWidget cellG13 = sheetCtrl.getCell("G13");
	    CellWidget cellG14 = sheetCtrl.getCell("G14");
	    CellWidget cellG15 = sheetCtrl.getCell("G15");
	    CellWidget cellK2 = sheetCtrl.getCell("K2");
	    CellWidget cellK3 = sheetCtrl.getCell("K3");
	    CellWidget cellK4 = sheetCtrl.getCell("K4");
	    CellWidget cellK5 = sheetCtrl.getCell("K5");
	    CellWidget cellK6 = sheetCtrl.getCell("K6");
	    CellWidget cellK9 = sheetCtrl.getCell("K9");
	    CellWidget cellK10 = sheetCtrl.getCell("K10");
	    CellWidget cellK11 = sheetCtrl.getCell("K11");
	    CellWidget cellK12 = sheetCtrl.getCell("K12");
	    CellWidget cellK13 = sheetCtrl.getCell("K13");
	    CellWidget cellK14 = sheetCtrl.getCell("K14");
	    CellWidget cellK15 = sheetCtrl.getCell("K15");
		click(jq("@button:eq(0)"));
		waitForTime(Setup.getTimeoutL0());
		
		assertEquals("4", cellC9.getText());
		assertTrue(cellC9.isMerged());
		assertEquals("5", cellC10.getText());
		assertTrue(cellC10.isMerged());
		assertEquals("6", cellC11.getText());
		assertTrue(cellC11.isMerged());
		assertEquals("7", cellC12.getText());
		assertTrue(cellC12.isMerged());
		assertEquals("8", cellC13.getText());
		assertTrue(cellC13.isMerged());
		assertEquals("9", cellC14.getText());
		assertTrue(cellC14.isMerged());
		
		assertEquals("6", cellF9.getText());
		assertFalse(cellF9.isMerged());
		assertEquals("8", cellF10.getText());
		assertFalse(cellF10.isMerged());
		assertEquals("10", cellF11.getText());
		assertFalse(cellF11.isMerged());
		assertEquals("12", cellF12.getText());
		assertFalse(cellF12.isMerged());
		assertEquals("14", cellF13.getText());
		assertFalse(cellF13.isMerged());
		assertEquals("16", cellF14.getText());
		assertFalse(cellF14.isMerged());
		
	    assertEquals("9", cellG9.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG9.$n("real").getCssValue("color"));
	    assertTrue(cellG9.isMerged());
	    assertEquals("", cellG10.getText());
	    assertFalse(cellG10.isMerged());
	    assertEquals("11", cellG11.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG11.$n("real").getCssValue("color"));
	    assertTrue(cellG11.isMerged());
	    assertEquals("", cellG12.getText());
	    assertFalse(cellG12.isMerged());
	    assertEquals("13", cellG13.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG13.$n("real").getCssValue("color"));
	    assertTrue(cellG13.isMerged());
	    assertEquals("", cellG14.getText());
	    assertFalse(cellG14.isMerged());
	    
	    assertEquals("9", cellK9.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK9.$n("real").getCssValue("color"));
	    assertTrue(cellK9.isMerged());
	    assertEquals("", cellK10.getText());
	    assertTrue(cellK10.isMerged());
	    assertEquals("11", cellK11.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK11.$n("real").getCssValue("color"));
	    assertTrue(cellK11.isMerged());
	    assertEquals("", cellK12.getText());
	    assertTrue(cellK12.isMerged());
	    assertEquals("13", cellK13.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK13.$n("real").getCssValue("color"));
	    assertTrue(cellK13.isMerged());
	    assertEquals("", cellK14.getText());
	    assertTrue(cellK14.isMerged());
	    
		click(jq("@button:eq(1)"));
		waitForTime(Setup.getTimeoutL0());
		
		assertEquals("-2", cellC3.getText());
		assertTrue(cellC3.isMerged());
		assertEquals("-1", cellC4.getText());
		assertTrue(cellC4.isMerged());
		assertEquals("0", cellC5.getText());
		assertTrue(cellC5.isMerged());
		assertEquals("1", cellC6.getText());
		assertTrue(cellC6.isMerged());

		assertEquals("-6", cellF3.getText());
		assertFalse(cellF3.isMerged());
		assertEquals("-4", cellF4.getText());
		assertFalse(cellF4.isMerged());
		assertEquals("-2", cellF5.getText());
		assertFalse(cellF5.isMerged());
		assertEquals("0", cellF6.getText());
		assertFalse(cellF6.isMerged());
		
	    assertEquals("3", cellG3.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG3.$n("real").getCssValue("color"));
	    assertTrue(cellG3.isMerged());
	    assertEquals("", cellG4.getText());
	    assertFalse(cellG4.isMerged());
	    assertEquals("5", cellG5.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG5.$n("real").getCssValue("color"));
	    assertTrue(cellG5.isMerged());
	    assertEquals("", cellG6.getText());
	    assertFalse(cellG6.isMerged());
	    
	    assertEquals("3", cellK3.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK3.$n("real").getCssValue("color"));
	    assertTrue(cellK9.isMerged());
	    assertEquals("", cellK4.getText());
	    assertTrue(cellK4.isMerged());
	    assertEquals("5", cellK5.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK5.$n("real").getCssValue("color"));
	    assertTrue(cellK5.isMerged());
	    assertEquals("", cellK6.getText());
	    assertTrue(cellK6.isMerged());
	    
		click(jq("@button:eq(2)"));
		waitForTime(Setup.getTimeoutL0());
		
		assertEquals("4", cellC9.getText());
		assertTrue(cellC9.isMerged());
		assertEquals("5", cellC10.getText());
		assertTrue(cellC10.isMerged());
		assertEquals("6", cellC11.getText());
		assertTrue(cellC11.isMerged());
		assertEquals("7", cellC12.getText());
		assertTrue(cellC12.isMerged());
		assertEquals("8", cellC13.getText());
		assertTrue(cellC13.isMerged());
		assertEquals("9", cellC14.getText());
		assertTrue(cellC14.isMerged());
		assertEquals("10", cellC15.getText());
		assertTrue(cellC15.isMerged());
		
		assertEquals("6", cellF9.getText());
		assertFalse(cellF9.isMerged());
		assertEquals("8", cellF10.getText());
		assertFalse(cellF10.isMerged());
		assertEquals("10", cellF11.getText());
		assertFalse(cellF11.isMerged());
		assertEquals("12", cellF12.getText());
		assertFalse(cellF12.isMerged());
		assertEquals("14", cellF13.getText());
		assertFalse(cellF13.isMerged());
		assertEquals("16", cellF14.getText());
		assertFalse(cellF14.isMerged());
		assertEquals("18", cellF15.getText());
		assertFalse(cellF15.isMerged());
		
	    assertEquals("9", cellG9.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG9.$n("real").getCssValue("color"));
	    assertTrue(cellG9.isMerged());
	    assertEquals("", cellG10.getText());
	    assertFalse(cellG10.isMerged());
	    assertEquals("11", cellG11.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG11.$n("real").getCssValue("color"));
	    assertTrue(cellG11.isMerged());
	    assertEquals("", cellG12.getText());
	    assertFalse(cellG12.isMerged());
	    assertEquals("13", cellG13.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG13.$n("real").getCssValue("color"));
	    assertTrue(cellG13.isMerged());
	    assertEquals("", cellG14.getText());
	    assertFalse(cellG14.isMerged());
	    assertEquals("", cellG15.getText());
	    assertFalse(cellG15.isMerged());
	    
	    assertEquals("9", cellK9.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK9.$n("real").getCssValue("color"));
	    assertTrue(cellK9.isMerged());
	    assertEquals("", cellK10.getText());
	    assertTrue(cellK10.isMerged());
	    assertEquals("11", cellK11.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK11.$n("real").getCssValue("color"));
	    assertTrue(cellK11.isMerged());
	    assertEquals("", cellK12.getText());
	    assertTrue(cellK12.isMerged());
	    assertEquals("13", cellK13.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK13.$n("real").getCssValue("color"));
	    assertTrue(cellK13.isMerged());
	    assertEquals("", cellK14.getText());
	    assertTrue(cellK14.isMerged());
	    assertEquals("", cellK15.getText());
	    assertFalse(cellK15.isMerged());
	    
		click(jq("@button:eq(3)"));
		waitForTime(Setup.getTimeoutL0());
		
		assertEquals("-3", cellC2.getText());
		assertTrue(cellC2.isMerged());
		assertEquals("-2", cellC3.getText());
		assertTrue(cellC3.isMerged());
		assertEquals("-1", cellC4.getText());
		assertTrue(cellC4.isMerged());
		assertEquals("0", cellC5.getText());
		assertTrue(cellC5.isMerged());
		assertEquals("1", cellC6.getText());
		assertTrue(cellC6.isMerged());

		assertEquals("-8", cellF2.getText());
		assertFalse(cellF2.isMerged());
		assertEquals("-6", cellF3.getText());
		assertFalse(cellF3.isMerged());
		assertEquals("-4", cellF4.getText());
		assertFalse(cellF4.isMerged());
		assertEquals("-2", cellF5.getText());
		assertFalse(cellF5.isMerged());
		assertEquals("0", cellF6.getText());
		assertFalse(cellF6.isMerged());
		
	    assertEquals("", cellG2.getText());
	    assertFalse(cellG2.isMerged());
	    assertEquals("3", cellG3.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG3.$n("real").getCssValue("color"));
	    assertTrue(cellG3.isMerged());
	    assertEquals("", cellG4.getText());
	    assertFalse(cellG4.isMerged());
	    assertEquals("5", cellG5.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellG5.$n("real").getCssValue("color"));
	    assertTrue(cellG5.isMerged());
	    assertEquals("", cellG6.getText());
	    assertFalse(cellG6.isMerged());
	    
	    assertEquals("", cellK2.getText());
	    assertFalse(cellK2.isMerged());
	    assertEquals("3", cellK3.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK3.$n("real").getCssValue("color"));
	    assertTrue(cellK9.isMerged());
	    assertEquals("", cellK4.getText());
	    assertTrue(cellK4.isMerged());
	    assertEquals("5", cellK5.getText());
	    assertEquals("rgba(255, 0, 0, 1)", cellK5.$n("real").getCssValue("color"));
	    assertTrue(cellK5.isMerged());
	    assertEquals("", cellK6.getText());
	    assertTrue(cellK6.isMerged());
	}
	
	
	@Test
	public void testZSS631_RL() throws Exception {
		getTo("/issue3/631-fill-merge-rl.zul");
		
		SpreadsheetWidget spreadsheet = getSpreadsheet();
		SheetCtrlWidget sheetCtrl = spreadsheet.getSheetCtrl();
	    CellWidget cellB4 = sheetCtrl.getCell("B4");
	    CellWidget cellC4 = sheetCtrl.getCell("C4");
	    CellWidget cellD4 = sheetCtrl.getCell("D4");
	    CellWidget cellE4 = sheetCtrl.getCell("E4");
	    CellWidget cellF4 = sheetCtrl.getCell("F4");
	    CellWidget cellH4 = sheetCtrl.getCell("H4");
	    CellWidget cellI4 = sheetCtrl.getCell("I4");
	    CellWidget cellJ4 = sheetCtrl.getCell("J4");
	    CellWidget cellK4 = sheetCtrl.getCell("K4");
	    CellWidget cellL4 = sheetCtrl.getCell("L4");
	    CellWidget cellM4 = sheetCtrl.getCell("M4");
		CellWidget cellB8 = sheetCtrl.getCell("B8");
		CellWidget cellC8 = sheetCtrl.getCell("C8");
		CellWidget cellD8 = sheetCtrl.getCell("D8");
		CellWidget cellE8 = sheetCtrl.getCell("E8");
		CellWidget cellF8 = sheetCtrl.getCell("F8");
		CellWidget cellH8 = sheetCtrl.getCell("H8");
		CellWidget cellI8 = sheetCtrl.getCell("I8");
		CellWidget cellJ8 = sheetCtrl.getCell("J8");
		CellWidget cellK8 = sheetCtrl.getCell("K8");
		CellWidget cellL8 = sheetCtrl.getCell("L8");
	    CellWidget cellM8 = sheetCtrl.getCell("M8");
		CellWidget cellB9 = sheetCtrl.getCell("B9");
		CellWidget cellC9 = sheetCtrl.getCell("C9");
		CellWidget cellD9 = sheetCtrl.getCell("D9");
		CellWidget cellE9 = sheetCtrl.getCell("E9");
		CellWidget cellF9 = sheetCtrl.getCell("F9");
		CellWidget cellH9 = sheetCtrl.getCell("H9");
		CellWidget cellI9 = sheetCtrl.getCell("I9");
		CellWidget cellJ9 = sheetCtrl.getCell("J9");
		CellWidget cellK9 = sheetCtrl.getCell("K9");
		CellWidget cellL9 = sheetCtrl.getCell("L9");
	    CellWidget cellM9 = sheetCtrl.getCell("M9");
		CellWidget cellB13 = sheetCtrl.getCell("B13");
		CellWidget cellC13 = sheetCtrl.getCell("C13");
		CellWidget cellD13 = sheetCtrl.getCell("D13");
		CellWidget cellE13 = sheetCtrl.getCell("E13");
		CellWidget cellF13 = sheetCtrl.getCell("F13");
	    CellWidget cellH13 = sheetCtrl.getCell("H13");
	    CellWidget cellI13 = sheetCtrl.getCell("I13");
	    CellWidget cellJ13 = sheetCtrl.getCell("J13");
	    CellWidget cellK13 = sheetCtrl.getCell("K13");
	    CellWidget cellL13 = sheetCtrl.getCell("L13");
	    CellWidget cellM13 = sheetCtrl.getCell("M13");
	    CellWidget cellB14 = sheetCtrl.getCell("B14");
	    CellWidget cellC14 = sheetCtrl.getCell("C14");
	    CellWidget cellE14 = sheetCtrl.getCell("E14");
	    CellWidget cellI14 = sheetCtrl.getCell("I14");
	    CellWidget cellK14 = sheetCtrl.getCell("K14");
	    CellWidget cellM14 = sheetCtrl.getCell("M14");
		click(jq("@button:eq(0)"));
		waitForTime(Setup.getTimeoutL0());
		assertEquals("3", cellH4.getText());
		assertTrue(cellH4.isMerged());
		assertEquals("4", cellI4.getText());
		assertTrue(cellI4.isMerged());
		assertEquals("5", cellJ4.getText());
		assertTrue(cellJ4.isMerged());
		assertEquals("6", cellK4.getText());
		assertTrue(cellK4.isMerged());
		assertEquals("7", cellL4.getText());
		assertTrue(cellL4.isMerged());
		assertEquals("4", cellH8.getText());
		assertEquals("6", cellI8.getText());
		assertEquals("8", cellJ8.getText());
		assertEquals("10", cellK8.getText());
		assertEquals("12", cellL8.getText());
		assertEquals("", cellH9.getText());
		assertFalse(cellH9.isMerged());
		assertEquals("9", cellI9.getText());
		assertTrue(cellI9.isMerged());
		assertEquals("", cellJ9.getText());
		assertFalse(cellJ9.isMerged());
		assertEquals("11", cellK9.getText());
		assertTrue(cellK9.isMerged());
		assertEquals("4", cellH13.getText());
		assertEquals("6", cellI13.getText());
		assertEquals("8", cellJ13.getText());
		assertEquals("10", cellK13.getText());
		assertEquals("12", cellL13.getText());
		assertEquals("9", cellI14.getText());
		assertTrue(cellI14.isMerged());
		assertEquals("11", cellK14.getText());
		assertTrue(cellK14.isMerged());
		click(jq("@button:eq(1)"));
		waitForTime(Setup.getTimeoutL0());
	    assertEquals("-2", cellC4.getText());
	    assertTrue(cellC4.isMerged());
	    assertEquals("-1", cellD4.getText());
	    assertTrue(cellD4.isMerged());
	    assertEquals("0", cellE4.getText());
	    assertTrue(cellE4.isMerged());
	    assertEquals("1", cellF4.getText());
	    assertTrue(cellF4.isMerged());
	    assertEquals("-6", cellC8.getText());
	    assertEquals("-4", cellD8.getText());
	    assertEquals("-2", cellE8.getText());
	    assertEquals("0", cellF8.getText());
	    assertEquals("3", cellC9.getText());
	    assertTrue(cellC9.isMerged());
	    assertEquals("", cellD9.getText());
	    assertFalse(cellD9.isMerged());
	    assertEquals("5", cellE9.getText());
	    assertTrue(cellE9.isMerged());
	    assertEquals("", cellF9.getText());
	    assertFalse(cellF9.isMerged());
	    assertEquals("-6", cellC13.getText());
	    assertEquals("-4", cellD13.getText());
	    assertEquals("-2", cellE13.getText());
	    assertEquals("0", cellF13.getText());
	    assertEquals("3", cellC14.getText());
	    assertTrue(cellC14.isMerged());
	    assertEquals("5", cellE14.getText());
	    assertTrue(cellE14.isMerged());
	    driver().navigate().refresh();
	    waitUntilProcessEnd(Setup.getTimeoutL0());
		click(jq("@button:eq(2)"));
		waitForTime(Setup.getTimeoutL0());
		assertEquals("3", cellH4.getText());
		assertTrue(cellH4.isMerged());
		assertEquals("4", cellI4.getText());
		assertTrue(cellI4.isMerged());
		assertEquals("5", cellJ4.getText());
		assertTrue(cellJ4.isMerged());
		assertEquals("6", cellK4.getText());
		assertTrue(cellK4.isMerged());
		assertEquals("7", cellL4.getText());
		assertTrue(cellL4.isMerged());
		assertEquals("8", cellM4.getText());
		assertTrue(cellM4.isMerged());
		assertEquals("4", cellH8.getText());
		assertEquals("6", cellI8.getText());
		assertEquals("8", cellJ8.getText());
		assertEquals("10", cellK8.getText());
		assertEquals("12", cellL8.getText());
		assertEquals("14", cellM8.getText());
		assertEquals("", cellH9.getText());
		assertFalse(cellH9.isMerged());
		assertEquals("9", cellI9.getText());
		assertTrue(cellI9.isMerged());
		assertEquals("", cellJ9.getText());
		assertFalse(cellJ9.isMerged());
		assertEquals("11", cellK9.getText());
		assertTrue(cellK9.isMerged());
		assertEquals("", cellL9.getText());
		assertFalse(cellL9.isMerged());
		assertEquals("", cellM9.getText());
		assertFalse(cellM9.isMerged());
		assertEquals("4", cellH13.getText());
		assertEquals("6", cellI13.getText());
		assertEquals("8", cellJ13.getText());
		assertEquals("10", cellK13.getText());
		assertEquals("12", cellL13.getText());
		assertEquals("14", cellM13.getText());
		assertEquals("9", cellI14.getText());
		assertTrue(cellI14.isMerged());
		assertEquals("11", cellK14.getText());
		assertTrue(cellK14.isMerged());
		assertEquals("", cellM14.getText());
		assertFalse(cellM14.isMerged());
		click(jq("@button:eq(3)"));
		waitForTime(Setup.getTimeoutL0());
	    assertEquals("-3", cellB4.getText());
	    assertTrue(cellB4.isMerged());
	    assertEquals("-2", cellC4.getText());
	    assertTrue(cellC4.isMerged());
	    assertEquals("-1", cellD4.getText());
	    assertTrue(cellD4.isMerged());
	    assertEquals("0", cellE4.getText());
	    assertTrue(cellE4.isMerged());
	    assertEquals("1", cellF4.getText());
	    assertTrue(cellF4.isMerged());
	    assertEquals("-8", cellB8.getText());
	    assertEquals("-6", cellC8.getText());
	    assertEquals("-4", cellD8.getText());
	    assertEquals("-2", cellE8.getText());
	    assertEquals("0", cellF8.getText());
	    assertEquals("", cellB9.getText());
	    assertFalse(cellB9.isMerged());
	    assertEquals("3", cellC9.getText());
	    assertTrue(cellC9.isMerged());
	    assertEquals("", cellD9.getText());
	    assertFalse(cellD9.isMerged());
	    assertEquals("5", cellE9.getText());
	    assertTrue(cellE9.isMerged());
	    assertEquals("", cellF9.getText());
	    assertFalse(cellF9.isMerged());
	    assertEquals("-8", cellB13.getText());
	    assertEquals("-6", cellC13.getText());
	    assertEquals("-4", cellD13.getText());
	    assertEquals("-2", cellE13.getText());
	    assertEquals("0", cellF13.getText());
	    assertEquals("", cellB14.getText());
	    assertFalse(cellB14.isMerged());
	    assertEquals("3", cellC14.getText());
	    assertTrue(cellC14.isMerged());
	    assertEquals("5", cellE14.getText());
	    assertTrue(cellE14.isMerged());
	}

	@Ignore("Rewrite condition")
	@Test
	public void testZSS632() throws Exception {
		getTo("/issue3/632-insert-mail.zul");
		
		CellWidget cellA1 = getSpreadsheet().getSheetCtrl().getCell("A1");
		click(jq("@button:eq(0)"));
		//waitUntil(1, ExpectedConditions.textToBePresentInElement(cellA1.$n(), "untitled"));
		cellA1.focus();
		waitUntilProcessEnd(Setup.getTimeoutL0());
		click(jq(ZSStyle.HYPERLINK_BTN));
		waitUntilProcessEnd(Setup.getTimeoutL0());
		assertEquals("Inserted Mail does not be treated as mail link",
				"E-mail Address", jq("@window button:disabled").toWebElement().getText());
	}
	
	@Test
	public void testZSS639() throws Exception {
		getTo("/issue3/639-formula-freeze.zul");
		
		click(jq("@button:eq(0)"));
		waitUntilProcessEnd(Setup.getTimeoutL0());
		click(jq("@button:eq(1)"));
		waitUntilProcessEnd(Setup.getTimeoutL0());
		click(jq("@button:eq(2)"));
		waitUntilProcessEnd(Setup.getTimeoutL0());
		click(jq("@button:eq(3)"));
		waitUntilProcessEnd(Setup.getTimeoutL0());
		click(jq("@button:eq(0)"));
		waitUntilProcessEnd(Setup.getTimeoutL0());
		AssertUtil.assertNoJSError();
	}
}
