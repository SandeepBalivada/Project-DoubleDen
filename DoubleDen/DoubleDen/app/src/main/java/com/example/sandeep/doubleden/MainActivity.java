package com.example.sandeep.doubleden;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText url;
    WebView wv1,wv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = (EditText) findViewById(R.id.et1);
        wv1 = (WebView) findViewById(R.id.wv1);
        wv2 = (WebView) findViewById(R.id.wv2);

    }


    public void search1(View view) {
        String url1 =  "http://www."+url.getText().toString() + ".com";

        WebSettings settings = wv1.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        wv1.setFocusable(true);
        wv1.setFocusableInTouchMode(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl(url1);

    }

    public void search2(View view) {

        String url1 =  "http://www."+url.getText().toString() + ".com";

        WebSettings settings = wv2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        wv2.setFocusable(true);
        wv2.setFocusableInTouchMode(true);
        wv2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv2.setWebViewClient(new WebViewClient());
        wv2.loadUrl(url1);
    }


    public void facebook1(View view) {
        WebSettings settings = wv1.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        wv1.setFocusable(true);
        wv1.setFocusableInTouchMode(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://www.facebook.com");
    }

    public void gmail1(View view) {
        WebSettings settings = wv1.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        wv1.setFocusable(true);
        wv1.setFocusableInTouchMode(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://www.gmail.com");
    }

    public void linkedin1(View view) {
        WebSettings settings = wv1.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        wv1.setFocusable(true);
        wv1.setFocusableInTouchMode(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://www.linkedin.com");
    }

    public void twitter1(View view) {
        WebSettings settings = wv1.getSettings();
        settings.setJavaScriptEnabled(true);
        wv1.setFocusable(true);
        settings.setBuiltInZoomControls(true);
        wv1.setFocusableInTouchMode(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://www.twitter.com");

    }

    public void facebook2(View view) {
        WebSettings settings = wv2.getSettings();
        settings.setJavaScriptEnabled(true);
        wv2.setFocusable(true);
        settings.setBuiltInZoomControls(true);
        wv2.setFocusableInTouchMode(true);
        wv2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv2.setWebViewClient(new WebViewClient());
        wv2.loadUrl("https://www.facebook.com");
    }

    public void gmail2(View view) {
        WebSettings settings = wv2.getSettings();
        settings.setJavaScriptEnabled(true);
        wv2.setFocusable(true);
        wv2.setFocusableInTouchMode(true);
        settings.setBuiltInZoomControls(true);
        wv2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv2.setWebViewClient(new WebViewClient());
        wv2.loadUrl("https://www.gmail.com");
    }

    public void linkedin2(View view) {
        WebSettings settings = wv2.getSettings();
        settings.setJavaScriptEnabled(true);
        wv2.setFocusable(true);
        settings.setBuiltInZoomControls(true);
        wv2.setFocusableInTouchMode(true);
        wv2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv2.setWebViewClient(new WebViewClient());
        wv2.loadUrl("https://www.linkedin.com");
    }

    public void twitter2(View view) {
        WebSettings settings = wv2.getSettings();
        settings.setJavaScriptEnabled(true);
        wv2.setFocusable(true);
        settings.setBuiltInZoomControls(true);
        wv2.setFocusableInTouchMode(true);
        wv2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv2.setWebViewClient(new WebViewClient());
        wv2.loadUrl("https://www.twitter.com");
    }
}
