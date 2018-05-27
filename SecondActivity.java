package com.example.subscription;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class SecondActivity extends Activity
{
	TextView t;
	
    @Override
    
protected void onCreate(Bundle savedInstanceState) 
    {
        
super.onCreate(savedInstanceState);
        
setContentView(R.layout.second_main);
        
checkInit();
    }
    public void checkInit()
    {
    	t = (TextView)findViewById(R.id.tv1);
    	
    	String s = "You have been successfully subscribed for " + getIntent().getExtras().getString("data");
    	t.setText(s);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }


}
