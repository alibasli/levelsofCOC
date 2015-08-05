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

public class Kisla extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton kisla1;
    ImageButton kisla2;
    ImageButton kisla3;
    ImageButton kisla4;
    ImageButton kisla5;
    ImageButton kisla6;
    ImageButton kisla7;
    ImageButton kisla8;
    ImageButton kisla9;
    ImageButton kisla10;

    TextView r1c1;
    TextView r1c2;
    TextView r1c3;
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
        setContentView(R.layout.kisla);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), ordu.class);
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
        kisla1 = (ImageButton) findViewById(R.id.kisla1);
        kisla2 = (ImageButton) findViewById(R.id.kisla2);
        kisla3 = (ImageButton) findViewById(R.id.kisla3);
        kisla4 = (ImageButton) findViewById(R.id.kisla4);
        kisla5 = (ImageButton) findViewById(R.id.kisla5);
        kisla6 = (ImageButton) findViewById(R.id.kisla6);
        kisla7 = (ImageButton) findViewById(R.id.kisla7);
        kisla8 = (ImageButton) findViewById(R.id.kisla8);
        kisla9 = (ImageButton) findViewById(R.id.kisla9);
        kisla10 = (ImageButton) findViewById(R.id.kisla10);

        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) Kisla.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Built Cost:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);
        r1c3=(TextView) popupPencere.getContentView().findViewById(R.id.R1C3);
        r1c3.setBackgroundResource(R.drawable.iksiricon);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Built Time:");
        r2c2=(TextView)popupPencere.getContentView().findViewById(R.id.R2C2);

        r3c1=(TextView) popupPencere.getContentView().findViewById(R.id.R3C1);
        r3c1.setText("Experience Gained:");
        r3c2=(TextView) popupPencere.getContentView().findViewById(R.id.R3C2);
        r3c3=(TextView) popupPencere.getContentView().findViewById(R.id.R3C3);
        r3c3.setBackgroundResource(R.drawable.xp);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Hitpoints:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);

        r5c1=(TextView) popupPencere.getContentView().findViewById(R.id.R5C1);
        r5c1.setText("Min Town Level:");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Unlocked Unit:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        kisla1.setOnClickListener(this);
        kisla2.setOnClickListener(this);
        kisla3.setOnClickListener(this);
        kisla4.setOnClickListener(this);
        kisla5.setOnClickListener(this);
        kisla6.setOnClickListener(this);
        kisla7.setOnClickListener(this);
        kisla8.setOnClickListener(this);
        kisla9.setOnClickListener(this);
        kisla10.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.kisla1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("200");
            r2c2.setText("1 m");
            r3c2.setText("7");
            r4c2.setText("250");
            r5c2.setText("1");
            r6c2.setText("Barbar");

        }
        else if(v.getId()== R.id.kisla2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1k");
            r2c2.setText("15m");
            r3c2.setText("30");
            r4c2.setText("290");
            r5c2.setText("1");
            r6c2.setText("Archer");
        }
        else if(v.getId()== R.id.kisla3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("2.5k");
            r2c2.setText("2h");
            r3c2.setText("84");
            r4c2.setText("330");
            r5c2.setText("1");
            r6c2.setText("Giant");
        }
        else if(v.getId()== R.id.kisla4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("5k");
            r2c2.setText("4h");
            r3c2.setText("120");
            r4c2.setText("370");
            r5c2.setText("2");
            r6c2.setText("Goblin");
        }
        else if(v.getId()== R.id.kisla5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("10k");
            r2c2.setText("10h");
            r3c2.setText("189");
            r4c2.setText("410");
            r5c2.setText("3");
            r6c2.setText("Wall Breaker");
        }
        else if(v.getId()== R.id.kisla6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("80k");
            r2c2.setText("16h");
            r3c2.setText("240");
            r4c2.setText("450");
            r5c2.setText("4");
            r6c2.setText("Balloon");
        }
        else if(v.getId()== R.id.kisla7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("240k");
            r2c2.setText("1d");
            r3c2.setText("293");
            r4c2.setText("490");
            r5c2.setText("5");
            r6c2.setText("Wizard");
        }
        else if(v.getId()== R.id.kisla8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("700k");
            r2c2.setText("2d");
            r3c2.setText("415");
            r4c2.setText("530");
            r5c2.setText("6");
            r6c2.setText("Healer");
        }
        else if(v.getId()== R.id.kisla9){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1.5M");
            r2c2.setText("4d");
            r3c2.setText("587");
            r4c2.setText("570");
            r5c2.setText("7");
            r6c2.setText("Dragon");
        }
        else if(v.getId()== R.id.kisla10){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("2M");
            r2c2.setText("6d");
            r3c2.setText("720");
            r4c2.setText("610");
            r5c2.setText("8");
            r6c2.setText("P.E.K.K.A");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


