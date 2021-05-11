package com.androstock.myweatherapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class AirQuality extends AppCompatActivity {
    EditText city;
    TextView aqi,co,no2,so2,pm;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_quality);
        final EditText city = (EditText) findViewById(R.id.cityname);
        final TextView aqi = (TextView) findViewById(R.id.airquality);
        final TextView o3 = (TextView) findViewById(R.id.CO_value);
        final TextView no2 = (TextView) findViewById(R.id.NO2_value);
        final TextView so2 = (TextView) findViewById(R.id.SO2_value);
        final TextView pm = (TextView) findViewById(R.id.PM_value);
        final TextView status = (TextView) findViewById(R.id.status);
        final TextView time = (TextView)findViewById(R.id.time);
        final TextView head1 = (TextView) findViewById(R.id.head);
        final TextView head2= (TextView) findViewById(R.id.SO2);
        final TextView head3 = (TextView) findViewById(R.id.NO2);
        final TextView head4 = (TextView) findViewById(R.id.co);
        final TextView head5 = (TextView) findViewById(R.id.PM);
        final TextView date = (TextView) findViewById(R.id.updated_field);
        Button btn = (Button) findViewById(R.id.btncheck);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (city.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter City Name", Toast.LENGTH_LONG).show();
                    aqi.setText("");
                    o3.setText("");
                    no2.setText("");
                    so2.setText("");
                    pm.setText("");
                    status.setText("");
                    head1.setText("");
                    head2.setText("");
                    date.setText("");
                    time.setText("");
                    head3.setText("");
                    head4.setText("");
                    head5.setText("");
                }
                else if(city.getText().toString().equals("Mumbai") ||city.getText().toString().equals("mumbai"))
                {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
                    String strDate = "Current Date : " + mdformat.format(calendar.getTime());
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    String strTime = "Current Time : " + format.format(calendar.getTime());
                    time.setText(strDate);
                    date.setText(strTime);
                    aqi.setText(" 126 ");
                    o3.setText(" 20 ");
                    no2.setText(" 14 ");
                    so2.setText(" 14 ");
                    pm.setText(" 122 ");
                    status.setText("(Very High)");
                    head1.setText("AIR QUALITY INDEX");
                    head2.setText("Sulphur Dioxide(SO2)");
                    head3.setText("Nitrogen Dioxide(NO2)");
                    head4.setText("Ozone(O3)");
                    head5.setText("PM 25");
                }
                else if(city.getText().toString().equals("Chennai") || city.getText().toString().equals("chennai"))
                {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
                    String strDate = "Current Date : " + mdformat.format(calendar.getTime());
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    String strTime = "Current Time : " + format.format(calendar.getTime());
                    time.setText(strDate);
                    date.setText(strTime);
                    aqi.setText(" 61 ");
                    o3.setText(" 11 ");
                    no2.setText(" 11 ");
                    so2.setText(" 14 ");
                    pm.setText(" 61 ");
                    status.setText("(High)");
                    head1.setText("AIR QUALITY INDEX");
                    head2.setText("Sulphur Dioxide(SO2)");
                    head3.setText("Nitrogen Dioxide(NO2)");
                    head4.setText("Ozone(O3)");
                    head5.setText("PM 25");
                }
                else if(city.getText().toString().equals("Kolkata") || city.getText().toString().equals("kolkata") || city.getText().toString().equals("KOLKATA"))
                {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
                    String strDate = "Current Date : " + mdformat.format(calendar.getTime());
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    String strTime = "Current Time : " + format.format(calendar.getTime());
                    time.setText(strDate);
                    date.setText(strTime);
                    aqi.setText(" 89 ");
                    o3.setText(" 89 ");
                    no2.setText(" 16 ");
                    so2.setText(" 17 ");
                    pm.setText(" 16 ");
                    status.setText("(High)");
                    head1.setText("AIR QUALITY INDEX");
                    head2.setText("Sulphur Dioxide(SO2)");
                    head3.setText("Nitrogen Dioxide(NO2)");
                    head4.setText("Ozone(O3)");
                    head5.setText("PM 25");
                }
                else if(city.getText().toString().equals("Delhi") || city.getText().toString().equals("delhi") || city.getText().toString().equals("DELHI"))
                {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
                    String strDate = "Current Date : " + mdformat.format(calendar.getTime());
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    String strTime = "Current Time : " + format.format(calendar.getTime());
                    time.setText(strDate);
                    date.setText(strTime);
                    aqi.setText(" 163 ");
                    o3.setText(" 11.5 ");
                    no2.setText(" 4.9 ");
                    so2.setText(" 15 ");
                    pm.setText(" 163 ");
                    status.setText("(Unhealthy)");
                    head1.setText("AIR QUALITY INDEX");
                    head2.setText("Sulphur Dioxide(SO2)");
                    head3.setText("Nitrogen Dioxide(NO2)");
                    head4.setText("Ozone(O3)");
                    head5.setText("PM 25");
                }
                else if(city.getText().toString().equals("Bangalore") || city.getText().toString().equals("BANGALORE") || city.getText().toString().equals("Bengaluru"))
                {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
                    String strDate = "Current Date : " + mdformat.format(calendar.getTime());
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    String strTime = "Current Time : " + format.format(calendar.getTime());
                    time.setText(strDate);
                    date.setText(strTime);
                    aqi.setText(" 85 ");
                    o3.setText(" 25 ");
                    no2.setText(" 8 ");
                    so2.setText(" 15 ");
                    pm.setText(" 85 ");
                    status.setText("(Unhealthy)");
                    head1.setText("AIR QUALITY INDEX");
                    head2.setText("Sulphur Dioxide(SO2)");
                    head3.setText("Nitrogen Dioxide(NO2)");
                    head4.setText("Ozone(O3)");
                    head5.setText("PM 25");
                }

                else if(city.getText().toString().equals("Hyderabad") || city.getText().toString().equals("HYDERABAD") || city.getText().toString().equals("hyderabad"))
                {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
                    String strDate = "Current Date : " + mdformat.format(calendar.getTime());
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    String strTime = "Current Time : " + format.format(calendar.getTime());
                    time.setText(strDate);
                    date.setText(strTime);
                    aqi.setText(" 66 ");
                    o3.setText(" 66 ");
                    no2.setText(" 8 ");
                    so2.setText(" 6 ");
                    pm.setText(" 20 ");
                    status.setText("(High Pollution)");
                    head1.setText("AIR QUALITY INDEX");
                    head2.setText("Sulphur Dioxide(SO2)");
                    head3.setText("Nitrogen Dioxide(NO2)");
                    head4.setText("Ozone(O3)");
                    head5.setText("PM 25");
                }
                else
                {

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
                    String strDate = "Current Date : " + mdformat.format(calendar.getTime());
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    String strTime = "Current Time : " + format.format(calendar.getTime());
                    time.setText(strDate);
                    date.setText(strTime);
                    aqi.setText(" 119 ");
                    o3.setText(" 93 ");
                    no2.setText(" 10 ");
                    so2.setText(" 14 ");
                    pm.setText(" 110 ");
                    status.setText("(Very High Pollution)");
                    head1.setText("AIR QUALITY INDEX");
                    head2.setText("Sulphur Dioxide(SO2)");
                    head3.setText("Nitrogen Dioxide(NO2)");
                    head4.setText("Ozone(O3)");
                    head5.setText("PM 25");
                }
            }
        });
    }
}