package com.example.bt_ltdd_tablayout_navbottom.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new fragment_user();
            case 1:
                return new fragment_user1();
            case 2:
                return new fragment_user2();
            default:
                return new fragment_user1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
