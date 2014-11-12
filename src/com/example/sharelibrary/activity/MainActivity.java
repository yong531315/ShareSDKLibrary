package com.example.sharelibrary.activity;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

import com.example.sharelibrary.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}
	
	public void share(View v){
		ShareSDK.initSDK(this);
		
		OnekeyShare oks=new OnekeyShare();
		oks.disableSSOWhenAuthorize();
		oks.setNotification(R.drawable.ic_launcher, "share");
		oks.setTitle("hellow world");
		oks.setText("fenxiang");
		oks.setUrl("http://www.baidu.com");
		oks.setComment("I am test comment test");
		oks.show(this);
				
		
	}
}
