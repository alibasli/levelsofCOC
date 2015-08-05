package com.emar.coclevels;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {

    private InterstitialAd interstitial;

    ImageButton ibDekorasyon;
    ImageButton ibSavunma;
    ImageButton ibOrdu;
    ImageButton ibKaynak;
    ImageButton ibAsker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder() .build();
        adView.loadAd(adRequest);

        if(globaldegisken.someVariable){
                interstitial = new InterstitialAd(MainActivity.this);
                interstitial.setAdUnitId("ca-app-pub-7763141267799460/1006959031");
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                            displayInterstitial();
                        }

                        });
                    globaldegisken.someVariable=false;
                }

        ibDekorasyon=(ImageButton)findViewById(R.id.ibDekorasyon);
        ibDekorasyon.setOnTouchListener(dekorasyon_button_on_touch_listener);
        ibDekorasyon.setOnClickListener(dekorasyon_button_on_click_listener);

        ibKaynak=(ImageButton)findViewById(R.id.ibKaynak);
        ibKaynak.setOnTouchListener(kaynak_button_on_touch_listener);
        ibKaynak.setOnClickListener(kaynak_button_on_click_listener);

        ibOrdu=(ImageButton)findViewById(R.id.ibOrdu);
        ibOrdu.setOnTouchListener(ordu_button_on_touch_listener);
        ibOrdu.setOnClickListener(ordu_button_on_click_listener);

        ibSavunma=(ImageButton)findViewById(R.id.ibSavunma);
        ibSavunma.setOnTouchListener(savunma_button_on_touch_listener);
        ibSavunma.setOnClickListener(savunma_button_on_click_listener);

        ibAsker=(ImageButton)findViewById(R.id.ibAsker);
        ibAsker.setOnTouchListener(ibasker_button_on_touch_listener);
        ibAsker.setOnClickListener(ibasker_button_on_click_listener);

    }

    public void displayInterstitial() {

        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

    private View.OnTouchListener dekorasyon_button_on_touch_listener=new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    ibDekorasyon.setBackgroundResource(R.drawable.dekorasyonclick);
                    break;
                case MotionEvent.ACTION_MOVE:
                    ibDekorasyon.setBackgroundResource(R.drawable.dekorasyonclick);
                    break;
                case MotionEvent.ACTION_UP:
                    ibDekorasyon.setBackgroundResource(R.drawable.dekorasyon);
                    break;
            }
            return false;
        }
    };

    private View.OnClickListener dekorasyon_button_on_click_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),dekorasyon.class);
            startActivity(i);
        }
    };

    private View.OnTouchListener kaynak_button_on_touch_listener=new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    ibKaynak.setBackgroundResource(R.drawable.kaynakclick);
                    break;
                case MotionEvent.ACTION_MOVE:
                    ibKaynak.setBackgroundResource(R.drawable.kaynakclick);
                    break;
                case MotionEvent.ACTION_UP:
                    ibKaynak.setBackgroundResource(R.drawable.kaynak);
                    break;
            }
            return false;
        }
    };

    private View.OnClickListener kaynak_button_on_click_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),kaynak.class);
            startActivity(i);
        }
    };

    private View.OnTouchListener ordu_button_on_touch_listener=new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    ibOrdu.setBackgroundResource(R.drawable.orduclick);
                    break;
                case MotionEvent.ACTION_MOVE:
                    ibOrdu.setBackgroundResource(R.drawable.orduclick);
                    break;
                case MotionEvent.ACTION_UP:
                    ibOrdu.setBackgroundResource(R.drawable.ordu);
                    break;
            }
            return false;
        }
    };

    private View.OnClickListener ordu_button_on_click_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),ordu.class);
            startActivity(i);
        }
    };

    private View.OnTouchListener savunma_button_on_touch_listener=new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    ibSavunma.setBackgroundResource(R.drawable.savunmaclick);
                    break;
                case MotionEvent.ACTION_MOVE:
                    ibSavunma.setBackgroundResource(R.drawable.savunmaclick);
                    break;
                case MotionEvent.ACTION_UP:
                    ibSavunma.setBackgroundResource(R.drawable.savunma);
                    break;
            }
            return false;
        }
    };

    private View.OnClickListener savunma_button_on_click_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),savunma.class);
            startActivity(i);
        }
    };
    private View.OnTouchListener ibasker_button_on_touch_listener=new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    ibAsker.setBackgroundResource(R.drawable.askerclick);
                    break;
                case MotionEvent.ACTION_MOVE:
                    ibAsker.setBackgroundResource(R.drawable.askerclick);
                    break;
                case MotionEvent.ACTION_UP:
                    ibAsker.setBackgroundResource(R.drawable.asker);
                    break;
            }
            return false;
        }
    };

    private View.OnClickListener ibasker_button_on_click_listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent();
            i.setClass(getApplicationContext(),Asker.class);
            startActivity(i);
        }
    };
}


