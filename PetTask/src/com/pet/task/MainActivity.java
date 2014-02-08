package com.pet.task;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	public static int screenW, screenH;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//initializations
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		screenW = dm.widthPixels;
		screenH= dm.heightPixels;
		RelativeLayout main = (RelativeLayout) findViewById(R.id.main); //main layout
		initilizeView(main);
		
	}
	
	/* Create views for app*/
	protected void initilizeView(RelativeLayout main)
	{
		//Placeholder for animated animal
		ImageView image = (ImageView)findViewById(R.id.pet_main);
		image.setImageResource(R.drawable.placeholder);
		//Matrix matrix = new Matrix();
		//image.setImageMatrix(matrix);
		
		//ListView
		ListView list = (ListView)findViewById(R.id.todo_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
