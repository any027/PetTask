package com.pet.task;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class PetImageView extends ImageView implements OnClickListener {

	private AnimationDrawable pet;
	
	public PetImageView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public PetImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public PetImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	protected void initialize()
	{
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

	}

}
