package com.emar.coclevels;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Asker extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asker);
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

        ImageButton barbar=(ImageButton)findViewById(R.id.barbar);
        barbar.setOnClickListener(barbar_button_onclick_listener);

        ImageButton okcu=(ImageButton)(findViewById(R.id.okcu));
        okcu.setOnClickListener(okcu_button_onclick_listener);

        ImageButton dev=(ImageButton)(findViewById(R.id.dev));
        dev.setOnClickListener(dev_button_onclick_listener);

        ImageButton goblin=(ImageButton)(findViewById(R.id.goblin));
        goblin.setOnClickListener(goblin_button_onclick_listener);

        ImageButton duvarYikici=(ImageButton)(findViewById(R.id.duvaryikici));
        duvarYikici.setOnClickListener(duvaryikici_button_onclick_listener);

        ImageButton balon=(ImageButton)(findViewById(R.id.balon));
        balon.setOnClickListener(balon_button_onclick_listener);

        ImageButton buyucu=(ImageButton)(findViewById(R.id.buyucu));
        buyucu.setOnClickListener(buyucu_button_onclick_listener);

        ImageButton melek=(ImageButton)(findViewById(R.id.melek));
        melek.setOnClickListener(melek_button_onclick_listener);

        ImageButton ejder=(ImageButton)(findViewById(R.id.ejder));
        ejder.setOnClickListener(ejder_button_onclick_listener);

        ImageButton pekka=(ImageButton)(findViewById(R.id.pekka));
        pekka.setOnClickListener(pekka_onclick_listener);

        ImageButton dalkavuk=(ImageButton)(findViewById(R.id.dalkavuk));
        dalkavuk.setOnClickListener(dalkavuk_onclick_listener);

        ImageButton domuzBinicisi=(ImageButton)(findViewById(R.id.domuzbinicisi));
        domuzBinicisi.setOnClickListener(domuzbinicisi_onclick_listener);

        ImageButton donenKadin=(ImageButton)(findViewById(R.id.donenkadin));
        donenKadin.setOnClickListener(donenkadin_onclick_listener);

        ImageButton golem=(ImageButton)(findViewById(R.id.golem));
        golem.setOnClickListener(golem_onclick_listener);

        ImageButton mezarciAnasi=(ImageButton)(findViewById(R.id.mezarcianasi));
        mezarciAnasi.setOnClickListener(mezarcianasi_onclick_listener);

        ImageButton havayaSaldiran=(ImageButton)(findViewById(R.id.havayasaldiran));
        havayaSaldiran.setOnClickListener(havayasaldiran_onclick_listener);



    }

    View.OnClickListener barbar_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Barbar.class);
            startActivity(i);
        }
    };
    View.OnClickListener okcu_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Okcu.class);
            startActivity(i);
        }
    };
    View.OnClickListener dev_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Dev.class);
            startActivity(i);
        }
    };
    View.OnClickListener goblin_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Goblin.class);
            startActivity(i);
        }
    };
    View.OnClickListener duvaryikici_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),DuvarYikici.class);
            startActivity(i);
        }
    };
    View.OnClickListener balon_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Balon.class);
            startActivity(i);
        }
    };
    View.OnClickListener buyucu_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Buyucu.class);
            startActivity(i);
        }
    };
    View.OnClickListener melek_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Melek.class);
            startActivity(i);
        }
    };
    View.OnClickListener ejder_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Ejder.class);
            startActivity(i);
        }
    };
    View.OnClickListener pekka_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Pekka.class);
            startActivity(i);
        }
    };

    View.OnClickListener dalkavuk_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Dalkavuk.class);
            startActivity(i);
        }
    };    View.OnClickListener domuzbinicisi_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),DomuzBinicisi.class);
            startActivity(i);
        }
    };    View.OnClickListener donenkadin_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),DonenKadin.class);
            startActivity(i);
        }
    };    View.OnClickListener golem_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Golem.class);
            startActivity(i);
        }
    };    View.OnClickListener mezarcianasi_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),MezarciAnasi.class);
            startActivity(i);
        }
    };    View.OnClickListener havayasaldiran_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),HavayaSaldiran.class);
            startActivity(i);
        }
    };

}
