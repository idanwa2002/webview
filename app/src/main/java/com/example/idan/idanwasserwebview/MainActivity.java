package com.example.idan.idanwasserwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
WebView web;
Button btn;
EditText et1, et2, et3;
String gg, a, b, c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = (WebView) findViewById(R.id.wv);
        btn = (Button) findViewById(R.id.bttn);
        et1 = (EditText) findViewById(R.id.et);
        et2 = (EditText) findViewById(R.id.ett);
        et3 = (EditText) findViewById(R.id.ettt);
        web.getSettings().setJavaScriptEnabled(true);
    }
    public void click (View view) {
        gg = "https://www.google.co.il/search?q=";
        a = et1.getText().toString();
        b = et2.getText().toString();
        c = et3.getText().toString();
        if ((a.isEmpty()) || (b.isEmpty()) || (c.isEmpty())) {
            Toast.makeText(this, "There are missing numbers", Toast.LENGTH_SHORT).show();
        }
            else if (Double.parseDouble(a) == 0){
            Toast.makeText(this, "a can't be 0", Toast.LENGTH_SHORT).show();}
            else {
                gg = gg + a + "x%5E2%2B" + b + "x%2b" + c;
                web.loadUrl(gg);
        }
    }
}
