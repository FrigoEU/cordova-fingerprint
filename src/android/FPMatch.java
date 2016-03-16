package com.fgtit.fpcore;

public class FPMatch {

	private static FPMatch mMatch=null;
	
	public static FPMatch getInstance(){
		if(mMatch==null){
			mMatch=new FPMatch();
		}
		return mMatch;
	}

	public native int InitMatch();
	public native int MatchTemplate( byte[] piFeatureA, byte[] piFeatureB);
	public native int MatchTemplateOne( byte[] piFeatureA, byte[] piFeatureB, int bSize);
	
	static {
		System.loadLibrary("fgtitalg");
		System.loadLibrary("fpcore");
	}
}
