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

public class OkcuKralice extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton barbarkral1;
    ImageButton barbarkral2;
    ImageButton barbarkral3;

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
        setContentView(R.layout.okcu_kralice);
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
        barbarkral1 = (ImageButton) findViewById(R.id.okcukralice1);
        barbarkral2 = (ImageButton) findViewById(R.id.okcukralice2);
        barbarkral3 = (ImageButton) findViewById(R.id.okcukralice3);


        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) OkcuKralice.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Damage per Second:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Hitpoints:");
        r2c2=(TextView)popupPencere.getContentView().findViewById(R.id.R2C2);

        r3c1=(TextView) popupPencere.getContentView().findViewById(R.id.R3C1);
        r3c1.setText("Regen Time:");
        r3c2=(TextView) popupPencere.getContentView().findViewById(R.id.R3C2);

        r4c1=(TextView) popupPencere.getContentView().findViewById(R.id.R4C1);
        r4c1.setText("Training Cost:");
        r4c2=(TextView) popupPencere.getContentView().findViewById(R.id.R4C2);
        r4c3=(TextView) popupPencere.getContentView().findViewById(R.id.R4C3);
        r4c3.setBackgroundResource(R.drawable.karaiksiricon);

        r5c1=(TextView) popupPencere.getContentView().findViewById(R.id.R5C1);
        r5c1.setText("Training Time:");
        r5c2=(TextView) popupPencere.getContentView().findViewById(R.id.R5C2);

        r6c1=(TextView) popupPencere.getContentView().findViewById(R.id.R6C1);
        r6c1.setText("Town Hall Require:");
        r6c2=(TextView) popupPencere.getContentView().findViewById(R.id.R6C2);

    }
    public void popupInit() {

        barbarkral1.setOnClickListener(this);
        barbarkral2.setOnClickListener(this);
        barbarkral3.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.okcukralice1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("160 - 194");
            r2c2.setText("725 - 856");
            r3c2.setText("30min - 46 min");
            r4c2.setText("40k - 45k");
            r5c2.setText("N/A - 4d");
            r6c2.setText("9 - 9");

        }
        else if(v.getId()== R.id.okcukralice2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("199 - 249");
            r2c2.setText("874 - 1053");
            r3c2.setText("48m - 1h 6m");
            r4c2.setText("50k - 95k");
            r5c2.setText("4d 12h - 7d");
            r6c2.setText("9 - 9");
        }

        else if(v.getId()== R.id.okcukralice3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("255 - 419");
            r2c2.setText("1.076 - 1.630");
            r3c2.setText("1h 8m - 1h 48m");
            r4c2.setText("100k - 200k");
            r5c2.setText("7d - 7d");
            r6c2.setText("9 - 10");
        }

        else {
            popupPencere.dismiss();
        }
    }



}


