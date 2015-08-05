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

public class kamp extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton kamp1;
    ImageButton kamp2;
    ImageButton kamp3;
    ImageButton kamp4;
    ImageButton kamp5;
    ImageButton kamp6;
    ImageButton kamp7;
    ImageButton kamp8;


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
        setContentView(R.layout.kamp);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), ordu.class);
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
        kamp1 = (ImageButton) findViewById(R.id.orducampi1);
        kamp2 = (ImageButton) findViewById(R.id.orducampi2);
        kamp3 = (ImageButton) findViewById(R.id.orducampi3);
        kamp4 = (ImageButton) findViewById(R.id.orducampi4);
        kamp5 = (ImageButton) findViewById(R.id.orducampi5);
        kamp6 = (ImageButton) findViewById(R.id.orducampi6);
        kamp7 = (ImageButton) findViewById(R.id.orducampi7);
        kamp8 = (ImageButton) findViewById(R.id.orducampi8);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) kamp.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Troop Capacity:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);

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

        kamp1.setOnClickListener(this);
        kamp2.setOnClickListener(this);
        kamp3.setOnClickListener(this);
        kamp4.setOnClickListener(this);
        kamp5.setOnClickListener(this);
        kamp6.setOnClickListener(this);
        kamp7.setOnClickListener(this);
        kamp8.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.orducampi1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("20");
            r2c2.setText("250");
            r3c2.setText("250");
            r4c2.setText("5min");
            r5c2.setText("17");
            r6c2.setText("1");

        }
        else if(v.getId()== R.id.orducampi2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("30");
            r2c2.setText("270");
            r3c2.setText("2.5k");
            r4c2.setText("1h");
            r5c2.setText("60");
            r6c2.setText("2");
        }
        else if(v.getId()== R.id.orducampi3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);

            r1c2.setText("35");
            r2c2.setText("290");
            r3c2.setText("10k");
            r4c2.setText("3h");
            r5c2.setText("103");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.orducampi4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("40");
            r2c2.setText("310");
            r3c2.setText("100k");
            r4c2.setText("8h");
            r5c2.setText("169");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.orducampi5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("45");
            r2c2.setText("330");
            r3c2.setText("250k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.orducampi6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("50");
            r2c2.setText("350");
            r3c2.setText("750k");
            r4c2.setText("3d");
            r5c2.setText("509");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.orducampi7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("55");
            r2c2.setText("370");
            r3c2.setText("2.25M");
            r4c2.setText("5d");
            r5c2.setText("657");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.orducampi8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("60");
            r2c2.setText("390");
            r3c2.setText("6.75M");
            r4c2.setText("10d");
            r5c2.setText("929");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


