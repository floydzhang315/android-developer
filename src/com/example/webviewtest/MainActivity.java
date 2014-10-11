package com.example.webviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	//�ǵ�һ��Ҫǰ�����http, ����ᱨ�Ҳ�����ҳ
	//private String url = "http://www.51cto.com";
	private String url = "http://119.254.108.211/ftphome/android";
	public static String TAG = "webview";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WebView webview = (WebView) findViewById(R.id.webview01);
		webview.getSettings().setJavaScriptEnabled(true); //�����ܹ�ִ��JS�ű�
		webview.getSettings().setBuiltInZoomControls(true); //����֧������
		webview.getSettings().setLoadWithOverviewMode(true); //������Ӧ��Ļ��С
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
