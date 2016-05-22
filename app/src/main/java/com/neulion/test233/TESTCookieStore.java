package com.neulion.test233;

import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BasicClientCookie;

public class TESTCookieStore extends BasicCookieStore
{

    private static TESTCookieStore sInstance;

    public static TESTCookieStore getInstance()
    {
        if (sInstance == null)
        {
            return sInstance = new TESTCookieStore();
        }

//        sInstance.addCookie(new BasicClientCookie("PHPSESSID","v9optd3n445fp0jfr7l3tac3a6"));

        return sInstance;
    }
}
