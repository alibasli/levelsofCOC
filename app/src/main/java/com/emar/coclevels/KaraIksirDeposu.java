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

public class KaraIksirDeposu extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton karaiksirdeposu1;
    ImageButton karaiksirdeposu2;
    ImageButton karaiksirdeposu3;
    ImageButton karaiksirdeposu4;
    ImageButton karaiksirdeposu5;
    ImageButton karaiksirdeposu6;


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
    TextView r1c3;
    TextView r5c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kara_iksir_deposu);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), kaynak.class);
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
        karaiksirdeposu1 = (ImageButton) findViewById(R.id.karaiksirdeposu1);
        karaiksirdeposu2 = (ImageButton) findViewById(R.id.karaiksirdeposu2);
        karaiksirdeposu3 = (ImageButton) findViewById(R.id.karaiksirdeposu3);
        karaiksirdeposu4 = (ImageButton) findViewById(R.id.karaiksirdeposu4);
        karaiksirdeposu5 = (ImageButton) findViewById(R.id.karaiksirdeposu5);
        karaiksirdeposu6 = (ImageButton) findViewById(R.id.karaiksirdeposu6);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) KaraIksirDeposu.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Capacity:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);
        r1c3=(TextView) popupPencere.getContentView().findViewById(R.id.R1C3);
        r1c3.setBackgroundResource(R.drawable.karaiksiricon);

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

        karaiksirdeposu1.setOnClickListener(this);
        karaiksirdeposu2.setOnClickListener(this);
        karaiksirdeposu3.setOnClickListener(this);
        karaiksirdeposu4.setOnClickListener(this);
        karaiksirdeposu5.setOnClickListener(this);
        karaiksirdeposu6.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.karaiksirdeposu1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("10k");
            r2c2.setText("2k");
            r3c2.setText("600k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("7");

        }
        else if(v.getId()== R.id.karaiksirdeposu2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("20k");
            r2c2.setText("2.2k");
            r3c2.setText("1.2");
            r4c2.setText("2d");
            r5c2.setText("415");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.karaiksirdeposu3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("40k");
            r2c2.setText("2.4k");
            r3c2.setText("1.8M");
            r4c2.setText("3d");
            r5c2.setText("509");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.karaiksirdeposu4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("80k");
            r2c2.setText("2.6");
            r3c2.setText("2.4M");
            r4c2.setText("4d");
            r5c2.setText("587");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.karaiksirdeposu5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("150k");
            r2c2.setText("2.9k");
            r3c2.setText("3M");
            r4c2.setText("5d");
            r5c2.setText("657");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.karaiksirdeposu6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("200k");
            r2c2.setText("3.2");
            r3c2.setText("3.6M");
            r4c2.setText("6d");
            r5c2.setText("720");
            r6c2.setText("9");
        }

        else {
            popupPencere.dismiss();
        }
    }
}
