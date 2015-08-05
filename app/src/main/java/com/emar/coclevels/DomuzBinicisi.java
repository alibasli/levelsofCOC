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

public class DomuzBinicisi extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;

    ImageButton domuzbinici1;
    ImageButton domuzbinici2;
    ImageButton domuzbinici3;

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
        setContentView(R.layout.domuz_binicisi);
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

        domuzbinici1 = (ImageButton) findViewById(R.id.domuzbinici1);
        domuzbinici2 = (ImageButton) findViewById(R.id.domuzbinici2);
        domuzbinici3 = (ImageButton) findViewById(R.id.domuzbinici3);

        layoutOfPopup = new RelativeLayout(this);

        //layoutOfPopup.setBackgroundColor(Color.BLACK);
        // layoutOfPopup.addView(popupBilgi);
        //layoutOfPopup.addView(popupButton);

        LayoutInflater inflater = (LayoutInflater) DomuzBinicisi.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        r3c3.setBackgroundResource(R.drawable.karaiksiricon);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Research Cost:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);
        r4c3.setBackgroundResource(R.drawable.karaiksiricon);

        r5c1=(TextView) popupPencere.getContentView().findViewById(R.id.R5C1);
        r5c1.setText("Min. Lab. Level:");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Research Time:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        domuzbinici1.setOnClickListener(this);
        domuzbinici2.setOnClickListener(this);
        domuzbinici3.setOnClickListener(this);

        //popupPencere = new PopupWindow(layoutOfPopup, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // popupPencere.setContentView(layoutOfPopup);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.domuzbinici1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("60 - 70");
            r2c2.setText("270 - 312");
            r3c2.setText("40 - 45");
            r4c2.setText("N/A - 20k");
            r5c2.setText("N/A - 5");
            r6c2.setText("N/A - 8d");


        }
        else if(v.getId()== R.id.domuzbinici2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("80 - 92");
            r2c2.setText("360 - 415");
            r3c2.setText("52 - 58");
            r4c2.setText("30k - 40k");
            r5c2.setText("6 - 6");
            r6c2.setText("10d - 12d");
        }
        else if(v.getId()== R.id.domuzbinici3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("105");
            r2c2.setText("475");
            r3c2.setText("58");
            r4c2.setText("50k");
            r5c2.setText("7");
            r6c2.setText("14d");
        }
      
        else {
            popupPencere.dismiss();
        }
    }



}


