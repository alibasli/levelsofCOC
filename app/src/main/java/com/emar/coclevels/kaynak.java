package com.emar.coclevels;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class kaynak extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kaynak);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        ImageButton iksirToplayici = (ImageButton) findViewById(R.id.iksirmadeni);
        iksirToplayici.setOnClickListener(iksirmadeni_button_onclick_listener);

        ImageButton iksirDeposu = (ImageButton) (findViewById(R.id.iksirdeposu));
        iksirDeposu.setOnClickListener(iksirdeposu_button_onclick_listener);

        ImageButton altinMadeni = (ImageButton) (findViewById(R.id.altinmadeni));
        altinMadeni.setOnClickListener(altinmadeni_button_onclick_listener);

        ImageButton altinDeposu = (ImageButton) (findViewById(R.id.altindeposu));
        altinDeposu.setOnClickListener(altindeposu_button_onclick_listener);

        ImageButton karaIksirSondasi = (ImageButton) (findViewById(R.id.karaiksirsondasi));
        karaIksirSondasi.setOnClickListener(karaiksirsondasi_button_onclick_listener);

        ImageButton karaIksirDeposu = (ImageButton) (findViewById(R.id.karaiksir));
        karaIksirDeposu.setOnClickListener(karaiksir_button_onclick_listener);




    }

    View.OnClickListener iksirmadeni_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), IksirToplayici.class);
            startActivity(i);
        }
    };
    View.OnClickListener iksirdeposu_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), IksirDeposu.class);
            startActivity(i);
        }
    };
    View.OnClickListener altinmadeni_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), AltinMadeni.class);
            startActivity(i);
        }
    };
    View.OnClickListener altindeposu_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), AltinDeposu.class);
            startActivity(i);
        }
    };
    View.OnClickListener karaiksirsondasi_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), KaraIksirSondasi.class);
            startActivity(i);
        }
    };
    View.OnClickListener karaiksir_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), KaraIksirDeposu.class);
            startActivity(i);
        }
    };

}


