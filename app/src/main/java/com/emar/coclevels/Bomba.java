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

public class Bomba extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton bomba1;
    ImageButton bomba3;
    ImageButton bomba5;

    TextView r1c1;
    TextView r1c2;
    TextView r2c1;
    TextView r2c2;
    TextView r2c3;
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
        setContentView(R.layout.bomba);
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
        bomba1 = (ImageButton) findViewById(R.id.bomba1);
        bomba3 = (ImageButton) findViewById(R.id.bomba3);
        bomba5 = (ImageButton) findViewById(R.id.bomba5);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) Bomba.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Damage:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Cost:");
        r2c2=(TextView)popupPencere.getContentView().findViewById(R.id.R2C2);
        r2c3=(TextView) popupPencere.getContentView().findViewById(R.id.R2C3);
        r2c3.setBackgroundResource(R.drawable.altinicon);

        r3c1=(TextView) popupPencere.getContentView().findViewById(R.id.R3C1);
        r3c1.setText("Re-Arm Cost:");
        r3c2=(TextView) popupPencere.getContentView().findViewById(R.id.R3C2);
        r3c3=(TextView) popupPencere.getContentView().findViewById(R.id.R3C3);
        r3c3.setBackgroundResource(R.drawable.altinicon);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Build Time:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);

        r5c1=(TextView) popupPencere.getContentView().findViewById(R.id.R5C1);
        r5c1.setText("Experience Gained:");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);
        r5c3=(TextView) popupPencere.getContentView().findViewById(R.id.R5C3);
        r5c3.setBackgroundResource(R.drawable.xp);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Town Hall Level Require:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        bomba1.setOnClickListener(this);
        bomba3.setOnClickListener(this);
        bomba5.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.bomba1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("12 - 16");
            r2c2.setText("400 - 1k");
            r3c2.setText("400 - 500");
            r4c2.setText("0 - 15 min");
            r5c2.setText("0 - 30");
            r6c2.setText("3 - 3");

        }
        else if(v.getId()== R.id.bomba3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("20 - 26");
            r2c2.setText("10k - 100k");
            r3c2.setText("600 - 700");
            r4c2.setText("2 - 8 hours");
            r5c2.setText("84 - 169");
            r6c2.setText("5 - 7");
        }

        else if(v.getId()== R.id.bomba5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("34 - 42");
            r2c2.setText("1M - 1.5M");
            r3c2.setText("800 - 900");
            r4c2.setText("1d - 2d");
            r5c2.setText("293 - 415");
            r6c2.setText("8 - 9");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


