package com.koala.diycat.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.koala.diycat.R;
import com.koala.diycat.util.IconUtils;

/**
 *  @author Liger
 *  @date   2018/4/26 上午1:00
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IconUtils.setIcon(getApplication(),false);
    }
}
