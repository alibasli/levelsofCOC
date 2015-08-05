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

public class Barbar extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton barbar1;
    ImageButton barbar2;
    ImageButton barbar3;
    ImageButton barbar4;
    ImageButton barbar5;
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
        setContentView(R.layout.barbar);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), Asker.class);
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
        barbar1 = (ImageButton) findViewById(R.id.barbar1);
        barbar2 = (ImageButton) findViewById(R.id.barbar2);
        barbar3 = (ImageButton) findViewById(R.id.barbar3);
        barbar4 = (ImageButton) findViewById(R.id.barbar4);
        barbar5 = (ImageButton) findViewById(R.id.barbar5);
        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) Barbar.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        barbar1.setOnClickListener(this);
        barbar2.setOnClickListener(this);
        barbar3.setOnClickListener(this);
        barbar4.setOnClickListener(this);
        barbar5.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.barbar1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("8 - 11");
            r2c2.setText("45 - 54");
            r3c2.setText("25 - 40");
            r4c2.setText("N/A - 50k");
            r5c2.setText("N/A - 1");
            r6c2.setText("N/A - 6h");

        }
        else if(v.getId()== R.id.barbar2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("14 - 18");
            r2c2.setText("65 - 78");
            r3c2.setText("60 - 80");
            r4c2.setText("150k - 500k");
            r5c2.setText("3 - 5");
            r6c2.setText("1d - 3d");
        }
        else if(v.getId()== R.id.barbar3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("23");
            r2c2.setText("95");
            r3c2.setText("100");
            r4c2.setText("1.5M");
            r5c2.setText("6");
            r6c2.setText("5d");
        }
        else if(v.getId()== R.id.barbar4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("26");
            r2c2.setText("110");
            r3c2.setText("150");
            r4c2.setText("4.5M");
            r5c2.setText("7");
            r6c2.setText("10d");
        }
        else if(v.getId()== R.id.barbar5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("30");
            r2c2.setText("125");
            r3c2.setText("200");
            r4c2.setText("6M");
            r5c2.setText("8");
            r6c2.setText("14d");
        }
        else {
            popupPencere.dismiss();
        }
    }



}


