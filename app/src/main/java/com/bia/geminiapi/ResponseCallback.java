package com.bia.geminiapi;

public interface ResponseCallback {
    void onResponse(String response);

    void onError(Throwable throwable);
}
