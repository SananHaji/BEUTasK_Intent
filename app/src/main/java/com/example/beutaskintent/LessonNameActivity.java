package com.example.beutaskintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LessonNameActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_name);

        editText = findViewById(R.id.editTextLessonName);
        editText.requestFocus();
    }

    public void setLessonNameAndReturnBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("lessonName", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();

    }
}