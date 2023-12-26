package com.luxintong.elmboot.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.util
 * @className: CommonUtil
 * @author: Lu Xintong
 * @description <p>CommonUtil</p>
 * @date: 2023-12-26 15:31
 * @version: 1.0
 */
public class CommonUtil {
	public static String getCurrentDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		return simpleDateFormat.format(calendar.getTime());
	}
}
