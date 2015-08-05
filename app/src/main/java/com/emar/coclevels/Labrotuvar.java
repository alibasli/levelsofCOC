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

public class Labrotuvar extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton labarotuvar1;
    ImageButton labarotuvar2;
    ImageButton labarotuvar3;
    ImageButton labarotuvar4;
    ImageButton labarotuvar5;
    ImageButton labarotuvar6;
    ImageButton labarotuvar7;
    ImageButton labarotuvar8;


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
        setContentView(R.layout.labrotuvar);
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
        labarotuvar1 = (ImageButton) findViewById(R.id.labotatuvar1);
        labarotuvar2 = (ImageButton) findViewById(R.id.labotatuvar2);
        labarotuvar3 = (ImageButton) findViewById(R.id.labotatuvar3);
        labarotuvar4 = (ImageButton) findViewById(R.id.labotatuvar4);
        labarotuvar5 = (ImageButton) findViewById(R.id.labotatuvar5);
        labarotuvar6 = (ImageButton) findViewById(R.id.labotatuvar6);
        labarotuvar7 = (ImageButton) findViewById(R.id.labotatuvar7);
        labarotuvar8 = (ImageButton) findViewById(R.id.labotatuvar8);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) Labrotuvar.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Level:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);

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

        labarotuvar1.setOnClickListener(this);
        labarotuvar2.setOnClickListener(this);
        labarotuvar3.setOnClickListener(this);
        labarotuvar4.setOnClickListener(this);
        labarotuvar5.setOnClickListener(this);
        labarotuvar6.setOnClickListener(this);
        labarotuvar7.setOnClickListener(this);
        labarotuvar8.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.labotatuvar1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1");
            r2c2.setText("500");
            r3c2.setText("25k");
            r4c2.setText("30min");
            r5c2.setText("42");
            r6c2.setText("3");

        }
        else if(v.getId()== R.id.labotatuvar2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("2");
            r2c2.setText("550");
            r3c2.setText("50k");
            r4c2.setText("5h");
            r5c2.setText("134");
            r6c2.setText("4");
        }
        else if(v.getId()== R.id.labotatuvar3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);

            r1c2.setText("3");
            r2c2.setText("600");
            r3c2.setText("90k");
            r4c2.setText("12h");
            r5c2.setText("207");
            r6c2.setText("5");
        }
        else if(v.getId()== R.id.labotatuvar4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("4");
            r2c2.setText("650");
            r3c2.setText("270k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.labotatuvar5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("5");
            r2c2.setText("700");
            r3c2.setText("500k");
            r4c2.setText("2d");
            r5c2.setText("415");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.labotatuvar6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("6");
            r2c2.setText("750");
            r3c2.setText("1M");
            r4c2.setText("4d");
            r5c2.setText("587");
            r6c2.setText("8");
        }
        else if(v.getId()== R.id.labotatuvar7){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("7");
            r2c2.setText("800");
            r3c2.setText("2.5M");
            r4c2.setText("5d");
            r5c2.setText("657");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.labotatuvar8){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("8");
            r2c2.setText("850");
            r3c2.setText("4M");
            r4c2.setText("6d");
            r5c2.setText("720");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


