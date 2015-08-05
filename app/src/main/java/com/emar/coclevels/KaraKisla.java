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

public class KaraKisla extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton karakisla1;
    ImageButton karakisla2;
    ImageButton karakisla3;
    ImageButton karakisla4;
    ImageButton karakisla5;
    ImageButton karakisla6;

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
        setContentView(R.layout.kara_kisla);
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
        karakisla1 = (ImageButton) findViewById(R.id.karakisla1);
        karakisla2 = (ImageButton) findViewById(R.id.karakisla2);
        karakisla3 = (ImageButton) findViewById(R.id.karakisla3);
        karakisla4 = (ImageButton) findViewById(R.id.karakisla4);
        karakisla5 = (ImageButton) findViewById(R.id.karakisla5);
        karakisla6 = (ImageButton) findViewById(R.id.karakisla6);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) KaraKisla.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Build Cost:");
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

        karakisla1.setOnClickListener(this);
        karakisla2.setOnClickListener(this);
        karakisla3.setOnClickListener(this);
        karakisla4.setOnClickListener(this);
        karakisla5.setOnClickListener(this);
        karakisla6.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.karakisla1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("750k");
            r2c2.setText("3d");
            r3c2.setText("509");
            r4c2.setText("500");
            r5c2.setText("7");
            r6c2.setText("Minion");

        }
        else if(v.getId()== R.id.karakisla2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1.25M");
            r2c2.setText("5d");
            r3c2.setText("657");
            r4c2.setText("540");
            r5c2.setText("7");
            r6c2.setText("Hog Rider");
        }
        else if(v.getId()== R.id.karakisla3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("1.75M");
            r2c2.setText("6d");
            r3c2.setText("720");
            r4c2.setText("580");
            r5c2.setText("8");
            r6c2.setText("Valkyrie");
        }
        else if(v.getId()== R.id.karakisla4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("2.25M");
            r2c2.setText("7d");
            r3c2.setText("777");
            r4c2.setText("620");
            r5c2.setText("8");
            r6c2.setText("Golem");
        }
        else if(v.getId()== R.id.karakisla5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("2.75M");
            r2c2.setText("8d");
            r3c2.setText("831");
            r4c2.setText("660");
            r5c2.setText("9");
            r6c2.setText("Witch");
        }
        else if(v.getId()== R.id.karakisla6){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("3.5M");
            r2c2.setText("9d");
            r3c2.setText("881");
            r4c2.setText("700");
            r5c2.setText("9");
            r6c2.setText("Lava Hound");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


