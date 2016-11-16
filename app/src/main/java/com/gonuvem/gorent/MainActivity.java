package com.gonuvem.gorent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.car_list_view);

        final ArrayList<Car> list_car = new FireControl().retrive_all_cars();

        CarAdapter adapter = new CarAdapter(this, list_car);
        mListView.setAdapter(adapter);
    }
}
