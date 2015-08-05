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

public class BuyuFabrikasi extends Activity implements View.OnClickListener {

    RelativeLayout layoutOfPopup;
    PopupWindow popupPencere;
    ImageButton buyufabrikasi1;
    ImageButton buyufabrikasi2;
    ImageButton buyufabrikasi3;
    ImageButton buyufabrikasi4;
    ImageButton buyufabrikasi5;


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
        setContentView(R.layout.buyu_fabrikasi);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), ordu.class);
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
        buyufabrikasi1 = (ImageButton) findViewById(R.id.buyufabrikasi1);
        buyufabrikasi2 = (ImageButton) findViewById(R.id.buyufabrikasi2);
        buyufabrikasi3 = (ImageButton) findViewById(R.id.buyufabrikasi3);
        buyufabrikasi4 = (ImageButton) findViewById(R.id.buyufabrikasi4);
        buyufabrikasi5 = (ImageButton) findViewById(R.id.buyufabrikasi5);



        layoutOfPopup = new RelativeLayout(this);
        LayoutInflater inflater = (LayoutInflater) BuyuFabrikasi.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_pencere,(ViewGroup) findViewById(R.id.popup_element));
        popupPencere = new PopupWindow(layout, 500, 350, true);

        r1c1=(TextView) popupPencere.getContentView().findViewById(R.id.R1C1);
        r1c1.setText("Hitpoints:");
        r1c2=(TextView) popupPencere.getContentView().findViewById(R.id.R1C2);

        r2c1=(TextView) popupPencere.getContentView().findViewById(R.id.R2C1);
        r2c1.setText("Spell Unlocked:");
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

        buyufabrikasi1.setOnClickListener(this);
        buyufabrikasi2.setOnClickListener(this);
        buyufabrikasi3.setOnClickListener(this);
        buyufabrikasi4.setOnClickListener(this);
        buyufabrikasi5.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.buyufabrikasi1) {
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("425");
            r2c2.setText("Lightning Spell");
            r3c2.setText("200k");
            r4c2.setText("1d");
            r5c2.setText("293");
            r6c2.setText("5");

        }
        else if(v.getId()== R.id.buyufabrikasi2){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("470");
            r2c2.setText("Healing Spell");
            r3c2.setText("400k");
            r4c2.setText("2d");
            r5c2.setText("470");
            r6c2.setText("6");
        }
        else if(v.getId()== R.id.buyufabrikasi3){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);

            r1c2.setText("525");
            r2c2.setText("Rage Spell");
            r3c2.setText("800k");
            r4c2.setText("4d");
            r5c2.setText("515");
            r6c2.setText("7");
        }
        else if(v.getId()== R.id.buyufabrikasi4){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("565");
            r2c2.setText("Jump Spell");
            r3c2.setText("1.6M");
            r4c2.setText("5d");
            r5c2.setText("565");
            r6c2.setText("9");
        }
        else if(v.getId()== R.id.buyufabrikasi5){
            popupPencere.showAtLocation(layoutOfPopup, Gravity.CENTER, 0, 0);
            r1c2.setText("615");
            r2c2.setText("Freeze Spell");
            r3c2.setText("3.2M");
            r4c2.setText("6d");
            r5c2.setText("615");
            r6c2.setText("10");
        }

        else {
            popupPencere.dismiss();
        }
    }

}


