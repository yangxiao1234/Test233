package com.neulion.test233;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.NameValuePair;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
{

    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        syslkasfjlaksfjlakjflasfjlkasjkl
        
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.edit);

        try
        {
            edit.setText(new JSONObject("{\"id\": 11557,\"b\":}").getString("id"));
        }
        catch (JSONException e)
        {
            edit.setText("JSONException");
        }

        //        findViewById(R.id.toupiao).setOnClickListener(new View.OnClickListener()
        //        {
        //            @Override
        //            public void onClick(View v)
        //            {
        //                loadUrl();
        //            }
        //        });
    }

    private void loadUrl()
    {
        new Te().start();
    }

    private class Te extends Thread
    {
        @Override
        public void run()
        {
            loadPages();

            loadPage();
        }

        private void loadPages()
        {
            HttpParams params = new BasicHttpParams();

            HttpConnectionParams.setConnectionTimeout(params,
                    60000);
            HttpConnectionParams.setSoTimeout(params, 60000);

            // Retrieve the response content.
            DefaultHttpClient httpclient = new DefaultHttpClient(params);

            httpclient.setCookieStore(TESTCookieStore.getInstance());

            httpclient.addRequestInterceptor(new HttpRequestInterceptor()
            {
                @Override
                public void process(HttpRequest request, HttpContext httpcontext)
                        throws HttpException, IOException
                {
                    request.addHeader("Accept", "application/json, text/javascript, */*; q=0.01");
                    request.addHeader("Origin", "http://qq.idouzi.com");
                    request.addHeader("X-Requested-With", "XMLHttpRequest");
                    request.addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 6.0.1; Nexus 5 Build/MMB29Q; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/48.0.2564.106 Mobile Safari/537.36 MicroMessenger/6.3.13.64_r4488992.740 NetType/WIFI Language/zh_CN");
                    request.addHeader("Accept-Encoding", "gzip, deflate");
                    request.addHeader("Accept-Language", "zh-CN,en-US;q=0.8");
                }
            });

            try
            {
                ResponseHandler<String> responseHandler = new BasicResponseHandler();
                String result = "";
                HttpPost httppost =
                        new HttpPost("http://qq.idouzi.com/index.php?r=mobile/microVote/Intro&wxid=37403&id=3931&lid=23846&from=timeline&isappinstalled=0");

                List<NameValuePair> nameValuePairs = new ArrayList<>();
                //id=hejin_toupiao&model=ticket&zid=338&formhash=d928f789&_=1455976875452
                //                params.setParameter("id", "hejin_toupiao");
                //                params.setParameter("model", "ticket");
                //                params.setParameter("zid", "338");
                //                params.setParameter("_", "1455976875452");

                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                result = httpclient.execute(httppost, responseHandler);

                // Close connection.
                //                httpclient.getConnectionManager().shutdown();

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }

        private void loadPage()
        {
            HttpParams params = new BasicHttpParams();

            HttpConnectionParams.setConnectionTimeout(params,
                    60000);
            HttpConnectionParams.setSoTimeout(params, 60000);

            // Retrieve the response content.
            DefaultHttpClient httpclient = new DefaultHttpClient(params);

            httpclient.setCookieStore(TESTCookieStore.getInstance());

            httpclient.addRequestInterceptor(new HttpRequestInterceptor()
            {
                @Override
                public void process(HttpRequest request, HttpContext httpcontext)
                        throws HttpException, IOException
                {
                    request.addHeader("Accept", "application/json, text/javascript, */*; q=0.01");
                    request.addHeader("Origin", "http://qq.idouzi.com");
                    request.addHeader("X-Requested-With", "XMLHttpRequest");
                    request.addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 6.0.1; Nexus 5 Build/MMB29Q; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/48.0.2564.106 Mobile Safari/537.36 MicroMessenger/6.3.13.64_r4488992.740 NetType/WIFI Language/zh_CN");
                    //                    request.addHeader("Referer","http://qq.idouzi.com/index.php?r=mobile/microVote/Intro&wxid=37403&id=3931&lid=23846&from=timeline&isappinstalled=0&state=14d2d73ff3d44cba083638b7d4d52372&shareOpenid=okmGDuMM4xmKEQdiyN7b2w8TCRGo&sharestatus=1");
                    request.addHeader("Accept-Encoding", "gzip, deflate");
                    request.addHeader("Accept-Language", "zh-CN,en-US;q=0.8");
                }
            });

            try
            {
                ResponseHandler<String> responseHandler = new BasicResponseHandler();
                String result = "";
                HttpPost httppost =
                        new HttpPost("http://qq.idouzi.com/index.php?r=mobile/microVote/handle&wxid=37403&id=3931&lid=23846");

                List<NameValuePair> nameValuePairs = new ArrayList<>();
                //id=hejin_toupiao&model=ticket&zid=338&formhash=d928f789&_=1455976875452
                //                params.setParameter("id", "hejin_toupiao");
                //                params.setParameter("model", "ticket");
                //                params.setParameter("zid", "338");
                //                params.setParameter("_", "1455976875452");

                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                result = httpclient.execute(httppost, responseHandler);

                // Close connection.
                //                httpclient.getConnectionManager().shutdown();

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        //
        //        private void loadPage2()
        //        {
        //            HttpParams params = new BasicHttpParams();
        //
        //            HttpConnectionParams.setConnectionTimeout(params,
        //                    60000);
        //            HttpConnectionParams.setSoTimeout(params, 60000);
        //
        //            // Retrieve the response content.
        //            DefaultHttpClient httpclient = new DefaultHttpClient(params);
        //
        //            httpclient.setCookieStore(TESTCookieStore.getInstance());
        //
        //            httpclient.addRequestInterceptor(new HttpRequestInterceptor()
        //            {
        //                @Override
        //                public void process(HttpRequest request, HttpContext httpcontext)
        //                        throws HttpException, IOException
        //                {
        //                    if (request.containsHeader("Cookie2"))
        //                    {
        //                        request.removeHeaders("Cookie2");
        //                    }
        //                    request.addHeader("Accept-Encoding", "gzip, deflate");
        //                    //                    request.addHeader("Referer", "http://308.weilianyun.com/plugin.php?id=hejin_toupiao&model=votea&vid=2&page=2");
        //                    request.addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 6.0.1; Nexus 5 Build/MMB29Q; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/47.0.2526.100 Mobile Safari/537.36 MicroMessenger/6.3.13.64_r4488992.740 NetType/WIFI Language/zh_CN");
        //                    request.addHeader("Accept-Language", "zh-CN,en-US;q=0.8");
        //                    //                    request.addHeader("Cookie", "PHPSESSID=1r7jnem750mfeqjgh4sgcomj75; 2pB0_2132_saltkey=ud2g22j2; 2pB0_2132_lastvisit=1455972170; " +
        //                    //                            "hjbox_openid=on7dHxLDqD0YY5kZG97qH5L2Tr_c; 2pB0_2132_sid=dH6KR3; 2pB0_2132_lastact=1455976876%09plugin.php%09");
        //                }
        //            });
        //
        //            try
        //            {
        //                ResponseHandler<String> responseHandler = new BasicResponseHandler();
        //                String result = "";
        //                HttpPost httppost =
        //                        new HttpPost("http://308.weilianyun.com/plugin.php?id=hejin_toupiao&model=clicks&vid=2&formhash=905ed0a7");
        //
        //
        //                List<NameValuePair> nameValuePairs = new ArrayList<>();
        //                //id=hejin_toupiao&model=ticket&zid=338&formhash=d928f789&_=1455976875452
        //                //                params.setParameter("id", "hejin_toupiao");
        //                //                params.setParameter("model", "ticket");
        //                //                params.setParameter("zid", "338");
        //                //                params.setParameter("_", "1455976875452");
        //
        //                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        //                result = httpclient.execute(httppost, responseHandler);
        //
        //                // Close connection.
        //                httpclient.getConnectionManager().shutdown();
        //
        //                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
        //            }
        //            catch (Exception e)
        //            {
        //                System.out.println(e);
        //            }
        //        }
        //
        //        private void loadPage3()
        //        {
        //            HttpParams params = new BasicHttpParams();
        //
        //            HttpConnectionParams.setConnectionTimeout(params,
        //                    60000);
        //            HttpConnectionParams.setSoTimeout(params, 60000);
        //
        //            // Retrieve the response content.
        //            DefaultHttpClient httpclient = new DefaultHttpClient(params);
        //
        //            httpclient.setCookieStore(TESTCookieStore.getInstance());
        //
        //            httpclient.addRequestInterceptor(new HttpRequestInterceptor()
        //            {
        //                @Override
        //                public void process(HttpRequest request, HttpContext httpcontext)
        //                        throws HttpException, IOException
        //                {
        //                    if (request.containsHeader("Cookie2"))
        //                    {
        //                        request.removeHeaders("Cookie2");
        //                    }
        //                    request.addHeader("Accept-Encoding", "gzip, deflate");
        //                    request.addHeader("Referer", "http://308.weilianyun.com/plugin.php?id=hejin_toupiao&model=votea&vid=2");
        //                    request.addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 6.0.1; Nexus 5 Build/MMB29Q; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/47.0.2526.100 Mobile Safari/537.36 MicroMessenger/6.3.13.64_r4488992.740 NetType/WIFI Language/zh_CN");
        //                    request.addHeader("Accept-Language", "zh-CN,en-US;q=0.8");
        //                    //                    request.addHeader("Cookie", "PHPSESSID=1r7jnem750mfeqjgh4sgcomj75; 2pB0_2132_saltkey=ud2g22j2; 2pB0_2132_lastvisit=1455972170; " +
        //                    //                            "hjbox_openid=on7dHxLDqD0YY5kZG97qH5L2Tr_c; 2pB0_2132_sid=dH6KR3; 2pB0_2132_lastact=1455976876%09plugin.php%09");
        //                }
        //            });
        //
        //            httpclient.addResponseInterceptor(new HttpResponseInterceptor()
        //            {
        //                @Override
        //                public void process(HttpResponse response, HttpContext context)
        //                        throws HttpException, IOException
        //                {
        //
        //                }
        //            });
        //
        //            try
        //            {
        //                ResponseHandler<String> responseHandler = new BasicResponseHandler();
        //                String result = "";
        //                HttpPost httppost =
        //                        new HttpPost("http://308.weilianyun.com/plugin.php?id=hejin_toupiao&model=ticket&zid=371&formhash=905ed0a7");
        //
        //
        //                List<NameValuePair> nameValuePairs = new ArrayList<>();
        //                //id=hejin_toupiao&model=ticket&zid=338&formhash=d928f789&_=1455976875452
        //                //                params.setParameter("id", "hejin_toupiao");
        //                //                params.setParameter("model", "ticket");
        //                //                params.setParameter("zid", "338");
        //                //                params.setParameter("_", "1455976875452");
        //
        //                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        //                result = httpclient.execute(httppost, responseHandler);
        //
        //                // Close connection.
        //                httpclient.getConnectionManager().shutdown();
        //
        //                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
        //            }
        //            catch (Exception e)
        //            {
        //                System.out.println(e);
        //            }
        //        }
    }
}
