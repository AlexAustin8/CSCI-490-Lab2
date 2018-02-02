package com.example.alex.intentdemo;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activitytwo extends AppCompatActivity {
    ImageView ivOne;
    ImageView ivTwo;
    private int imageID

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);

        ivTwo = findViewById(R.id.waterfall);
        ivOne = findViewById(R.id.supermoon);

        ivOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageID = R.drawable.supermoon;
                finish();
            }
        });

        ivTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageID = R.drawable.waterfall;
                finish();
            }
        });
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("imageID", imageID);

        setResult(RESULT_OK, intent);
        super.finish();
    }


    }
}
