package com.bmpl.ims.common.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import com.bmpl.ims.common.dao.CommonSQLConstants;

public class CommonUtility {
	private CommonUtility() {
	}

	public static String getPrintStackTrace(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		e.printStackTrace(pw);
		return sw.toString();

	}


}
