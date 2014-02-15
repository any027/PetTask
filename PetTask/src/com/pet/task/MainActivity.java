package com.pet.task;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.drawable.AnimationDrawable;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.graphics.*;

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
		image.setImageResource(R.drawable.pet_test);
		
		 // Get the background, which has been compiled to an AnimationDrawable object.
		 final AnimationDrawable frameAnimation = (AnimationDrawable) image.getDrawable();
		 // Start the animation (looped playback by default).
		 frameAnimation.start();
		 
		 image.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(frameAnimation.isRunning())
					frameAnimation.stop();
				else
				{
					frameAnimation.setColorFilter(R.color.Bisque, PorterDuff.Mode.MULTIPLY);
					frameAnimation.start();
				}
				return false;
			}
		});
		
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
