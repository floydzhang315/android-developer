https://github.com/floydzhang1984/android-developerhttps://github.com/floydzhang1984/android-developerhttps://github.com/floydzhang1984/android-developerhttps://github.com/floydzhang1984/android-developerhttps://github.com/floydzhang1984/android-developerhttps://github.com/floydzhang1984/android-developerpackage com.example.webviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	//�ǵ�һ��Ҫǰ�����http, ����ᱨ�Ҳ�����ҳ
	//private String url = "http://119.254.108.211/ftphome/android";
	private String url = "http://119.254.108.211/ftphome/android/training/index.html";
	public static String TAG = "webview";
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WebView webview = (WebView) findViewById(R.id.webview01);
		webview.getSettings().setJavaScriptEnabled(true); //�����ܹ�ִ��JS�ű�
		webview.getSettings().setBuiltInZoomControls(true); //����֧������
		webview.getSettings().setLoadWithOverviewMode(true); //������Ӧ��Ļ��С
		webview.getSettings().setRenderPriority(RenderPriority.HIGH);
		//webview.getSettings().setBlockNetworkImage(true);
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
