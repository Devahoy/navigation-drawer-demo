package com.devahoy.navigationdrawerdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        int resourceId = getArguments().getInt(MyActivity.KEY_DRAWABLE_ID);
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setImageResource(resourceId);

        return view;
    }
}
