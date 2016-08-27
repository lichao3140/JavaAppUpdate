package com.lichao.javaappupdate.utils;

public class BsPatch {

	/**
	 * 合并
	 * 
	 * @param oldfile  旧版本路径
	 * @param newfile  新版本路径
	 * @param patchfile 差分包路径
	 */
	public native static void patch(String oldfile, String newfile, String patchfile);

	static{
		System.loadLibrary("bspatch");
	}
	
}
