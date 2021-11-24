package www.pcnutrenggalek.auah.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import www.pcnutrenggalek.auah.R;

public class LottieActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        button = findViewById(R.id.btnloti);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LottieActivity.this, OneActivity.class);
                startActivity(intent);
            }
        });
    }
}