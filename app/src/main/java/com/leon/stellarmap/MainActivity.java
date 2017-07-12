package com.leon.stellarmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leon.stellarmap.lib.StellarMap;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> dataList = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            dataList.add(String.valueOf(i));
        }

        StellarMap stellarMap = (StellarMap) findViewById(R.id.stellar_map);
        //设置adapter
        stellarMap.setAdapter(new StellarMapAdapter(this, dataList));
        int padding = getResources().getDimensionPixelSize(R.dimen.padding);
        //设置星状图内部padding
        stellarMap.setInnerPadding(padding, padding, padding, padding);
        //设置布局网格15*20，越大分布越平均
        stellarMap.setRegularity(15, 20);
        //设置初始化组
        stellarMap.setGroup(0);
    }
}
