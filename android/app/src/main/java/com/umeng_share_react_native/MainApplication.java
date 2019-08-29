package com.umeng_share_react_native;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;


//友盟
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;
import com.umeng_share_react_native.umeng.DplusReactPackage;
import com.umeng_share_react_native.umeng.RNUMConfigure;




public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }
    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new DplusReactPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);

    UMConfigure.setLogEnabled(true);
    RNUMConfigure.init(this, "5d5bb17a570df3aa260003e2", "Umeng", UMConfigure.DEVICE_TYPE_PHONE,"");

  }
  // 设置使用的三方平台的appkey：
  /*{
    PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
    PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad", "http://sns.whalecloud.com");
    PlatformConfig.setQQZone("101773792", "9553206c62b3c205229954f2d09bccfb");
  }*/
  {

    PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
    PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad", "http://sns.whalecloud.com");
    //PlatformConfig.setYixin("yxc0614e80c9304c11b0391514d09f13bf");
    PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");

  }
  {
    PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
    //豆瓣RENREN平台目前只能在服务器端配置
    PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");
    //PlatformConfig.setYixin("yxc0614e80c9304c11b0391514d09f13bf");
    PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
    PlatformConfig.setTwitter("3aIN7fuF685MuZ7jtXkQxalyi", "MK6FEYG63eWcpDFgRYw4w9puJhzDl0tyuqWjZ3M7XJuuG7mMbO");
    //PlatformConfig.setAlipay("2015111700822536");
    //PlatformConfig.setLaiwang("laiwangd497e70d4", "d497e70d4c3e4efeab1381476bac4c5e");
    //PlatformConfig.setPinterest("1439206");
    //PlatformConfig.setKakao("e4f60e065048eb031e235c806b31c70f");
    //PlatformConfig.setDing("dingoalmlnohc0wggfedpk");
    //PlatformConfig.setVKontakte("5764965","5My6SNliAaLxEm3Lyd9J");
    //PlatformConfig.setDropbox("oz8v5apet3arcdy","h7p2pjbzkkxt02a");
    //PlatformConfig.setYnote("9c82bf470cba7bd2f1819b0ee26f86c6ce670e9b");

  }
}
