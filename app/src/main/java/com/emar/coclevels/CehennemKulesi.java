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

public class CehennemKulesi extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton cehennemkulesi1;
    ImageButton cehennemkulesi2;
    ImageButton cehennemkulesi3;


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
        setContentView(R.layout.cehhenem_kulesi);
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
        cehennemkulesi1 = (ImageButton) findViewById(R.id.cehennemkulesi1);
        cehennemkulesi2 = (ImageButton) findViewById(R.id.cehennemkulesi2);
        cehennemkulesi3 = (ImageButton) findViewById(R.id.cehennemkulesi3);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) CehennemKulesi.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("DPS-After2s-After5s:");
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

        cehennemkulesi1.setOnClickListener(this);
        cehennemkulesi2.setOnClickListener(this);
        cehennemkulesi3.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.cehennemkulesi1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("24-100-1k");
            r2c2.setText("1.5k");
            r3c2.setText("5M");
            r4c2.setText("7d");
            r5c2.setText("777");
            r6c2.setText("10");

        }
        else if(v.getId()== R.id.cehennemkulesi2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("30-125-1.25k");
            r2c2.setText("1.8k");
            r3c2.setText("6.5M");
            r4c2.setText("10d");
            r5c2.setText("929");
            r6c2.setText("10");
        }
        else if(v.getId()== R.id.cehennemkulesi3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("36-125-1.4k");
            r2c2.setText("2.1k");
            r3c2.setText("8M");
            r4c2.setText("14d");
            r5c2.setText("1.099");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


