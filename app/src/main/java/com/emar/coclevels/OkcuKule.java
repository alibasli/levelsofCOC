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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class OkcuKule extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton okcu1;
    ImageButton okcu2;
    ImageButton okcu3;
    ImageButton okcu4;
    ImageButton okcu5;
    ImageButton okcu6;
    ImageButton okcu7;
    ImageButton okcu8;
    ImageButton okcu9;
    ImageButton okcu10;
    ImageButton okcu11;
    ImageButton okcu12;
    ImageButton okcu13;

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
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okcu_kule);
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
        AdRequest adRequest = new AdRequest.Builder() . build();
        adView.loadAd(adRequest);

            interstitial = new InterstitialAd(OkcuKule.this);
            interstitial.setAdUnitId("ca-app-pub-7763141267799460/1006959031");
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener() {
                public void onAdLoaded() {
                    displayInterstitial();
                }

            });
    }

    public void init() {
        okcu1 = (ImageButton) findViewById(R.id.okcu1);
        okcu2 = (ImageButton) findViewById(R.id.okcu2);
        okcu3 = (ImageButton) findViewById(R.id.okcu3);
        okcu4 = (ImageButton) findViewById(R.id.okcu4);
        okcu5 = (ImageButton) findViewById(R.id.okcu5);
        okcu6 = (ImageButton) findViewById(R.id.okcu6);
        okcu7 = (ImageButton) findViewById(R.id.okcu7);
        okcu8 = (ImageButton) findViewById(R.id.okcu8);
        okcu9 = (ImageButton) findViewById(R.id.okcu9);
        okcu10 = (ImageButton) findViewById(R.id.okcu10);
        okcu11= (ImageButton) findViewById(R.id.okcu11);
        okcu12= (ImageButton) findViewById(R.id.okcu12);
        okcu13= (ImageButton) findViewById(R.id.okcu13);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) OkcuKule.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        okcu1.setOnClickListener(this);
        okcu2.setOnClickListener(this);
        okcu3.setOnClickListener(this);
        okcu4.setOnClickListener(this);
        okcu5.setOnClickListener(this);
        okcu6.setOnClickListener(this);
        okcu7.setOnClickListener(this);
        okcu8.setOnClickListener(this);
        okcu9.setOnClickListener(this);
        okcu10.setOnClickListener(this);
        okcu11.setOnClickListener(this);
        okcu12.setOnClickListener(this);
        okcu13.setOnClickListener(this);


    }
    public void displayInterstitial() {

        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

    public void onClick(View v) {
        if (v.getId() == R.id.okcu1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("11");
            r2c2.setText("380");
            r3c2.setText("1k");
            r4c2.setText("15min");
            r5c2.setText("30");
            r6c2.setText("2");

        }
        else if(v.getId()== R.id.okcu2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("15");
            r2c2.setText("420");
            r3c2.setText("2k");
            r4c2.setText("30min");
            r5c2.setText("42");
            r6c2.setText("2");
        }
        else if(v.getId()== R.id.okcu3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("19");
            r2c2.setText("460");
            r3c2.setText("5k");
            r4c2.setText("45min");
            r5c2.setText("51");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.okcu4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("25");
            r2c2.setText("500");
            r3c2.setText("20k");
            r4c2.setText("4h");
            r5c2.setText("120");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.okcu5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("30");
            r2c2.setText("540");
            r3c2.setText("80k");
            r4c2.setText("12h");
            r5c2.setText("207");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.okcu6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("35");
            r2c2.setText("580");
            r3c2.setText("180k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.okcu7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("42");
            r2c2.setText("620");
            r3c2.setText("360k");
            r4c2.setText("2d");
            r5c2.setText("415");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.okcu8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("48");
            r2c2.setText("660");
            r3c2.setText("720k");
            r4c2.setText("3d");
            r5c2.setText("509");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.okcu9){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("56");
            r2c2.setText("705");
            r3c2.setText("1.5M");
            r4c2.setText("4d");
            r5c2.setText("587");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.okcu10){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("65");
            r2c2.setText("750");
            r3c2.setText("2.5M");
            r4c2.setText("5d");
            r5c2.setText("657");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.okcu11){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("75");
            r2c2.setText("805");
            r3c2.setText("4.5M");
            r4c2.setText("6d");
            r5c2.setText("720");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.okcu12){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("86");
            r2c2.setText("870");
            r3c2.setText("6.5M");
            r4c2.setText("7d");
            r5c2.setText("777");
            r6c2.setText("10");
        }
        else if(v.getId()== R.id.okcu13){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("98");
            r2c2.setText("930");
            r3c2.setText("7.5M");
            r4c2.setText("8d");
            r5c2.setText("831");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


