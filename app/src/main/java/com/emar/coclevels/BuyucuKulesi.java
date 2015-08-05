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

public class BuyucuKulesi extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton buyucuKulesi1;
    ImageButton buyucuKulesi2;
    ImageButton buyucuKulesi3;
    ImageButton buyucuKulesi4;
    ImageButton buyucuKulesi5;
    ImageButton buyucuKulesi6;
    ImageButton buyucuKulesi7;
    ImageButton buyucuKulesi8;


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
        setContentView(R.layout.buyucu_kule);
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
        buyucuKulesi1 = (ImageButton) findViewById(R.id.buyucu1);
        buyucuKulesi2 = (ImageButton) findViewById(R.id.buyucu2);
        buyucuKulesi3 = (ImageButton) findViewById(R.id.buyucu3);
        buyucuKulesi4 = (ImageButton) findViewById(R.id.buyucu4);
        buyucuKulesi5 = (ImageButton) findViewById(R.id.buyucu5);
        buyucuKulesi6 = (ImageButton) findViewById(R.id.buyucu6);
        buyucuKulesi7 = (ImageButton) findViewById(R.id.buyucu7);
        buyucuKulesi8 = (ImageButton) findViewById(R.id.buyucu8);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) BuyucuKulesi.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        buyucuKulesi1.setOnClickListener(this);
        buyucuKulesi2.setOnClickListener(this);
        buyucuKulesi3.setOnClickListener(this);
        buyucuKulesi4.setOnClickListener(this);
        buyucuKulesi5.setOnClickListener(this);
        buyucuKulesi6.setOnClickListener(this);
        buyucuKulesi7.setOnClickListener(this);
        buyucuKulesi8.setOnClickListener(this);



    }

    public void onClick(View v) {
        if (v.getId() == R.id.buyucu1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("11");
            r2c2.setText("620");
            r3c2.setText("180k");
            r4c2.setText("12h");
            r5c2.setText("207");
            r6c2.setText("5");

        }
        else if(v.getId()== R.id.buyucu2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("13");
            r2c2.setText("650");
            r3c2.setText("360k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.buyucu3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("16");
            r2c2.setText("680");
            r3c2.setText("720k");
            r4c2.setText("2d");
            r5c2.setText("415");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.buyucu4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("20");
            r2c2.setText("710");
            r3c2.setText("1.28M");
            r4c2.setText("3d");
            r5c2.setText("509");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.buyucu5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("24");
            r2c2.setText("750");
            r3c2.setText("1.96M");
            r4c2.setText("4d");
            r5c2.setText("587");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.buyucu6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("32");
            r2c2.setText("790");
            r3c2.setText("2.68M");
            r4c2.setText("5d");
            r5c2.setText("720");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.buyucu7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("40");
            r2c2.setText("840");
            r3c2.setText("5.63M");
            r4c2.setText("7d");
            r5c2.setText("777");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.buyucu8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("48");
            r2c2.setText("900");
            r3c2.setText("6.48M");
            r4c2.setText("10d");
            r5c2.setText("929");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


