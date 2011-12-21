package com.gbmobile.android.tutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class HelloUser extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final EditText name = (EditText) findViewById(R.id.nameEditText);
		final Button helloButton = (Button) findViewById(R.id.HelloButton);

		helloButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(HelloUser.this, FrmHello.class);
				Bundle bundle = new Bundle();
				bundle.putString("NAME", name.getText().toString());

				intent.putExtras(bundle);

				startActivity(intent);
			}
		});
	}
}