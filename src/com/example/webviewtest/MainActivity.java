package com.example.webviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	//记得一定要前面加上http, 否则会报找不到网页
	//private String url = "http://www.51cto.com";
	private String url = "http://119.254.108.211/ftphome/android";
	public static String TAG = "webview";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WebView webview = (WebView) findViewById(R.id.webview01);
		webview.getSettings().setJavaScriptEnabled(true); //设置能够执行JS脚本
		webview.getSettings().setBuiltInZoomControls(true); //设置支持缩放
		webview.getSettings().setLoadWithOverviewMode(true); //设置适应屏幕大小
		webview.loadUrl(url);
		webview.setWebViewClient(new WebViewClient() {
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				Log.i(TAG, "Enter in setWebViewClient method!!!");
				return true;
			}
		});
				
	}
}
