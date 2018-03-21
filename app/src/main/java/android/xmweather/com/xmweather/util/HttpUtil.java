package android.xmweather.com.xmweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created on 2018/3/21 20:22
 *
 * @Author xiaoming
 * @emile xiaoming3C@126.com
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
