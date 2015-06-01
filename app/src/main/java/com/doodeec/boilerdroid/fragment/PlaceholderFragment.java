package com.doodeec.boilerdroid.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.doodeec.boilerdroid.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * @author Dusan Bartos
 */
public class PlaceholderFragment extends Fragment {

    public static final String FRAGMENT_TAG = "placeholderFragment";

    @InjectView(R.id.text)
    TextView mTextView;

    public static PlaceholderFragment newInstance(Bundle arguments) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        fragment.setArguments(arguments);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_placeholder, container, false);
        ButterKnife.inject(this, view);
        return view;
    }
}
