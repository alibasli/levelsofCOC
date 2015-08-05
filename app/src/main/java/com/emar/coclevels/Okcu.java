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

public class Okcu extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;

    ImageButton okcu1;
    ImageButton okcu2;
    ImageButton okcu3;
    ImageButton okcu4;
    ImageButton okcu5;

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
        setContentView(R.layout.okcu);
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
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void init() {





        okcu1 = (ImageButton) findViewById(R.id.okcukiz1);
        okcu2 = (ImageButton) findViewById(R.id.okcukiz2);
        okcu3 = (ImageButton) findViewById(R.id.okcukiz3);
        okcu4 = (ImageButton) findViewById(R.id.okcukiz4);
        okcu5 = (ImageButton) findViewById(R.id.okcukiz5);




        layoutOfPopup = new RelativeLayout(this);



        //layoutOfPopup.setBackgroundColor(Color.BLACK);
        // layoutOfPopup.addView(popupBilgi);
        //layoutOfPopup.addView(popupButton);

        LayoutInflater inflater = (LayoutInflater) Okcu.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        okcu1.setOnClickListener(this);
        okcu2.setOnClickListener(this);
        okcu3.setOnClickListener(this);
        okcu4.setOnClickListener(this);
        okcu5.setOnClickListener(this);

        //popupPencere = new PopupWindow(layoutOfPopup, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // popupPencere.setContentView(layoutOfPopup);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.okcukiz1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("7 - 9");
            r2c2.setText("20 - 23");
            r3c2.setText("50 - 80");
            r4c2.setText("N/A - 50k");
            r5c2.setText("N/A - 1");
            r6c2.setText("N/A - 12h");


        }
        else if(v.getId()== R.id.okcukiz2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("12 - 16");
            r2c2.setText("28 - 33");
            r3c2.setText("120 - 160");
            r4c2.setText("250k - 750k");
            r5c2.setText("3 - 5");
            r6c2.setText("2d - 3d");
        }
        else if(v.getId()== R.id.okcukiz3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("20");
            r2c2.setText("40");
            r3c2.setText("200");
            r4c2.setText("2.25M");
            r5c2.setText("6");
            r6c2.setText("5d");
        }
        else if(v.getId()== R.id.okcukiz4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("22");
            r2c2.setText("44");
            r3c2.setText("300");
            r4c2.setText("6M");
            r5c2.setText("7");
            r6c2.setText("10d");
        }
        else if(v.getId()== R.id.okcukiz5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("25");
            r2c2.setText("48");
            r3c2.setText("400");
            r4c2.setText("7.5M");
            r5c2.setText("8");
            r6c2.setText("14d");

        }
        else {
            popupPencere.dismiss();
        }
    }



}


