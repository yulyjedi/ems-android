package com.gbmobile.android.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FrmHello extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frmhello);

		TextView hello = (TextView) findViewById(R.id.helloText);

		Bundle bundle = this.getIntent().getExtras();

		hello.setText("Hello " + bundle.getString("NAME"));
	}

}