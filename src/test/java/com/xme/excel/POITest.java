package com.xme.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.junit.Test;

public class POITest {

	
	
	@Test
	public void testExcel() throws FileNotFoundException {
		
		OutputStream out = new FileOutputStream("D://test.xls");  
		
		// 声明一个工作薄  
        HSSFWorkbook workbook = new HSSFWorkbook();  
        // 生成一个表格  
        HSSFSheet sheet = workbook.createSheet("this is a title");  
        // 设置表格默认列宽度为15个字节  
        sheet.setDefaultColumnWidth(45);  
        // 生成一个样式  
        HSSFCellStyle style = workbook.createCellStyle();  
        // 设置这些样式  
        style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);  
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        
        // 生成一个字体  
        HSSFFont font = workbook.createFont();  
        font.setColor(HSSFColor.VIOLET.index);  
        font.setFontHeightInPoints((short) 12);  
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); 
        
        // 把字体应用到当前的样式  
        style.setFont(font);  
        
        // 生成并设置另一个样式  
        HSSFCellStyle style2 = workbook.createCellStyle();  
        style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);  
        style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);  
        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); 
        
        // 生成另一个字体  
        HSSFFont font2 = workbook.createFont();  
        font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);  
        
        // 把字体应用到当前的样式  
        style2.setFont(font2);  
  
        // 声明一个画图的顶级管理器  
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();  
        // 定义注释的大小和位置,详见文档  
        HSSFComment comment = patriarch.createComment(new HSSFClientAnchor(0,  
                0, 0, 0, (short) 4, 2, (short) 6, 5));  
        // 设置注释内容  
        comment.setString(new HSSFRichTextString("可以在POI中添加注释！"));  
        // 设置注释作者，当鼠标移动到单元格上是可以在状态栏中看到该内容.  
        comment.setAuthor("leno");  
  
        // 产生表格标题行  
        HSSFRow row = sheet.createRow(0);  
        String[] headers = { "客户名称", "客户编号", "计算模式", "客户收益率（%）"}; 
        
        for (int i = 0; i < headers.length; i++) {  
            HSSFCell cell = row.createCell(i);  
            cell.setCellStyle(style);  
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);  
            cell.setCellValue(text);  
        }  
  
        //标题值
        HSSFRow row1 = sheet.createRow(1);  
        String[] headerValues = {"1","2","3","4"};
        
        for (int i = 0; i < headerValues.length; i++) {  
            HSSFCell cell = row1.createCell(i);  
            cell.setCellStyle(style2);  
            HSSFRichTextString text = new HSSFRichTextString(headerValues[i]);  
            cell.setCellValue(text);  
        }  
              
        String[] columns = {"合同支付币种","支付金额","存款利率","支付币种/融资币种的境内即期汇率卖出价","融资币种","融资金额","融资利率","融资币种/保证金币种的境内远期汇率卖出价","保证金币种","保证金金额","保证金币种/人民币的境内即期售汇汇率"};
        String[] columnsValues = {"a","b","c","d","e","f","g","h","i","j","k"};
        
        for (int i = 0; i < columns.length; i++) {
        	 HSSFRow row2 = sheet.createRow(i+3);
        	 HSSFCell cell2 = row2.createCell(0);
        	 cell2.setCellStyle(style);
        	 HSSFRichTextString text2 = new HSSFRichTextString(columns[i]);
        	 cell2.setCellValue(text2);
        	 
	       	 HSSFCell cell3 = row2.createCell(1);
	       	 cell3.setCellStyle(style2);
	       	 HSSFRichTextString text3 = new HSSFRichTextString(columnsValues[i]);
	       	 cell3.setCellValue(text3);
		}
           
        
        
//        for (int i = 0; i < columnsValues.length; i++) {
//       	 HSSFRow row3 = sheet.createRow(i+3);
//       	 HSSFCell cell3 = row3.createCell(1);
//       	 cell3.setCellStyle(style2);
//       	 HSSFRichTextString text3 = new HSSFRichTextString(columnsValues[i]);
//       	 cell3.setCellValue(text3);
//		}      
        
  
          
        try {  
            workbook.write(out);  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
	}
}
