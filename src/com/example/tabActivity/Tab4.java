package com.example.tabActivity;

import com.example.demo.R;
import com.example.demo.R.layout;
import com.example.demo.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tab4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab4, menu);
		return true;
	}

}
