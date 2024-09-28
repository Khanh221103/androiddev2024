package vn.edu.usth.weather;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        getSupportFragmentManager().beginTransaction()
//            .replace(R.id.cloudFragment , new CloudFragment())
//                .replace(R.id.fragment_forecast, new ForecastFragment())
//                .commit();
//        findViewById(R.id.frameLayout);
        ForecastFragment forecastFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameLayout, forecastFragment)
                .replace(R.id.cloudFragment, new CloudFragment())
                .replace(R.id.fragment_forecast, new ForecastFragment())
                .commit();
    }
//@Override
//protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    EdgeToEdge.enable(this);
//    setContentView(R.layout.activity_main);
//    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//        return insets;
//    });
//}

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("start", "On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("resume", "On resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("pause", "On pause");
    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.i("stop", "On stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("destroy", "On destroy");
    }
}