package ui_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.natour2122.R;

public class MainActivity extends AppCompatActivity {

   // private final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_signin = (Button) findViewById(R.id.buttonSignIn);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openLoginActivity();
                //System.out.println("hai cliccato");
            }
        });

         Button btn_signup = (Button) findViewById(R.id.buttonSignUp);
         btn_signup.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openSignUpActivity();
             }
         });
    }
    public void openLoginActivity() {
        Intent intent= new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
     public void openSignUpActivity(){
         Intent intent_signup=new Intent(this,SignUpActivity.class);
         startActivity(intent_signup);
     }
}