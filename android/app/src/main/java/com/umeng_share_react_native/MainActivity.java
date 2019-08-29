package com.umeng_share_react_native;

import com.facebook.react.ReactActivity;


//友盟
import android.os.Bundle;
import com.umeng.socialize.UMShareAPI;
import com.umeng_share_react_native.umeng.ShareModule;
import android.content.Intent;
public class MainActivity extends ReactActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ShareModule.initSocialSDK(this);//友盟
    }
    //友盟
    @Override
        public void onActivityResult(int requestCode,int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);

        //MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
    }
    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "umeng_share_react_native";
    }
}
