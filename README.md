ShareSDKLibrary
===============

可以直接在项目中引用的Library Project(Library Project which you can use in your application project )

用法：把此项目做为library引入到你的工程，在你的工程manifest文件中添加权限

    <uses-permission android:name="android.permission.GET_TASKS" />
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
<uses-permission android:name="android.permission.MANAGE_ACCOUNTS"/>
<uses-permission android:name="android.permission.GET_ACCOUNTS"/>
        
        
        并添加activity：
        
        
<activity
  android:name="cn.sharesdk.framework.ShareSDKUIShell"
  android:theme="@android:style/Theme.Translucent.NoTitleBar"
  android:configChanges="keyboardHidden|orientation|screenSize"
  android:screenOrientation="portrait"
  android:windowSoftInputMode="stateHidden|adjustResize" >
   <intent-filter>
        <data android:scheme="tencent100371282" />
        <action android:name="android.intent.action.VIEW" />
        <category android:name="android.intent.category.BROWSABLE" />
        <category android:name="android.intent.category.DEFAULT" />
    </intent-filter>
</activity>

然后在你的activity中调用就可以了
调用示例：
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
