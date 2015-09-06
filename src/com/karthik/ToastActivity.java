package com.karthik;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class ToastActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast);
	}

	public void showToast(View v) {
		Toast toast = Toast.makeText(this, "Cheers!", Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
		toast.show();
	}
	
	public void showCustomToast(View v) {
		LayoutInflater inflater = getLayoutInflater();
		View layout_custom_toast = inflater.inflate(R.layout.activity_custom, (ViewGroup) findViewById(R.id.activity_custom_toast_layout_root));
		
		Toast custom_toast = new Toast(getApplicationContext());
		custom_toast.setGravity(Gravity.CENTER, 0, 0);
		custom_toast.setDuration(Toast.LENGTH_LONG);
		custom_toast.setView(layout_custom_toast);
		
		custom_toast.show();
	}
}
