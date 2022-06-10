package com.example.mad_practice_21;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.rotate_iv);
        Button btn = findViewById(R.id.rotate_btn);
        btn.setOnClickListener(v -> rotateImage());
    }

    public void rotateImage() {
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotation_animation);
        image.startAnimation(rotate);
    }
}