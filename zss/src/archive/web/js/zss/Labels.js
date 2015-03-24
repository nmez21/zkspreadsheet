/* Label.js

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Jan 12, 2012 7:07:27 PM , Created by sam
}}IS_NOTE

Copyright (C) 2012 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
(function () {
/*
	var US = {
		_sheet: 'Sheet',
		_addSheet: 'Add sheet',
		_deleteSheet: 'Delete',
		_renameSheet: 'Rename',
		_moveSheetLeft: 'Move left',
		_moveSheetRight: 'Move right',
		_homePanel: 'Home',
		_formulaPanel: 'Formula',
		_insertPanel: 'Insert',
		_newBook: 'New Book',
		_saveBook: 'Save Book',
		_closeBook: 'Close',
		_exportPDF: 'Export to PDF',
		_paste: 'Paste',
		_pasteFormula: 'Formulas',
		_pasteValue: 'Paste Values',
		_pasteAllExceptBorder: 'All Except Borders',
		_pasteTranspose: 'Transpose',
		_pasteSpecial: 'Paste Special',
		_cut: 'Cut',
		_copy: 'Copy',
		_fontFamily: 'Font',
		_fontSize: 'Font Size',
		_fontBold: 'Bold',
		_fontItalic: 'Italic',
		_fontUnderline: 'Underline',
		_fontStrike: 'Strikeout',
		_borderColor: 'Border Color',
		_border: 'Border',
		_borderBottom: 'Bottom Border',
		_borderTop: 'Top Border',
		_borderLeft: 'Left Border',
		_borderRight: 'Right Border',
		_borderNo: 'No Borders',
		_borderAll: 'All Borders',
		_borderOutside: 'Outside Borders',
		_borderInside: 'Inside Borders',
		_borderInsideHorizontal: 'Inside Horizontal Borders',
		_borderInsideVertical: 'Inside Vertical Borders',
		_backColor: 'Background Color',
		_fontColor: 'Font Color',
		_verticalAlign: 'Vertical Align',
		_verticalAlignTop: 'Top Align',
		_verticalAlignMiddle: 'Middle Align',
		_verticalAlignBottom: 'Bottom Align',
		_horizontalAlign: 'Horizontal Align',
		_horizontalAlignLeft: 'Align Text Left',
		_horizontalAlignCenter: 'Center Text',
		_horizontalAlignRight: 'Align Text Right',
		_textIndentIncrease: 'Increase Indent',
		_textIndentDecrease: 'Decrease Indent',
		_wrapText: 'Wrap Text',
		_mergeAndCenter: 'Merge & Center',
		_mergeAcross: 'Merge Across',
		_mergeCell: 'Merge Cells',
		_unmergeCell: 'Unmerge Cells',
		_insert: 'Insert',
		_insertCell: 'Insert Cells...',
		_shiftCellRight: 'Shift Cells Right',
		_shiftCellDown: 'Shift Cells Down',
		_insertSheetRow: 'Insert Rows',
		_insertSheetColumn: 'Insert Columns',
		_format: 'Format',
		_rowHeight: 'Row Height',
		_columnWidth: 'Column Width',
		_hideRow: 'Hide Row',
		_unhideRow: 'Unhide Row',
		_hideColumn: 'Hide Column',
		_unhideColumn: 'Unhide Column',
		_formatCell: 'Format Cell',
		_lockCell: 'Lock Cell',
		_del: 'Delete',
		_deleteCell: 'Delete Cells...',
		_shiftCellLeft: 'Shift cells left',
		_shiftCellUp: 'Shift cells up',
		_deleteSheetRow: 'Delete Rows',
		_deleteSheetColumn: 'Delete Columns',
		_clear: 'Clear',
		_clearContent: 'Clear Content',
		_clearStyle: 'Clear Style',
		_clearAll: 'Clear All',
		_autoSum: 'AutoSum',
		_average: 'Average',
		_countNumber: 'Count Numbers',
		_max: 'Max',
		_min: 'Min',
		_moreFunction: 'More Functions...',
		_sort: 'Sort',
		_sortAndFilter: 'Sort & Filter',
		_sortAscending: 'Ascending',
		_sortDescending: 'Descending',
		_customSort: 'Custom Sort',
		_filter: 'Filter',
		_clearFilter: 'Clear',
		_reapplyFilter: 'Reapply',
		_insertPicture: 'Insert Picture',
		_columnChart: 'Column Chart',
		_columnChart3D: 'Column Chart 3D',
		_lineChart: 'Line Chart',
		_lineChart3D: 'Line Chart 3D',
		_pieChart: 'Pie Chart',
		_pieChart3D: 'Pie Chart 3D',
		_barChart: 'Bar Chart',
		_barChart3D: 'Bar Chart 3D',
		_areaChart: 'Area Chart',
		_scatterChart: 'Scatter Chart',
		_otherChart: 'Other Charts',
		_doughnutChart: 'Doughnut Chart',
		_hyperlink: 'Hyperlink',
		_insertFunction: "Insert Function",
		_financial: 'Financial',
		_logical: 'Logical',
		_text: 'Text',
		_dateAndTime: 'Date & Time',
		_lookupAndReference: 'Lookup & Reference',
		_mathAndTrig: 'Math & Trig',
		_moreFunction: 'More Functions',
		_protectSheet: 'Protect Sheet',
		_gridlines: 'Gridlines'
	};
	
zss.Labels = zk.$extends(zk.Object, {
	//TODO: Locale-dependent label
	$init: function (locale) {
		zk.copy(this, US);
	},
	$define: {
		sheet: null,
		addSheet: null,
		deleteSheet: null,
		renameSheet: null,
		moveSheetLeft: null,
		moveSheetRight: null,
		homePanel: null,
		formulaPanel: null,
		insertPanel: null,
		newBook: null,
		saveBook: null,
		closeBook: null,
		exportPDF: null,
		paste: null,
		pasteFormula: null,
		pasteValue: null,
		pasteAllExceptBorder: null,
		pasteTranspose: null,
		pasteSpecial: null,
		cut: null,
		copy: null,
		fontFamily: null,
		fontSize: null,
		fontBold: null,
		fontItalic: null,
		fontUnderline: null,
		fontStrike: null,
		borderColor: null,
		border: null,
		borderBottom: null,
		borderTop: null,
		borderLeft: null,
		borderRight: null,
		borderNo: null,
		borderAll: null,
		borderOutside: null,
		borderInside: null,
		borderInsideHorizontal: null,
		borderInsideVertical: null,
		backColor: null,
		fontColor: null,
		verticalAlign: null,
		verticalAlignTop: null,
		verticalAlignMiddle: null,
		verticalAlignBottom: null,
		horizontalAlign: null,
		horizontalAlignLeft: null,
		horizontalAlignCenter: null,
		horizontalAlignRight: null,
		textIndentIncrease: null,
		textIndentDecrease: null,
		wrapText: null,
		mergeAndCenter: null,
		mergeAcross: null,
		mergeCell: null,
		unmergeCell: null,
		insert: null,
		insertCell: null,
		shiftCellRight: null,
		shiftCellDown: null,
		insertSheetRow: null,
		insertSheetColumn: null,
		format: null,
		rowHeight: null,
		columnWidth: null,
		hideRow: null,
		unhideRow: null,
		hideColumn: null,
		unhideColumn: null,
		formatCell: null,
		lockCell: null,
		del: null,
		deleteCell: null,
		shiftCellLeft: null,
		shiftCellUp: null,
		deleteSheetRow: null,
		deleteSheetColumn: null,
		clear: null,
		clearContent: null,
		clearStyle: null,
		clearAll: null,
		autoSum: null,
		average: null,
		countNumber: null,
		max: null,
		min: null,
		moreFunction: null,
		sort: null,
		sortAndFilter: null,
		sortAscending: null,
		sortDescending: null,
		customSort: null,
		filter: null,
		clearFilter: null,
		reapplyFilter: null,
		insertPicture: null,
		columnChart: null,
		columnChart3D: null,
		lineChart: null,
		lineChart3D: null,
		pieChart: null,
		pieChart3D: null,
		barChart: null,
		barChart3D: null,
		areaChart: null,
		scatterChart: null,
		otherChart: null,
		doughnutChart: null,
		hyperlink: null,
		insertFunction: null,
		financial: null,
		logical: null,
		text: null,
		dateAndTime: null,
		lookupAndReference: null,
		mathAndTrig: null,
		moreFunction: null,
		protectSheet: null,
		gridlines: null
	}
});
*/
})();