package com.emar.coclevels;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AltinDeposu extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton altindeposu1;
    ImageButton altindeposu2;
    ImageButton altindeposu3;
    ImageButton altindeposu4;
    ImageButton altindeposu5;
    ImageButton altindeposu6;
    ImageButton altindeposu7;
    ImageButton altindeposu8;
    ImageButton altindeposu9;
    ImageButton altindeposu10;
    ImageButton altindeposu11;



    TextView r1c1;
    TextView r1c2;
    TextView r2c1;
    TextView r2c2;
    TextView r3c1;
    TextView r3c2;
    TextView r3c3;
    TextView r4c1;
    TextView r4c2;
    TextView r4c3;
    TextView r5c1;
    TextView r5c2;
    TextView r6c1;
    TextView r6c2;
    TextView r1c3;
    TextView r5c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.altin_deposu);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), kaynak.class);
                startActivity(i);
            }
        });
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        init();
        popupInit();

    }

    public void init() {
        altindeposu1 = (ImageButton) findViewById(R.id.altindeposu1);
        altindeposu2 = (ImageButton) findViewById(R.id.altindeposu2);
        altindeposu3 = (ImageButton) findViewById(R.id.altindeposu3);
        altindeposu4 = (ImageButton) findViewById(R.id.altindeposu4);
        altindeposu5 = (ImageButton) findViewById(R.id.altindeposu5);
        altindeposu6 = (ImageButton) findViewById(R.id.altindeposu6);
        altindeposu7 = (ImageButton) findViewById(R.id.altindeposu7);
        altindeposu8 = (ImageButton) findViewById(R.id.altindeposu8);
        altindeposu9 = (ImageButton) findViewById(R.id.altindeposu9);
        altindeposu10 = (ImageButton) findViewById(R.id.altindeposu10);
        altindeposu11 = (ImageButton) findViewById(R.id.altindeposu11);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) AltinDeposu.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Storage Capacity:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);
        r1c3=(TextView) popupPencere.getContentView().findViewById(R.id.R1C3);
        r1c3.setBackgroundResource(R.drawable.altinicon);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Hitpoints:");
        r2c2=(TextView)popupPencere.getContentView().findViewById(R.id.R2C2);

        r3c1=(TextView) popupPencere.getContentView().findViewById(R.id.R3C1);
        r3c1.setText("Build Cost:");
        r3c2=(TextView) popupPencere.getContentView().findViewById(R.id.R3C2);
        r3c3=(TextView) popupPencere.getContentView().findViewById(R.id.R3C3);
        r3c3.setBackgroundResource(R.drawable.iksiricon);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Build Time:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);


        r5c1=(TextView) popupPencere.getContentView().findViewById(R.id.R5C1);
        r5c1.setText("Experience Gained:");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);
        r5c3=(TextView) popupPencere.getContentView().findViewById(R.id.R5C3);
        r5c3.setBackgroundResource(R.drawable.xp);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Min Town Level:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        altindeposu1.setOnClickListener(this);
        altindeposu2.setOnClickListener(this);
        altindeposu3.setOnClickListener(this);
        altindeposu4.setOnClickListener(this);
        altindeposu5.setOnClickListener(this);
        altindeposu6.setOnClickListener(this);
        altindeposu7.setOnClickListener(this);
        altindeposu8.setOnClickListener(this);
        altindeposu9.setOnClickListener(this);
        altindeposu10.setOnClickListener(this);
        altindeposu11.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.altindeposu1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1.5k");
            r2c2.setText("400");
            r3c2.setText("300");
            r4c2.setText("1m");
            r5c2.setText("30");
            r6c2.setText("1");

        }
        else if(v.getId()== R.id.altindeposu2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("3k");
            r2c2.setText("600");
            r3c2.setText("750");
            r4c2.setText("30m");
            r5c2.setText("42");
            r6c2.setText("2");
        }
        else if(v.getId()== R.id.altindeposu3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("6k");
            r2c2.setText("800");
            r3c2.setText("1.5k");
            r4c2.setText("1h");
            r5c2.setText("60");
            r6c2.setText("2");
        }
        else if(v.getId()== R.id.altindeposu4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("12k");
            r2c2.setText("1k");
            r3c2.setText("3k");
            r4c2.setText("2h");
            r5c2.setText("84");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.altindeposu5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("25k");
            r2c2.setText("1.2k");
            r3c2.setText("6k");
            r4c2.setText("3h");
            r5c2.setText("103");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.altindeposu6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("50k");
            r2c2.setText("1.4k");
            r3c2.setText("12k");
            r4c2.setText("4h");
            r5c2.setText("120");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.altindeposu7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("100k");
            r2c2.setText("1.6k");
            r3c2.setText("25k");
            r4c2.setText("6h");
            r5c2.setText("146");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.altindeposu8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("250k");
            r2c2.setText("1.7k");
            r3c2.setText("50k");
            r4c2.setText("8h");
            r5c2.setText("169");
            r6c2.setText("4");
        } else if(v.getId()== R.id.altindeposu9){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("500k");
            r2c2.setText("1.8k");
            r3c2.setText("100k");
            r4c2.setText("12h");
            r5c2.setText("207");
            r6c2.setText("5");
        } else if(v.getId()== R.id.altindeposu10){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1M");
            r2c2.setText("2k");
            r3c2.setText("250k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.altindeposu11){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("2M");
            r2c2.setText("2k");
            r3c2.setText("500k");
            r4c2.setText("2d");
            r5c2.setText("415");
            r6c2.setText("7");
        }

        else {
            popupPencere.dismiss();
        }
    }
}
