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

public class HavanTopu extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton havan1;
    ImageButton havan2;
    ImageButton havan3;
    ImageButton havan4;
    ImageButton havan5;
    ImageButton havan6;
    ImageButton havan7;
    ImageButton havan8;


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
    TextView r5c3;
    TextView r5c2;
    TextView r6c1;
    TextView r6c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.havan);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), savunma.class);
                startActivity(i);
            }
        });
        init();
        popupInit();
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void init() {
        havan1 = (ImageButton) findViewById(R.id.havan1);
        havan2 = (ImageButton) findViewById(R.id.havan2);
        havan3 = (ImageButton) findViewById(R.id.havan3);
        havan4 = (ImageButton) findViewById(R.id.havan4);
        havan5 = (ImageButton) findViewById(R.id.havan5);
        havan6 = (ImageButton) findViewById(R.id.havan6);
        havan7 = (ImageButton) findViewById(R.id.havan7);
        havan8 = (ImageButton) findViewById(R.id.havan8);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) HavanTopu.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        r5c1.setText("XP Gained:");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);
        r5c3=(TextView) popupPencere.getContentView().findViewById(R.id.R5C3);
        r5c3.setBackgroundResource(R.drawable.xp);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Min. Town Level:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        havan1.setOnClickListener(this);
        havan2.setOnClickListener(this);
        havan3.setOnClickListener(this);
        havan4.setOnClickListener(this);
        havan5.setOnClickListener(this);
        havan6.setOnClickListener(this);
        havan7.setOnClickListener(this);
        havan8.setOnClickListener(this);



    }

    public void onClick(View v) {
        if (v.getId() == R.id.havan1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("4");
            r2c2.setText("400");
            r3c2.setText("8k");
            r4c2.setText("8h");
            r5c2.setText("169");
            r6c2.setText("3");

        }
        else if(v.getId()== R.id.havan2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("5");
            r2c2.setText("450");
            r3c2.setText("32k");
            r4c2.setText("12h");
            r5c2.setText("207");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.havan3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("6");
            r2c2.setText("500");
            r3c2.setText("120k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.havan4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("7");
            r2c2.setText("550");
            r3c2.setText("400k");
            r4c2.setText("2d");
            r5c2.setText("415");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.havan5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("8");
            r2c2.setText("600");
            r3c2.setText("800k");
            r4c2.setText("4d");
            r5c2.setText("587");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.havan6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("9");
            r2c2.setText("650");
            r3c2.setText("1.6M");
            r4c2.setText("5d");
            r5c2.setText("657");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.havan7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("11");
            r2c2.setText("700");
            r3c2.setText("3.2M");
            r4c2.setText("7d");
            r5c2.setText("777");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.havan8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("13");
            r2c2.setText("750");
            r3c2.setText("6.4M");
            r4c2.setText("10d");
            r5c2.setText("929");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


