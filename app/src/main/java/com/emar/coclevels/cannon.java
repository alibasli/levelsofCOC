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

public class cannon extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton cannon1;
    ImageButton cannon2;
    ImageButton cannon3;
    ImageButton cannon4;
    ImageButton cannon5;
    ImageButton cannon6;
    ImageButton cannon7;
    ImageButton cannon8;
    ImageButton cannon9;
    ImageButton cannon10;
    ImageButton cannon11;
    ImageButton cannon12;


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
    TextView r5c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cannon);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), savunma.class);
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
        cannon1 = (ImageButton) findViewById(R.id.top1);
        cannon2 = (ImageButton) findViewById(R.id.top2);
        cannon3 = (ImageButton) findViewById(R.id.top3);
        cannon4 = (ImageButton) findViewById(R.id.top4);
        cannon5 = (ImageButton) findViewById(R.id.top5);
        cannon6 = (ImageButton) findViewById(R.id.top6);
        cannon7 = (ImageButton) findViewById(R.id.top7);
        cannon8 = (ImageButton) findViewById(R.id.top8);
        cannon9 = (ImageButton) findViewById(R.id.top9);
        cannon10 = (ImageButton) findViewById(R.id.top10);
        cannon11 = (ImageButton) findViewById(R.id.top11);
        cannon12 = (ImageButton) findViewById(R.id.top12);

        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) cannon.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Damage per Second:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Hitpoints:");
        r2c2=(TextView)popupPencere.getContentView().findViewById(R.id.R2C2);

        r3c1=(TextView) popupPencere.getContentView().findViewById(R.id.R3C1);
        r3c1.setText("Cost:");
        r3c2=(TextView) popupPencere.getContentView().findViewById(R.id.R3C2);
        r3c3=(TextView) popupPencere.getContentView().findViewById(R.id.R3C3);
        r3c3.setBackgroundResource(R.drawable.altinicon);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Build Time:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);


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

        cannon1.setOnClickListener(this);
        cannon2.setOnClickListener(this);
        cannon3.setOnClickListener(this);
        cannon4.setOnClickListener(this);
        cannon5.setOnClickListener(this);
        cannon6.setOnClickListener(this);
        cannon7.setOnClickListener(this);
        cannon8.setOnClickListener(this);
        cannon9.setOnClickListener(this);
        cannon10.setOnClickListener(this);
        cannon11.setOnClickListener(this);
        cannon12.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.top1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("9");
            r2c2.setText("420");
            r3c2.setText("250");
            r4c2.setText("1m");
            r5c2.setText("7");
            r6c2.setText("1");

        }
        else if(v.getId()== R.id.top2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("11");
            r2c2.setText("470");
            r3c2.setText("1k");
            r4c2.setText("15m");
            r5c2.setText("30");
            r6c2.setText("1");
        }
        else if(v.getId()== R.id.top3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("15");
            r2c2.setText("520");
            r3c2.setText("4k");
            r4c2.setText("45m");
            r5c2.setText("51");
            r6c2.setText("2");
        }
        else if(v.getId()== R.id.top4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("19");
            r2c2.setText("570");
            r3c2.setText("16k");
            r4c2.setText("2h");
            r5c2.setText("84");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.top5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("25");
            r2c2.setText("620");
            r3c2.setText("50k");
            r4c2.setText("6h");
            r5c2.setText("146");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.top6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("31");
            r2c2.setText("670");
            r3c2.setText("100k");
            r4c2.setText("12h");
            r5c2.setText("207");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.top7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("40");
            r2c2.setText("32");
            r3c2.setText("200k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.top8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("48");
            r2c2.setText("770");
            r3c2.setText("400k");
            r4c2.setText("2d");
            r5c2.setText("415");
            r6c2.setText("7");
        } else if(v.getId()== R.id.top9){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("56");
            r2c2.setText("830");
            r3c2.setText("800k");
            r4c2.setText("3d");
            r5c2.setText("509");
            r6c2.setText("8");
        } else if(v.getId()== R.id.top10){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("65");
            r2c2.setText("890");
            r3c2.setText("1.6M");
            r4c2.setText("4d");
            r5c2.setText("587");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.top11){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("75");
            r2c2.setText("970");
            r3c2.setText("3.2M");
            r4c2.setText("5d");
            r5c2.setText("657");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.top12){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("86");
            r2c2.setText("1070");
            r3c2.setText("6.4M");
            r4c2.setText("6d");
            r5c2.setText("720");
            r6c2.setText("10");
        }


        else {
            popupPencere.dismiss();
        }
    }



}


