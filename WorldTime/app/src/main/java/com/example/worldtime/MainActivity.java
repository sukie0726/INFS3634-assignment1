package com.example.worldtime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd HH:mm");
        Calendar calendar = Calendar.getInstance();


        LinearLayout sydneyB = findViewById(R.id.sydneyB);
        TextView SydneyText = sydneyB.findViewById(R.id.CityName);
        SydneyText.setText(R.string.sydney);
        final TextView SydneyTime = sydneyB.findViewById(R.id.CityTime);
        dateFormat.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        SydneyTime.setText(dateFormat.format(calendar.getTime()));
        ImageView SydneyImage = sydneyB.findViewById(R.id.CityImage);
        SydneyImage.setImageResource(R.drawable.sy);

        LinearLayout ShanghaiB = findViewById(R.id.ShanghaiB);
        TextView ShanghaiText = ShanghaiB.findViewById(R.id.CityName);
        ShanghaiText.setText(R.string.Shanghai);
        final TextView ShanghaiTime = ShanghaiB.findViewById(R.id.CityTime);
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        ShanghaiTime.setText(dateFormat.format(calendar.getTime()));
        ImageView ShanghaiImage = ShanghaiB.findViewById(R.id.CityImage);
        ShanghaiImage.setImageResource(R.drawable.sh);

        LinearLayout tokyoB = findViewById(R.id.tokyoB);
        TextView tokyoText = tokyoB.findViewById(R.id.CityName);
        tokyoText.setText(R.string.tokyo);
        final TextView TokyoTime = tokyoB.findViewById(R.id.CityTime);
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        TokyoTime.setText(dateFormat.format(calendar.getTime()));
        ImageView tokyoImage = tokyoB.findViewById(R.id.CityImage);
        tokyoImage.setImageResource(R.drawable.tk);

        LinearLayout chicagoB = findViewById(R.id.chicagoB);
        TextView chicagoText = chicagoB.findViewById(R.id.CityName);
        chicagoText.setText(R.string.chicago);
        final TextView chicagoTime = chicagoB.findViewById(R.id.CityTime);
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
        chicagoTime.setText(dateFormat.format(calendar.getTime()));
        ImageView chicagoImage = chicagoB.findViewById(R.id.CityImage);
        chicagoImage.setImageResource(R.drawable.chicago);

        LinearLayout londonB = findViewById(R.id.londonB);
        TextView londonText = londonB.findViewById(R.id.CityName);
        londonText.setText(R.string.london);
        final TextView londonTime = londonB.findViewById(R.id.CityTime);
        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        londonTime.setText(dateFormat.format(calendar.getTime()));
        ImageView londonImage = londonB.findViewById(R.id.CityImage);
        londonImage.setImageResource(R.drawable.london);


        Button T12 = findViewById(R.id.Time12);
        T12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat DF12 = new SimpleDateFormat("MM/dd KK:mm aa");
                Calendar calendar = Calendar.getInstance();

                DF12.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
                LinearLayout sydneyB = findViewById(R.id.sydneyB);
                TextView SydneyTime = sydneyB.findViewById(R.id.CityTime);
                SydneyTime.setText(DF12.format(calendar.getTime()));

                DF12.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
                ShanghaiTime.setText(DF12.format(calendar.getTime()));

                DF12.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));

                TokyoTime.setText(DF12.format(calendar.getTime()));

                DF12.setTimeZone(TimeZone.getTimeZone("America/Chicago"));

                chicagoTime.setText(DF12.format(calendar.getTime()));

                DF12.setTimeZone(TimeZone.getTimeZone("Europe/London"));

                londonTime.setText(DF12.format(calendar.getTime()));
            }
        });


        Button T24 = findViewById(R.id.Time24);
        T24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat DF24 = new SimpleDateFormat("MM/dd HH:mm");
                Calendar calendar = Calendar.getInstance();

                DF24.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));

                SydneyTime.setText(DF24.format(calendar.getTime()));

                DF24.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));

                ShanghaiTime.setText(DF24.format(calendar.getTime()));

                DF24.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));

                TokyoTime.setText(DF24.format(calendar.getTime()));

                DF24.setTimeZone(TimeZone.getTimeZone("America/Chicago"));

                chicagoTime.setText(DF24.format(calendar.getTime()));

                DF24.setTimeZone(TimeZone.getTimeZone("Europe/London"));

                londonTime.setText(DF24.format(calendar.getTime()));


            }
        });









    }
}
