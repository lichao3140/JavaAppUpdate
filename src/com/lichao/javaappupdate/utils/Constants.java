package com.lichao.javaappupdate.utils;

import java.io.File;

import android.os.Environment;

public class Constants {

	public static final String PATCH_FILE = "apk.patch";
	//下载地址
	public static final String URL_PATCH_DOWNLOAD = "http://192.168.2.108:8080/jni_update_servce/"+PATCH_FILE;
	
	//public static final String URL_PATCH_DOWNLOAD = "http://www.dongnaoedu.com/"+PATCH_FILE;
	
	public static final String PACKAGE_NAME = "com.lichao.javaappupdate";
	
	public static final String SD_CARD = Environment.getExternalStorageDirectory() + File.separator;
	
	//新版本apk的目录
	public static final String NEW_APK_PATH = SD_CARD+"JavaAppUpdate_new.apk";
	
	public static final String PATCH_FILE_PATH = SD_CARD+PATCH_FILE;
	
}
