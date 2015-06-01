package com.doodeec.boilerdroid.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.doodeec.boilerdroid.R;
import com.doodeec.boilerdroid.fragment.PlaceholderFragment;

/**
 * @author Dusan Bartos
 */
public class PlaceholderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeholder);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_container, PlaceholderFragment.newInstance(null), PlaceholderFragment.FRAGMENT_TAG)
                    .commit();
        }
    }
}
