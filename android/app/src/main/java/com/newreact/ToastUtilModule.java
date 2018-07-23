package com.newreact;


import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ToastUtilModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public ToastUtilModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "ToastUtil";
    }

    @ReactMethod
    public void showToast(){
      Toast toast = Toast.makeText(getCurrentActivity().getApplicationContext(), "hellooooo", Toast.LENGTH_SHORT);
      toast.show();
    }
}
