package com.example.kisanapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityReport extends AppCompatActivity {
    private Button btnPlantstat;
    private Button btnReport;
    private Button dash;
    private Button myplant;
    private Button aboutus;
    private Button generate;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        btnPlantstat=(Button)findViewById(R.id.plantstat);
        btnReport=(Button)findViewById(R.id.report);
        dash=(Button)findViewById(R.id.dashboard);
        myplant=(Button)findViewById(R.id.myplant);
        aboutus=(Button)findViewById(R.id.aboutus);
        generate=(Button)findViewById(R.id.genGraph);

        btnPlantstat.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnPlantstat.setBackgroundColor(getColor(R.color.green));
                    btnReport.setBackgroundColor(getColor(R.color.transparent));

                }
                startActivity(new Intent(ActivityReport.this,MainActivity.class));
                finish();
            }
        });
        btnReport.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnPlantstat.setBackgroundColor(getColor(R.color.transparent));
                    btnReport.setBackgroundColor(getColor(R.color.green));
                    //btnReport.getBackground().setAlpha(64);
                    Toast.makeText(getApplicationContext(),"Report and graph coming soon..:)",Toast.LENGTH_SHORT).show();

                }
                startActivity(new Intent(ActivityReport.this,ActivityReport.class));
                finish();
            }
        });



        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Dashboard is getting prepared!",Toast.LENGTH_SHORT).show();
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
                startActivity(new Intent(ActivityReport.this,ActivityReport.class));
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
                startActivity(new Intent(ActivityReport.this,ActivityPersonal.class));
                finish();


            }
        });

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You will able to generate graph soon!",Toast.LENGTH_SHORT).show();

            }
        });


    }
}
