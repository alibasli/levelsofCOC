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

public class KaraIksirSondasi extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton karaiksirtoplayici1;
    ImageButton karaiksirtoplayici2;
    ImageButton karaiksirtoplayici3;
    ImageButton karaiksirtoplayici4;
    ImageButton karaiksirtoplayici5;
    ImageButton karaiksirtoplayici6;


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
        setContentView(R.layout.kara_iksir_sondasi);
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
        karaiksirtoplayici1 = (ImageButton) findViewById(R.id.karaiksirtoplayici1);
        karaiksirtoplayici2 = (ImageButton) findViewById(R.id.karaiksirtoplayici2);
        karaiksirtoplayici3 = (ImageButton) findViewById(R.id.karaiksirtoplayici3);
        karaiksirtoplayici4 = (ImageButton) findViewById(R.id.karaiksirtoplayici4);
        karaiksirtoplayici5 = (ImageButton) findViewById(R.id.karaiksirtoplayici5);
        karaiksirtoplayici6 = (ImageButton) findViewById(R.id.karaiksirtoplayici6);

        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) KaraIksirSondasi.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Build Coast:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);
        r1c3=(TextView) popupPencere.getContentView().findViewById(R.id.R1C3);
        r1c3.setBackgroundResource(R.drawable.iksiricon);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Build Time:");
        r2c2=(TextView)popupPencere.getContentView().findViewById(R.id.R2C2);

        r3c1=(TextView) popupPencere.getContentView().findViewById(R.id.R3C1);
        r3c1.setText("Experience Gained:");
        r3c2=(TextView) popupPencere.getContentView().findViewById(R.id.R3C2);
        r3c3=(TextView) popupPencere.getContentView().findViewById(R.id.R3C3);
        r3c3.setBackgroundResource(R.drawable.xp);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Boost Cost:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);
        r4c3.setBackgroundResource(R.drawable.elmasicon);

        r5c1=(TextView) popupPencere.getContentView().findViewById(R.id.R5C1);
        r5c1.setText("Capacity (Dark Elixir):");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);
        r5c3=(TextView) popupPencere.getContentView().findViewById(R.id.R5C3);
        r5c3.setBackgroundResource(R.drawable.karaiksiricon);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Min Town Level:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        karaiksirtoplayici1.setOnClickListener(this);
        karaiksirtoplayici2.setOnClickListener(this);
        karaiksirtoplayici3.setOnClickListener(this);
        karaiksirtoplayici4.setOnClickListener(this);
        karaiksirtoplayici5.setOnClickListener(this);
        karaiksirtoplayici6.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.karaiksirtoplayici1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1M");
            r2c2.setText("1d");
            r3c2.setText("293");
            r4c2.setText("7");
            r5c2.setText("160");
            r6c2.setText("7");

        }
        else if(v.getId()== R.id.karaiksirtoplayici2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1.5M");
            r2c2.setText("2d");
            r3c2.setText("415");
            r4c2.setText("10");
            r5c2.setText("300");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.karaiksirtoplayici3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("2M");
            r2c2.setText("3d");
            r3c2.setText("509");
            r4c2.setText("15");
            r5c2.setText("540");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.karaiksirtoplayici4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("3M");
            r2c2.setText("4d");
            r3c2.setText("587");
            r4c2.setText("20");
            r5c2.setText("840");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.karaiksirtoplayici5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("4M");
            r2c2.setText("6d");
            r3c2.setText("720");
            r4c2.setText("25");
            r5c2.setText("1280");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.karaiksirtoplayici6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("5M");
            r2c2.setText("8d");
            r3c2.setText("831");
            r4c2.setText("30");
            r5c2.setText("1.8k");
            r6c2.setText("9");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


