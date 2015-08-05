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

public class AltinMadeni extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton altintoplayici1;
    ImageButton altintoplayici2;
    ImageButton altintoplayici3;
    ImageButton altintoplayici4;
    ImageButton altintoplayici5;
    ImageButton altintoplayici6;
    ImageButton altintoplayici7;
    ImageButton altintoplayici8;
    ImageButton altintoplayici9;
    ImageButton altintoplayici10;
    ImageButton altintoplayici11;
    ImageButton altintoplayici12;


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
        setContentView(R.layout.altin_madeni);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), kaynak.class);
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
        altintoplayici1 = (ImageButton) findViewById(R.id.altintoplayici1);
        altintoplayici2 = (ImageButton) findViewById(R.id.altintoplayici2);
        altintoplayici3 = (ImageButton) findViewById(R.id.altintoplayici3);
        altintoplayici4 = (ImageButton) findViewById(R.id.altintoplayici4);
        altintoplayici5 = (ImageButton) findViewById(R.id.altintoplayici5);
        altintoplayici6 = (ImageButton) findViewById(R.id.altintoplayici6);
        altintoplayici7 = (ImageButton) findViewById(R.id.altintoplayici7);
        altintoplayici8 = (ImageButton) findViewById(R.id.altintoplayici8);
        altintoplayici9 = (ImageButton) findViewById(R.id.altintoplayici9);
        altintoplayici10 = (ImageButton) findViewById(R.id.altintoplayici10);
        altintoplayici11 = (ImageButton) findViewById(R.id.altintoplayici11);
        altintoplayici12 = (ImageButton) findViewById(R.id.altintoplayici12);

        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) AltinMadeni.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        r5c1.setText("Capacity (Gold):");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);
        r5c3=(TextView) popupPencere.getContentView().findViewById(R.id.R5C3);
        r5c3.setBackgroundResource(R.drawable.altinicon);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Min Town Level:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        altintoplayici1.setOnClickListener(this);
        altintoplayici2.setOnClickListener(this);
        altintoplayici3.setOnClickListener(this);
        altintoplayici4.setOnClickListener(this);
        altintoplayici5.setOnClickListener(this);
        altintoplayici6.setOnClickListener(this);
        altintoplayici7.setOnClickListener(this);
        altintoplayici8.setOnClickListener(this);
        altintoplayici9.setOnClickListener(this);
        altintoplayici10.setOnClickListener(this);
        altintoplayici11.setOnClickListener(this);
        altintoplayici12.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.altintoplayici1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("150");
            r2c2.setText("1m");
            r3c2.setText("7");
            r4c2.setText("N/A");
            r5c2.setText("500");
            r6c2.setText("1");

        }
        else if(v.getId()== R.id.altintoplayici2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("300");
            r2c2.setText("5m");
            r3c2.setText("17");
            r4c2.setText("N/A");
            r5c2.setText("1k");
            r6c2.setText("1");
        }
        else if(v.getId()== R.id.altintoplayici3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("700");
            r2c2.setText("15m");
            r3c2.setText("30");
            r4c2.setText("N/A");
            r5c2.setText("1.5k");
            r6c2.setText("2");
        }
        else if(v.getId()== R.id.altintoplayici4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1.4k");
            r2c2.setText("1h");
            r3c2.setText("60");
            r4c2.setText("N/A");
            r5c2.setText("2.5k");
            r6c2.setText("2");
        }
        else if(v.getId()== R.id.altintoplayici5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("3.5k");
            r2c2.setText("2h");
            r3c2.setText("84");
            r4c2.setText("4");
            r5c2.setText("10k");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.altintoplayici6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("7k");
            r2c2.setText("6h");
            r3c2.setText("146");
            r4c2.setText("5");
            r5c2.setText("20k");
            r6c2.setText("3");
        }
        else if(v.getId()== R.id.altintoplayici7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("14k");
            r2c2.setText("12h");
            r3c2.setText("207");
            r4c2.setText("6");
            r5c2.setText("30k");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.altintoplayici8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("28k");
            r2c2.setText("1d");
            r3c2.setText("293");
            r4c2.setText("7");
            r5c2.setText("50k");
            r6c2.setText("4");
        } else if(v.getId()== R.id.altintoplayici9){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("56k");
            r2c2.setText("2d");
            r3c2.setText("415");
            r4c2.setText("8");
            r5c2.setText("75k");
            r6c2.setText("5");
        } else if(v.getId()== R.id.altintoplayici10){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("84k");
            r2c2.setText("3d");
            r3c2.setText("509");
            r4c2.setText("9");
            r5c2.setText("100k");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.altintoplayici11){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("168k");
            r2c2.setText("4d");
            r3c2.setText("587");
            r4c2.setText("10");
            r5c2.setText("150k");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.altintoplayici12){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("336k");
            r2c2.setText("5d");
            r3c2.setText("657");
            r4c2.setText("11");
            r5c2.setText("200k");
            r6c2.setText("8");
        }


        else {
            popupPencere.dismiss();
        }
    }



}


