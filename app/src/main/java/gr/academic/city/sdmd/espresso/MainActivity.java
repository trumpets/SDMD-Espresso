package gr.academic.city.sdmd.espresso;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_say_hello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtName = (EditText) findViewById(R.id.txt_name);
                TextView tvGreeting = (TextView) findViewById(R.id.tv_greeting);

                tvGreeting.setText(getString(R.string.greeting, txtName.getText().toString()));
            }
        });
    }
}
