package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewAdapter extends FragmentStateAdapter {

    public VIewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
    public ViewAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new Tab1Fragment();
                return new fragment1();
                case 1:
                    return new Tab2Fragment();
                return new fragment2();
                case 2:
                    return new Tab3Fragment();
                case 3:
                    return new Tab4Fragment();
                return new fragment3();

                default:
                    return new Tab1Fragment();
                return new fragment1();
            }

        }

        @Override
        public int getItemCount() {
            return 4;
            return 3;
        }
    }
    {
    }
