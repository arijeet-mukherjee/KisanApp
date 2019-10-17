package com.example.kisanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter
{
    Context context;
    LayoutInflater inflater;
    public SlideAdapter(Context context){
        this.context=context;
    }
    public int[] slideimage={
            R.drawable.logo,
            R.drawable.logo2
    };
    public int [] slideback={
            R.drawable.onboard1,
            R.drawable.background2
    };
    public String[] mheading={
            "                                     HEY",
            "AIM"
    };
    public String[] mdocs={
            "Welcome to our app",
            "IoT for farming, an intriguing concept indeed if the whole picture of current agricultural ecosystem is considered. Homosapiens of 21st century will find it hard to survive without internet, smartphones and all the innovations which have happened in recent years, albeit the primary necessities of human species to survive are air, food and water. A hell lot of factors are affecting farming industries and productivity of goods that are necessary for human living."
    };
    @Override
    public int getCount() {
        return mheading.length;
    }

    @Override
    public boolean isViewFromObject(View view,  Object object) {
        return view==(ConstraintLayout) object;
    }


    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImage=(ImageView)view.findViewById(R.id.slideimage);
        TextView slideHeading=(TextView)view.findViewById(R.id.mHeading);
        TextView slideDoc=(TextView)view.findViewById(R.id.mDocs);

        slideImage.setImageResource(slideimage[position]);
        slideHeading.setText(mheading[position]);
        slideDoc.setText(mdocs[position]);
        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position,  Object object) {
       container.removeView((RelativeLayout)object);
    }
}
