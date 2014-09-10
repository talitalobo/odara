package com.example.odara;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Login extends ActionBarActivity {

	private static final int SPLASH_TIME_OUT = 2000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.login);

		/*new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				final Intent i = new Intent(Login.this, DEFINE_CLASS);
				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);*/
	}
}
