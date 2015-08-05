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

public class Pekka extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;

    TextView popupBilgi;


    ImageButton pekka1;
    ImageButton pekka2;
    ImageButton pekka3;
    ImageButton pekka4;
    ImageButton pekka5;

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
        setContentView(R.layout.pekka);
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





        pekka1 = (ImageButton) findViewById(R.id.pekka1);
        pekka2 = (ImageButton) findViewById(R.id.pekka2);
        pekka3 = (ImageButton) findViewById(R.id.pekka3);
        pekka4 = (ImageButton) findViewById(R.id.pekka4);
        pekka5 = (ImageButton) findViewById(R.id.pekka5);



        popupBilgi = new TextView(this);

        layoutOfPopup = new RelativeLayout(this);


        popupBilgi.setPadding(0, 0, 0, 20);

        //layoutOfPopup.setBackgroundColor(Color.BLACK);
        // layoutOfPopup.addView(popupBilgi);
        //layoutOfPopup.addView(popupButton);

        LayoutInflater inflater = (LayoutInflater) Pekka.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

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

        pekka1.setOnClickListener(this);
        pekka2.setOnClickListener(this);
        pekka3.setOnClickListener(this);
        pekka4.setOnClickListener(this);
        pekka5.setOnClickListener(this);

        //popupPencere = new PopupWindow(layoutOfPopup, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // popupPencere.setContentView(layoutOfPopup);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.pekka1) {
            popupBilgi.setText("pekka1 bilgisi");
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("240");
            r2c2.setText("2.8k");
            r3c2.setText("30k");
            r4c2.setText("N/A");
            r5c2.setText("N/A");
            r6c2.setText("N/A");


        }
        else if(v.getId()== R.id.pekka2){
            popupBilgi.setText("pekka2 bilgisi");
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("270");
            r2c2.setText("3.1k");
            r3c2.setText("35k");
            r4c2.setText("3M");
            r5c2.setText("6");
            r6c2.setText("10d");
        }
        else if(v.getId()== R.id.pekka3){
            popupBilgi.setText("pekka3 bilgisi");
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("300");
            r2c2.setText("3.5k");
            r3c2.setText("40k");
            r4c2.setText("6M");
            r5c2.setText("6");
            r6c2.setText("12d");
        }
        else if(v.getId()== R.id.pekka4){
            popupBilgi.setText("pekka4 bilgisi");
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("340");
            r2c2.setText("4k");
            r3c2.setText("45k");
            r4c2.setText("7M");
            r5c2.setText("8");
            r6c2.setText("14d");
        }
        else if(v.getId()== R.id.pekka5){
            popupBilgi.setText("pekka5 bilgisi");
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("380");
            r2c2.setText("4.5k");
            r3c2.setText("50k");
            r4c2.setText("8M");
            r5c2.setText("8");
            r6c2.setText("14d");

        }
        else {
            popupPencere.dismiss();
        }
    }



}


