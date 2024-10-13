package com.example.bt_ltdd_tablayout_navbottom.user_fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class UserViewPagerAdapter extends FragmentStatePagerAdapter {
    public UserViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NameFragment();
            case 1:
                return new IDFragment();
            case 2:
                return new ClassFragment();
            default:
                return new NameFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Ten";
            case 1:
                return "MSV";
            case 2:
                return "Lop";
            default:
                return "Ten";
        }
    }
}
