package com.gbmobile.android.examples;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LogExample extends Activity {

	public static final String TAG = "LogExample";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Exception exception = new Exception("Oh noes :(");
		if (Log.isLoggable(TAG, Log.ERROR)) {
			Log.e(TAG, "Error Message");
			Log.e(TAG, "Error Message", exception);
		}
		if (Log.isLoggable(TAG, Log.WARN)) {
			Log.w(TAG, "Warning Message");
			Log.w(TAG, "Warning Message", exception);
		}
		if (Log.isLoggable(TAG, Log.INFO)) {
			Log.i(TAG, "Info Message");
			Log.i(TAG, "Info Message", exception);
		}
		if (Log.isLoggable(TAG, Log.DEBUG)) {
			Log.d(TAG, "Debug Message");
			Log.d(TAG, "Debug Message", exception);
		}
		if (Log.isLoggable(TAG, Log.VERBOSE)) {
			Log.v(TAG, "Verbose Message");
			Log.v(TAG, "Verbose Message", exception);
		}
		Log.wtf(TAG, "WTF Message");
		Log.wtf(TAG, "WTF Message", exception);
	}
}