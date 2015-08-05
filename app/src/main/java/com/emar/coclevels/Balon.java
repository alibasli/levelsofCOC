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

public class Balon extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton balon1;
    ImageButton balon2;
    ImageButton balon3;
    ImageButton balon4;
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
        setContentView(R.layout.balon);
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

        balon1 = (ImageButton) findViewById(R.id.balon1);
        balon2 = (ImageButton) findViewById(R.id.balon2);
        balon3 = (ImageButton) findViewById(R.id.balon3);
        balon4 = (ImageButton) findViewById(R.id.balon4);
        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) Balon.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        balon1.setOnClickListener(this);
        balon2.setOnClickListener(this);
        balon3.setOnClickListener(this);
        balon4.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.balon1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("25 - 32");
            r2c2.setText("150 - 180");
            r3c2.setText("2k -2.5k");
            r4c2.setText("N/A - 150k");
            r5c2.setText("N/A - 2");
            r6c2.setText("N/A - 1d");


        }
        else if(v.getId()== R.id.balon2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("48 - 72");
            r2c2.setText("216 - 280");
            r3c2.setText("3k - 3.5k");
            r4c2.setText("450k - 1.35M");
            r5c2.setText("4 - 5");
            r6c2.setText("2d - 3d");
        }
        else if(v.getId()== R.id.balon3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("108");
            r2c2.setText("390");
            r3c2.setText("4k");
            r4c2.setText("2.5M");
            r5c2.setText("6");
            r6c2.setText("5d");
        }
        else if(v.getId()== R.id.balon4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("162");
            r2c2.setText("545");
            r3c2.setText("4.5k");
            r4c2.setText("6M");
            r5c2.setText("7");
            r6c2.setText("10d");
        }
        else {
            popupPencere.dismiss();
        }
    }



}


