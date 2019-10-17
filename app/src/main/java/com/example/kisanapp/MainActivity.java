package com.example.kisanapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private ImageButton imSun;
    private ImageButton imHumid;
    private ImageButton imTemp;
    private ImageButton imNut;
    private ImageButton imPh;
    private ImageButton imMoisture;
    private Button btnPlantstat;
    private Button btnReport;
    private Button dash;
    private Button myplant;
    private Button aboutus;
    private TextView varText;
    private TextView rcvRasp;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.signout:
                startActivity(new Intent(MainActivity.this,SignInActivity.class));
                finish();
                break;
            default:
                Toast.makeText(getApplicationContext(),"Internal error occurred!!",Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        imHumid=(ImageButton)findViewById(R.id.imHumid);
        imMoisture=(ImageButton)findViewById(R.id.imMoisture);
        imNut=(ImageButton)findViewById(R.id.imNutirient);
        imPh=(ImageButton)findViewById(R.id.imPh);
        imSun=(ImageButton)findViewById(R.id.imSun);
        imTemp=(ImageButton)findViewById(R.id.imTemp);

        btnPlantstat=(Button)findViewById(R.id.plantstat);
        btnReport=(Button)findViewById(R.id.report);
        dash=(Button)findViewById(R.id.dashboard);
        myplant=(Button)findViewById(R.id.myplant);
        aboutus=(Button)findViewById(R.id.aboutus);

        varText=(TextView)findViewById(R.id.varText);
        rcvRasp=(TextView)findViewById(R.id.rcvRasp);

        btnPlantstat.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnPlantstat.setBackgroundColor(getColor(R.color.green));
                    btnReport.setBackgroundColor(getColor(R.color.transparent));

                }
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
                startActivity(new Intent(MainActivity.this,ActivityReport.class));
                finish();
            }
        });
        imTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"very soon you could see Temperature details!",Toast.LENGTH_SHORT).show();
                varText.setText("TEMPERATURE");

            }
        });
        imHumid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"very soon you could see Humidity details!",Toast.LENGTH_SHORT).show();
                varText.setText("HUMIDITY");
            }
        });
        imSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"very soon you could see weather details!",Toast.LENGTH_SHORT).show();
                varText.setText("WEATHER");
            }
        });
        imMoisture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"very soon you could see Moisture details!",Toast.LENGTH_SHORT).show();
                varText.setText("MOISTURE");
            }
        });
        imPh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"very soon you could see pH details!",Toast.LENGTH_SHORT).show();
                varText.setText("pH");
            }
        });
        imNut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"very soon you could see Nutrients of soil details!",Toast.LENGTH_SHORT).show();
                varText.setText("NUTRIENT");
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
                startActivity(new Intent(MainActivity.this,MainActivity.class));
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
                startActivity(new Intent(MainActivity.this,ActivityPersonal.class));
                finish();


            }
        });



    }
}