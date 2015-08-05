package com.emar.coclevels;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ordu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordu);
        ImageButton backbutton=(ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
          AdView adView = (com.google.android.gms.ads.AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        ImageButton kisla = (ImageButton) findViewById(R.id.kisla);
        kisla.setOnClickListener(kisla_button_onclick_listener);

        ImageButton laboratuvar = (ImageButton) (findViewById(R.id.labaratovar));
        laboratuvar.setOnClickListener(laboratuvar_button_onclick_listener);

        ImageButton buyuFabrikasi = (ImageButton) (findViewById(R.id.buyufabrikasi));
        buyuFabrikasi.setOnClickListener(buyufabrikasi_button_onclick_listener);

        ImageButton barbarKral = (ImageButton) (findViewById(R.id.barbarkral));
        barbarKral.setOnClickListener(barbarKral_button_onclick_listener);

        ImageButton karaKisla = (ImageButton) (findViewById(R.id.karakisla));
        karaKisla.setOnClickListener(kara_kisla_button_onclick_listener);

        ImageButton okcuKralice = (ImageButton) (findViewById(R.id.okcukralice));
        okcuKralice.setOnClickListener(okcu_kralice_button_onclick_listener);

        ImageButton kamp = (ImageButton) (findViewById(R.id.kamp));
        kamp.setOnClickListener(kamp_button_onclick_listener);


    }

    View.OnClickListener kamp_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), kamp.class);
            startActivity(i);
        }
    };
    View.OnClickListener kisla_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), Kisla.class);
            startActivity(i);
        }
    };
    View.OnClickListener laboratuvar_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), Labrotuvar.class);
            startActivity(i);
        }
    };
    View.OnClickListener buyufabrikasi_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), BuyuFabrikasi.class);
            startActivity(i);
        }
    };
    View.OnClickListener barbarKral_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), BarbarKral.class);
            startActivity(i);
        }
    };
    View.OnClickListener kara_kisla_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), KaraKisla.class);
            startActivity(i);
        }
    };
    View.OnClickListener okcu_kralice_button_onclick_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getApplicationContext(), OkcuKralice.class);
            startActivity(i);
        }
    };


}
