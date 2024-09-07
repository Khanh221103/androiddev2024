package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    // onCreateView called after the onCreate
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = new View(getContext());
        view.setBackgroundColor(0x2000FF00);
        // Inflate the layout for this fragment
////        return inflater.inflate(R.layout.fragment_forecast, container, false);
////        return inflater.inflate(R.layout.fragment_forecast, container, false);

        View v = new View(getContext());
        v.setBackgroundColor(0x2000FF00);
        // set linear layout
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        //
//        linearLayout.setBackgroundColor(0x2000FF00);
        //-
        ImageView cloudy = new ImageView(getContext());
        cloudy.setImageResource(R.drawable.cloudy);
        linearLayout.addView(cloudy);
        linearLayout.addView(v);
        //
        return linearLayout;

//        return view;
    }

}