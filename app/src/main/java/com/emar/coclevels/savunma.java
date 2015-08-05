package com.emar.coclevels;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class savunma  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savunma);
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
        ImageButton cannon=(ImageButton)findViewById(R.id.top);
        cannon.setOnClickListener(cannon_button_onclick_listener);

        ImageButton okcukulesi=(ImageButton)(findViewById(R.id.okcukulesi));
        okcukulesi.setOnClickListener(okcu_kulesi_button_onclick_listener);

        ImageButton havan=(ImageButton)(findViewById(R.id.havantopu));
        havan.setOnClickListener(havan_button_onclick_listener);

        ImageButton duvar=(ImageButton)(findViewById(R.id.duvar));
        duvar.setOnClickListener(duvar_button_onclick_listener);

        ImageButton havaSavunmasi=(ImageButton)(findViewById(R.id.havasavunmasi));
        havaSavunmasi.setOnClickListener(hava_savunmasi_button_onclick_listener);

        ImageButton bomba=(ImageButton)(findViewById(R.id.bomba));
        bomba.setOnClickListener(bomba_button_onclick_listener);

        ImageButton buyucuKulesi=(ImageButton)(findViewById(R.id.buyucukulesi));
        buyucuKulesi.setOnClickListener(buyucu_kulesi_button_onclick_listener);

        ImageButton havaBombasi=(ImageButton)(findViewById(R.id.havabombasi));
        havaBombasi.setOnClickListener(hava_bombasi_button_onclick_listener);

        ImageButton devBomba=(ImageButton)(findViewById(R.id.devbomba));
        devBomba.setOnClickListener(dev_bomba_button_onclick_listener);

        ImageButton gudumluHavaBombasi=(ImageButton)(findViewById(R.id.gudumluhavabombasi));
        gudumluHavaBombasi.setOnClickListener(gudumlu_hava_bombasi_onclick_listener);

        ImageButton tesla=(ImageButton)(findViewById(R.id.tesla));
        tesla.setOnClickListener(tesla_onclick_listener);

        ImageButton mezarci=(ImageButton)(findViewById(R.id.iskelettuzak));
        mezarci.setOnClickListener(mezarci_onclick_listener);

        ImageButton xBow=(ImageButton)(findViewById(R.id.xbow));
        xBow.setOnClickListener(x_bow_onclick_listener);

        ImageButton cehennemKulesi=(ImageButton)(findViewById(R.id.cehennemkulesi));
        cehennemKulesi.setOnClickListener(cehennem_kulesi_onclick_listener);


    }

    View.OnClickListener cannon_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),cannon.class);
            startActivity(i);
        }
    };
    View.OnClickListener okcu_kulesi_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),OkcuKule.class);
            startActivity(i);
        }
    };
    View.OnClickListener havan_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),HavanTopu.class);
            startActivity(i);
        }
    };
    View.OnClickListener duvar_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Duvar.class);
            startActivity(i);
        }
    };
    View.OnClickListener hava_savunmasi_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),HavaSavunmasi.class);
            startActivity(i);
        }
    };
    View.OnClickListener bomba_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Bomba.class);
            startActivity(i);
        }
    };
    View.OnClickListener buyucu_kulesi_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),BuyucuKulesi.class);
            startActivity(i);
        }
    };
    View.OnClickListener hava_bombasi_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),HavaBombasi.class);
            startActivity(i);
        }
    };
    View.OnClickListener dev_bomba_button_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),DevBomba.class);
            startActivity(i);
        }
    };
    View.OnClickListener gudumlu_hava_bombasi_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),GudumluHavaBombasi.class);
            startActivity(i);
        }
    };
    View.OnClickListener tesla_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Tesla.class);
            startActivity(i);
        }
    };
    View.OnClickListener mezarci_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Mezarci.class);
            startActivity(i);
        }
    };
    View.OnClickListener x_bow_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),XBow.class);
            startActivity(i);
        }
    };
    View.OnClickListener cehennem_kulesi_onclick_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),CehennemKulesi.class);
            startActivity(i);
        }
    };


}
