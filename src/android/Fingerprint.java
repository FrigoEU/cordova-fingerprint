package com.caresolutions.cordova.fingerprint;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Fingerprint extends CordovaPlugin {
  public Fingerprint () {
  }

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if ("test".equals(action)) {
      String message = "returning: " + args.getString(0);
      callbackContext.success(message);
      return true;
    }
    // callbackContext.error("I only know the 'test' action!");
    return false;  // Returning false results in a "MethodNotFound" error.
  }
}

