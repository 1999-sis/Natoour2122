package ui_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.natour2122.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button_login = (Button) findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPreHomeActivity();
                //System.out.println("hai cliccato");
            }
        });
    }

    private void openPreHomeActivity() {
            Intent intent= new Intent(this,PreHome_Activity.class);
            startActivity(intent);
    }
}
