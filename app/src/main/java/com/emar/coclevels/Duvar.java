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

public class Duvar extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton duvar1;
    ImageButton duvar2;
    ImageButton duvar3;
    ImageButton duvar4;
    ImageButton duvar5;
    ImageButton duvar6;
    ImageButton duvar7;
    ImageButton duvar8;
    ImageButton duvar9;
    ImageButton duvar10;
    ImageButton duvar11;

    TextView r1c1;
    TextView r1c2;
    TextView r2c1;
    TextView r1c3;
    TextView r2c2;
    TextView r2c3;
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
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duvar);
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

        interstitial = new InterstitialAd(Duvar.this);
        interstitial.setAdUnitId("ca-app-pub-7763141267799460/1006959031");
        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                displayInterstitial();
            }

        });

    }
    public void displayInterstitial() {

        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

    public void init() {
        duvar1 = (ImageButton) findViewById(R.id.duvar1);
        duvar2 = (ImageButton) findViewById(R.id.duvar2);
        duvar3 = (ImageButton) findViewById(R.id.duvar3);
        duvar4 = (ImageButton) findViewById(R.id.duvar4);
        duvar5 = (ImageButton) findViewById(R.id.duvar5);
        duvar6 = (ImageButton) findViewById(R.id.duvar6);
        duvar7 = (ImageButton) findViewById(R.id.duvar7);
        duvar8 = (ImageButton) findViewById(R.id.duvar8);
        duvar9 = (ImageButton) findViewById(R.id.duvar9);
        duvar10 = (ImageButton) findViewById(R.id.duvar10);
        duvar11= (ImageButton) findViewById(R.id.duvar11);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) Duvar.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Cost:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);
        r1c3=(TextView) popupPencere.getContentView().findViewById(R.id.R1C3);
        r1c3.setBackgroundResource(R.drawable.altinicon);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Comulative Cost:");
        r2c2=(TextView)popupPencere.getContentView().findViewById(R.id.R2C2);
        r2c3=(TextView) popupPencere.getContentView().findViewById(R.id.R2C3);
        r2c3.setBackgroundResource(R.drawable.altinicon);

        r3c1=(TextView) popupPencere.getContentView().findViewById(R.id.R3C1);
        r3c1.setText("Cost:");
        r3c2=(TextView) popupPencere.getContentView().findViewById(R.id.R3C2);
        r3c3=(TextView) popupPencere.getContentView().findViewById(R.id.R3C3);
        r3c3.setBackgroundResource(R.drawable.iksiricon);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Comulative Cost:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);
        r4c3.setBackgroundResource(R.drawable.iksiricon);

        r5c1=(TextView) popupPencere.getContentView().findViewById(R.id.R5C1);
        r5c1.setText("Hitpoints:");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Town Hall Level Required:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        duvar1.setOnClickListener(this);
        duvar2.setOnClickListener(this);
        duvar3.setOnClickListener(this);
        duvar4.setOnClickListener(this);
        duvar5.setOnClickListener(this);
        duvar6.setOnClickListener(this);
        duvar7.setOnClickListener(this);
        duvar8.setOnClickListener(this);
        duvar9.setOnClickListener(this);
        duvar10.setOnClickListener(this);
        duvar11.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.duvar1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("200");
            r2c2.setText("200");
            r3c2.setText("N/A");
            r4c2.setText("N/A");
            r5c2.setText("300");
            r6c2.setText("2");

        }
        else if(v.getId()== R.id.duvar2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1k");
            r2c2.setText("1.2k");
            r3c2.setText("N/A");
            r4c2.setText("N/A");
            r5c2.setText("500");
            r6c2.setText("2");
        }
        else if(v.getId()== R.id.duvar3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("5k");
            r2c2.setText("6.2k");
            r3c2.setText("N/A");
            r4c2.setText("N/A");
            r5c2.setText("700");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.duvar4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("10k");
            r2c2.setText("16.2k");
            r3c2.setText("N/A");
            r4c2.setText("N/A");
            r5c2.setText("900");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.duvar5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("30k");
            r2c2.setText("46.2k");
            r3c2.setText("N/A");
            r4c2.setText("N/A");
            r5c2.setText("1.4k");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.duvar6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("75k");
            r2c2.setText("121.2k");
            r3c2.setText("N/A");
            r4c2.setText("N/A");
            r5c2.setText("2k");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.duvar7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("200k");
            r2c2.setText("321.2k");
            r3c2.setText("N/A");
            r4c2.setText("N/A");
            r5c2.setText("2.5k");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.duvar8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("500k");
            r2c2.setText("821.200");
            r3c2.setText("N/A");
            r4c2.setText("N/A");
            r5c2.setText("3k");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.duvar9){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1M");
            r2c2.setText("1.821.200");
            r3c2.setText("1M");
            r4c2.setText("1M");
            r5c2.setText("4k");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.duvar10){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("3M");
            r2c2.setText("4.821.200");
            r3c2.setText("3M");
            r4c2.setText("4M");
            r5c2.setText("5.5k");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.duvar11){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("4M");
            r2c2.setText("8.821.200");
            r3c2.setText("4M");
            r4c2.setText("8M");
            r5c2.setText("7k");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


