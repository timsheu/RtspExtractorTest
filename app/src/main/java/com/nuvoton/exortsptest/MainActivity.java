package com.nuvoton.exortsptest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import me.courbiere.rtspextractor.RtspExtractor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri.Builder builder = new Uri.Builder();
        final String urlString = "rtsp://wowzaec2demo.streamlock.net/vod/mp4:BigBuckBunny_115k.mov";
        URL url;
        Uri uri = builder.build();
        try {
            url = new URL(urlString);
            uri = Uri.parse( url.toURI().toString() );
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        RtspExtractor rtspExtractor = new RtspExtractor(this, uri, null);
    }

}
