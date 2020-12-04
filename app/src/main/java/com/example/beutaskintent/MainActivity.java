package com.example.beutaskintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void setLessonName(View view) {
        Toast.makeText(this, "sdfasdas", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, LessonNameActivity.class);
        startActivityForResult(intent, 200);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 200)
            textView.setText(data != null ? data.getStringExtra("lessonName") : "no lesson name");
    }
}