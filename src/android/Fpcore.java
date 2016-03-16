package com.caresolutions.cordova.fingerprint;

public class Fpcore {
  private static Fpcore mMatch=null;

  public static Fpcore getInstance(){
    if(mMatch==null){
      mMatch=new Fpcore();
    }
    return mMatch;
  }

  public native int InitMatch();
  public native int MatchTemplate( byte[] piFeatureA, byte[] piFeatureB);

  static {
    System.loadLibrary("fgtitalg");
    System.loadLibrary("fpcore");
  }
}
