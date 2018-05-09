
// Start second activity and get a result back.

package com.example.snippet.activity2r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST_CODE = 1;

    // control
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference control
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        // button click event
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startSecondActivity();
            }
        });
    }

    // handle the result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // handle this resquest code
        if(requestCode == REQUEST_CODE){

            // check if operation is successful
            if(resultCode == RESULT_OK){

                // retrieve the string from the second activity.
                String str = data.getStringExtra("Any_Name");

                // display it
                textView.setText(str);
            }
        }
    }

    // start second activity
    private void startSecondActivity(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }
}
