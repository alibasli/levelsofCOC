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

public class HavaSavunmasi extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton havaSavunmasi1;
    ImageButton havaSavunmasi2;
    ImageButton havaSavunmasi3;
    ImageButton havaSavunmasi4;
    ImageButton havaSavunmasi5;
    ImageButton havaSavunmasi6;
    ImageButton havaSavunmasi7;
    ImageButton havaSavunmasi8;


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
        setContentView(R.layout.hava_savunmasi);
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
        havaSavunmasi1 = (ImageButton) findViewById(R.id.hava1);
        havaSavunmasi2 = (ImageButton) findViewById(R.id.hava2);
        havaSavunmasi3 = (ImageButton) findViewById(R.id.hava3);
        havaSavunmasi4 = (ImageButton) findViewById(R.id.hava4);
        havaSavunmasi5 = (ImageButton) findViewById(R.id.hava5);
        havaSavunmasi6 = (ImageButton) findViewById(R.id.hava6);
        havaSavunmasi7 = (ImageButton) findViewById(R.id.hava7);
        havaSavunmasi8 = (ImageButton) findViewById(R.id.hava8);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) HavaSavunmasi.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        havaSavunmasi1.setOnClickListener(this);
        havaSavunmasi2.setOnClickListener(this);
        havaSavunmasi3.setOnClickListener(this);
        havaSavunmasi4.setOnClickListener(this);
        havaSavunmasi5.setOnClickListener(this);
        havaSavunmasi6.setOnClickListener(this);
        havaSavunmasi7.setOnClickListener(this);
        havaSavunmasi8.setOnClickListener(this);



    }

    public void onClick(View v) {
        if (v.getId() == R.id.hava1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("80");
            r2c2.setText("800");
            r3c2.setText("22.5k");
            r4c2.setText("5h");
            r5c2.setText("134");
            r6c2.setText("4");

        }
        else if(v.getId()== R.id.hava2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("110");
            r2c2.setText("850");
            r3c2.setText("90k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.hava3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("140");
            r2c2.setText("900");
            r3c2.setText("270k");
            r4c2.setText("3d");
            r5c2.setText("509");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.hava4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("160");
            r2c2.setText("950");
            r3c2.setText("540k");
            r4c2.setText("5d");
            r5c2.setText("657");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.hava5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("190");
            r2c2.setText("1k");
            r3c2.setText("1.08M");
            r4c2.setText("6d");
            r5c2.setText("720");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.hava6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("230");
            r2c2.setText("1.05k");
            r3c2.setText("2.16M");
            r4c2.setText("8d");
            r5c2.setText("831");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.hava7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("280");
            r2c2.setText("1.11k");
            r3c2.setText("4.32M");
            r4c2.setText("10d");
            r5c2.setText("929");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.hava8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("320");
            r2c2.setText("1.17k");
            r3c2.setText("7.56M");
            r4c2.setText("12d");
            r5c2.setText("1.018");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


