package com.sp.contorller;

import com.google.common.collect.Table.Cell;
import com.sp.domain.User;
import com.sp.service.SampleService;
import lombok.extern.slf4j.Slf4j;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.lang.*;
import java.net.URLEncoder;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.net.ssl.SSLEngineResult.Status;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {


	 @RequestMapping(value = "/zzz",method = RequestMethod.GET)
	 private ResponseEntity<User> test() {
	
		 User user = new User();
		 user.setCRT_DT("생성날");
		 user.setUSR_EML("이멜");
		 user.setUSR_LGN("로긴");
		 user.setUSR_TEL("tel");
		 
		 return new ResponseEntity<User>(user , HttpStatus.OK);

	}
	 
	@RequestMapping(value = "/zzz/{id}",method = RequestMethod.GET)
	 private ResponseEntity<User> test2(@PathVariable("id") String id) {
	
		User user = new User();
		if(id.equals("ggg")) {
		 user.setCRT_DT("ggg");
		 user.setUSR_EML("ggg");
		 user.setUSR_LGN("ggg");
		 user.setUSR_TEL("ggg");
		}else {
		 user.setCRT_DT("zzzzz");
		 user.setUSR_EML("zzzzz");
		 user.setUSR_LGN("zzzzz");
		 user.setUSR_TEL("zzzzz");	
		}
		 
		 return new ResponseEntity<User>(user , HttpStatus.OK);

	}
	 
	 
    
}
