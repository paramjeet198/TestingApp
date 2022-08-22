package com.techbull.codepathandroid;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.techbull.codepathandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        binding.btn.setOnClickListener(view -> {
            binding.textView.setTextColor(Color.GREEN);
            binding.textView.setTypeface(Typeface.DEFAULT_BOLD);
            binding.textView.setTextSize(25);
        });


    }
}