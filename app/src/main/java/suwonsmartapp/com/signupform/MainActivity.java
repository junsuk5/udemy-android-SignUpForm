package suwonsmartapp.com.signupform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mNameEditText;
    private Button mSignUpButton;
    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEditText = (EditText) findViewById(R.id.name_edit);
        mSignUpButton = (Button) findViewById(R.id.signup_button);
        mMessageTextView = (TextView) findViewById(R.id.message_text);

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMessageTextView.setText(mNameEditText.getText().toString() + "님, 회원가입을 축하드립니다");
            }
        });
    }
}
