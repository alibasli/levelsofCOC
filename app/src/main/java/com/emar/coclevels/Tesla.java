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

public class Tesla extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton tesla1;
    ImageButton tesla2;
    ImageButton tesla3;
    ImageButton tesla4;
    ImageButton tesla5;
    ImageButton tesla6;
    ImageButton tesla7;
    ImageButton tesla8;


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
        setContentView(R.layout.tesla);
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
        tesla1 = (ImageButton) findViewById(R.id.tesla1);
        tesla2 = (ImageButton) findViewById(R.id.tesla2);
        tesla3 = (ImageButton) findViewById(R.id.tesla3);
        tesla4 = (ImageButton) findViewById(R.id.tesla4);
        tesla5 = (ImageButton) findViewById(R.id.tesla5);
        tesla6 = (ImageButton) findViewById(R.id.tesla6);
        tesla7 = (ImageButton) findViewById(R.id.tesla7);
        tesla8 = (ImageButton) findViewById(R.id.tesla8);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) Tesla.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        tesla1.setOnClickListener(this);
        tesla2.setOnClickListener(this);
        tesla3.setOnClickListener(this);
        tesla4.setOnClickListener(this);
        tesla5.setOnClickListener(this);
        tesla6.setOnClickListener(this);
        tesla7.setOnClickListener(this);
        tesla8.setOnClickListener(this);



    }

    public void onClick(View v) {
        if (v.getId() == R.id.tesla1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("34");
            r2c2.setText("600");
            r3c2.setText("1M");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("7");

        }
        else if(v.getId()== R.id.tesla2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("40");
            r2c2.setText("630");
            r3c2.setText("1.25M");
            r4c2.setText("3d");
            r5c2.setText("509");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.tesla3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("48");
            r2c2.setText("660");
            r3c2.setText("1.5M");
            r4c2.setText("5d");
            r5c2.setText("657");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.tesla4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("55");
            r2c2.setText("690");
            r3c2.setText("2M");
            r4c2.setText("6d");
            r5c2.setText("720");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.tesla5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("64");
            r2c2.setText("730");
            r3c2.setText("2.5M");
            r4c2.setText("8d");
            r5c2.setText("777");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.tesla6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("75");
            r2c2.setText("770");
            r3c2.setText("3M");
            r4c2.setText("10d");
            r5c2.setText("929");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.tesla7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("87");
            r2c2.setText("810");
            r3c2.setText("3.5M");
            r4c2.setText("12d");
            r5c2.setText("1.018");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.tesla8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("99");
            r2c2.setText("850");
            r3c2.setText("5M");
            r4c2.setText("14d");
            r5c2.setText("1.099");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


