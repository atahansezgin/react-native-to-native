package com.example.templatejavaproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.facebook.react.PackageList;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

import java.util.List;

public class MainActivity extends AppCompatActivity {

  private ReactRootView mReactRootView;
  private ReactInstanceManager mReactInstanceManager;

  private void configRNView(){
    List<ReactPackage> packages = new PackageList(getApplication()).getPackages();
    // Packages that cannot be autolinked yet can be added manually here, for example:
    // packages.add(new MyReactNativePackage());
    // Remember to include them in `settings.gradle` and `app/build.gradle` too.

    mReactRootView = new ReactRootView(this);
    mReactInstanceManager = ReactInstanceManager.builder()
      .setApplication(getApplication())
      .setCurrentActivity(this)
      .setBundleAssetName("index.android.bundle")
      .setJSMainModulePath("index")
      .addPackages(packages)
      .setUseDeveloperSupport(BuildConfig.DEBUG)
      .setInitialLifecycleState(LifecycleState.RESUMED)
      .build();
    // The string here (e.g. "IntegratedApp") has to match
    // the string in AppRegistry.registerComponent() in index.js

    Bundle props = new Bundle();
    props.putString("name","Salem");
    mReactRootView.startReactApplication(mReactInstanceManager, "HelloMessage", props);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    configRNView();
    setContentView(R.layout.activity_main);
    LinearLayout viewContainer = findViewById(R.id.viewContainer);
    viewContainer.addView(mReactRootView);
  }
}