package com.toralipse.myapp.androidutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.toralipse.myapp.androidutil.listview.ItemAdapter;
import com.toralipse.myapp.androidutil.models.Sample;

import java.util.Arrays;
import java.util.List;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        List list = Arrays.asList(
                Sample.apply("key1", "value1"),
                Sample.apply("key2", "value2"),
                Sample.apply("key3", "value3")
        );

        ListView listview = (ListView) findViewById(R.id.sample_listview);
        listview.setAdapter(new ItemAdapter<Sample>(this, R.layout.row_sample, list) {
            @Override
            public void bindView(int position, View rowView, Sample item) {
                ((TextView) rowView.findViewById(R.id.row_sample_text1)).setText(item.getKey());
                ((TextView) rowView.findViewById(R.id.row_sample_text2)).setText(item.getValue());
            }
        });
    }
}
