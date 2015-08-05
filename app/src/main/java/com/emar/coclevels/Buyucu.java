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

public class Buyucu extends Activity implements View.OnClickListener {

    private InterstitialAd interstitial;
    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;

    ImageButton buyucuasker1;
    ImageButton buyucuasker2;
    ImageButton buyucuasker3;
    ImageButton buyucuasker4;
    ImageButton buyucuasker5;

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyucu);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), Asker.class);
                startActivity(i);
            }
        });
        init();
        popupInit();
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder() .
                        build();
        adView.loadAd(adRequest);

        interstitial = new InterstitialAd(Buyucu.this);
        interstitial.setAdUnitId("cca-app-pub-7763141267799460/1006959031");
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

        buyucuasker1 = (ImageButton) findViewById(R.id.buyucuasker1);
        buyucuasker2 = (ImageButton) findViewById(R.id.buyucuasker2);
        buyucuasker3 = (ImageButton) findViewById(R.id.buyucuasker3);
        buyucuasker4 = (ImageButton) findViewById(R.id.buyucuasker4);
        buyucuasker5 = (ImageButton) findViewById(R.id.buyucuasker5);

        layoutOfPopup = new RelativeLayout(this);

        //layoutOfPopup.setBackgroundColor(Color.BLACK);
        // layoutOfPopup.addView(popupBilgi);
        //layoutOfPopup.addView(popupButton);

        LayoutInflater inflater = (LayoutInflater) Buyucu.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 430, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Damage per Second:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Hitpoints:");
        r2c2=(TextView)popupPencere.getContentView().findViewById(R.id.R2C2);

        r3c1=(TextView) popupPencere.getContentView().findViewById(R.id.R3C1);
        r3c1.setText("Training Cost:");
        r3c2=(TextView) popupPencere.getContentView().findViewById(R.id.R3C2);
        r3c3=(TextView) popupPencere.getContentView().findViewById(R.id.R3C3);
        r3c3.setBackgroundResource(R.drawable.iksiricon);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Research Cost:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);
        r4c3.setBackgroundResource(R.drawable.iksiricon);

        r5c1=(TextView) popupPencere.getContentView().findViewById(R.id.R5C1);
        r5c1.setText("Min. Lab. Level:");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Research Time:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        buyucuasker1.setOnClickListener(this);
        buyucuasker2.setOnClickListener(this);
        buyucuasker3.setOnClickListener(this);
        buyucuasker4.setOnClickListener(this);
        buyucuasker5.setOnClickListener(this);

        //popupPencere = new PopupWindow(layoutOfPopup, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // popupPencere.setContentView(layoutOfPopup);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.buyucuasker1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("50- 70");
            r2c2.setText("75 - 90");
            r3c2.setText("1.5k - 2k");
            r4c2.setText("N/A - 150k");
            r5c2.setText("N/A - 3");
            r6c2.setText("N/A - 1d");


        }
        else if(v.getId()== R.id.buyucuasker2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("90");
            r2c2.setText("108");
            r3c2.setText("2.5k");
            r4c2.setText("450k");
            r5c2.setText("4");
            r6c2.setText("2d");
        }
        else if(v.getId()== R.id.buyucuasker3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("125");
            r2c2.setText("130");
            r3c2.setText("3k");
            r4c2.setText("1.35M");
            r5c2.setText("5");
            r6c2.setText("3d");
        }
        else if(v.getId()== R.id.buyucuasker4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("170");
            r2c2.setText("156");
            r3c2.setText("3.5k");
            r4c2.setText("2.5M");
            r5c2.setText("6");
            r6c2.setText("5d");
        }
        else if(v.getId()== R.id.buyucuasker5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("180");
            r2c2.setText("164");
            r3c2.setText("4k");
            r4c2.setText("7.5M");
            r5c2.setText("8");
            r6c2.setText("14d");

        }
        else {
            popupPencere.dismiss();
        }
    }



}


