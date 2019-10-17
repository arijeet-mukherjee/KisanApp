package com.example.kisanapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPersonal extends AppCompatActivity {
    private Button dash;
    private Button myplant;
    private Button aboutus;
    private ImageButton fb;
    private ImageButton gplus;
    private TextView email;
    private TextView ph;
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_layout);
        dash=(Button)findViewById(R.id.dashboard);
        myplant=(Button)findViewById(R.id.myplant);
        aboutus=(Button)findViewById(R.id.aboutus);
        fb=(ImageButton)findViewById(R.id.fb);
        gplus=(ImageButton)findViewById(R.id.gplus);
        email=(TextView)findViewById(R.id.mail);
        ph=(TextView)findViewById(R.id.number);


        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Dashboard is getting prepared!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ActivityPersonal.this,MainActivity.class));
                finish();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    dash.setBackgroundColor(getColor(R.color.transparent));
                    dash.getBackground().setAlpha(255);
                    myplant.setBackgroundColor(getColor(R.color.transparent));
                    myplant.getBackground().setAlpha(64);
                    aboutus.setBackgroundColor(getColor(R.color.transparent));
                    aboutus.getBackground().setAlpha(64);
                }

            }
        });
        myplant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"you are on my plant page itself!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ActivityPersonal.this,MainActivity.class));
                finish();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    myplant.setBackgroundColor(getColor(R.color.transparent));
                    myplant.getBackground().setAlpha(255);
                    dash.setBackgroundColor(getColor(R.color.transparent));
                    dash.getBackground().setAlpha(64);
                    aboutus.setBackgroundColor(getColor(R.color.transparent));
                    aboutus.getBackground().setAlpha(64);
                }
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Made By Arijeet Mukhrejee and still working to serve you better!",Toast.LENGTH_SHORT).show();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    aboutus.setBackgroundColor(getColor(R.color.transparent));
                    aboutus.getBackground().setAlpha(255);
                    myplant.setBackgroundColor(getColor(R.color.transparent));
                    myplant.getBackground().setAlpha(64);
                    dash.setBackgroundColor(getColor(R.color.transparent));
                    dash.getBackground().setAlpha(64);
                }
                startActivity(new Intent(ActivityPersonal.this,ActivityPersonal.class));
                finish();


            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100011243774131"));
                startActivity(Getintent);

            }
        });
        gplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aboutme.google.com/u/0/?referer=gplus"));
                startActivity(Getintent);

            }
        });






    }
}
