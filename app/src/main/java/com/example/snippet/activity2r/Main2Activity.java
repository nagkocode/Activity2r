
// Create the Second Activity
//
// 1. In the Project window, right-click the app folder.
// 2. Select New > Activity > Empty Activity.
// 3. In New Android Activity window, click finish.

package com.example.snippet.activity2r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    // control
    private EditText editText;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // reference control
        editText = findViewById(R.id.editText);
        button2 = findViewById(R.id.button2);

        // button click event
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                // get string from edit box
                String str = editText.getText().toString();

                // Create intent and pass the string (name-value pairs) to it.
                Intent intent = new Intent();
                intent.putExtra("Any_Name", str);
                setResult(RESULT_OK, intent);

                // close this activity
                finish();
            }
        });
    }
}
