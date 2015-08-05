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

public class Dalkavuk extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;

    ImageButton dalkavuk1;
    ImageButton dalkavuk2;
    ImageButton dalkavuk3;
    ImageButton dalkavuk4;

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
        setContentView(R.layout.dal_kavuk);
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

        dalkavuk1 = (ImageButton) findViewById(R.id.dalkavuk1);
        dalkavuk2 = (ImageButton) findViewById(R.id.dalkavuk2);
        dalkavuk3 = (ImageButton) findViewById(R.id.dalkavuk3);
        dalkavuk4 = (ImageButton) findViewById(R.id.dalkavuk4);
        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) Dalkavuk.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        dalkavuk1.setOnClickListener(this);
        dalkavuk2.setOnClickListener(this);
        dalkavuk3.setOnClickListener(this);
        dalkavuk4.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.dalkavuk1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("35 - 38");
            r2c2.setText("55 - 60");
            r3c2.setText("6 - 7");
            r4c2.setText("N/A - 10k");
            r5c2.setText("N/A - 5");
            r6c2.setText("N/A - 5d");

        }
        else if(v.getId()== R.id.dalkavuk2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("42 - 46");
            r2c2.setText("66 - 72");
            r3c2.setText("8 - 9");
            r4c2.setText("20k - 30k");
            r5c2.setText("6 - 6");
            r6c2.setText("6d - 7d");
        }
        else if(v.getId()== R.id.dalkavuk3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("50");
            r2c2.setText("78");
            r3c2.setText("10");
            r4c2.setText("40k");
            r5c2.setText("7");
            r6c2.setText("10d");
        }
        else if(v.getId()== R.id.dalkavuk4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("54");
            r2c2.setText("84");
            r3c2.setText("11");
            r4c2.setText("100k");
            r5c2.setText("8");
            r6c2.setText("14d");
        }
        else {
            popupPencere.dismiss();
        }
    }



}


