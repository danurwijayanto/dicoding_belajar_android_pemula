package com.example.barvolume1;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity  {
    public static final String description = "description";
    public static final Integer image_gamelan = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        TextView tvDataReceived = findViewById(R.id.tv_description_gamelan);
        ImageView tvImageReceived = findViewById(R.id.tv_gamelan_image);
        String desc = getIntent().getStringExtra(description);
        Integer im = getIntent().getIntExtra(String.valueOf(image_gamelan), 0);

        tvDataReceived.setText(desc);
        tvImageReceived.setImageResource(im);
    }
}
