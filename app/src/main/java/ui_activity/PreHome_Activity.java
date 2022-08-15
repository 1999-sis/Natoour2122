package ui_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.natour2122.R;

public class PreHome_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_home);

        ImageButton btn_arrow = (ImageButton) findViewById(R.id.imageButton6);
        btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });
    }

    public void openHomeActivity(){
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
    }
}
