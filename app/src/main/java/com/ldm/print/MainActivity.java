package com.ldm.print;

import com.ldm.print.activity.PrintBitmapActivity;
import com.ldm.print.activity.PrintHtmlActivity;
import com.ldm.print.activity.PrintHtmlOffScreenActivity;
import com.ldm.print.activity.PrintLyaoutActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	private Button bitmap_btn;
	private Button layout_btn;
	private Button html_btn;
	private Button off_screen_btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViews();
	}

	private void initViews() {
		this.bitmap_btn = (Button) findViewById(R.id.bitmap_btn);
		this.layout_btn = (Button) findViewById(R.id.layout_btn);
		this.html_btn = (Button) findViewById(R.id.html_btn);
		this.off_screen_btn = (Button) findViewById(R.id.off_screen_btn);
		this.bitmap_btn.setOnClickListener(this);
		this.layout_btn.setOnClickListener(this);
		this.html_btn.setOnClickListener(this);
		this.off_screen_btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bitmap_btn:
			startIntent(PrintBitmapActivity.class);
			break;
		case R.id.layout_btn:
			startIntent(PrintLyaoutActivity.class);
			break;
		case R.id.html_btn:
			startIntent(PrintHtmlActivity.class);
			break;
		case R.id.off_screen_btn:
			startIntent(PrintHtmlOffScreenActivity.class);
			break;
		}
	}

	private void startIntent(Class<?> tagert) {
		Intent in = new Intent(this, tagert);
		startActivity(in);
	}
}
