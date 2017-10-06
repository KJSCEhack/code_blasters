package com.example.lokhandmanav.test1;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;


public class MainActivity extends AppCompatActivity {
    WifiManager wifimanager;
    String mac = "86:73:03:c7:fc:4c";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.Submit);
        Switch wifi = (Switch)findViewById(R.id.wifiSwitch);

        wifi.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean on) {
                        if(on)
                        {

                            wifimanager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                            wifimanager.setWifiEnabled(true);

                        }
                        else {

                            wifimanager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                            wifimanager.setWifiEnabled(false);
                        }
                    }
                }

        );


        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        wifimanager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                        WifiInfo wifiInfo = wifimanager.getConnectionInfo();
                        String macCheck = (String)wifiInfo.getBSSID();
                        TextView text = (TextView)findViewById(R.id.textView1);
                        TextView text2 = (TextView)findViewById(R.id.textView2);
                        text2.setText(macCheck) ;
                        if(mac.contentEquals(macCheck))
                        {
                            text.setText("Sarvang Present!");
                        }
                        else
                        {
                            text.setText("Failed!");
                        }

                    }
                }
        );


    }

    @Override
    protected void onStart(){
        super.onStart();

    }
    @Override
    protected void onResume(){
        super.onResume();

    }
    @Override
    protected void onPause(){
        super.onPause();

    }
    @Override
    protected void onStop(){
        super.onStop();

    }
    @Override
    protected void onRestart(){
        super.onRestart();

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();

    }


}
