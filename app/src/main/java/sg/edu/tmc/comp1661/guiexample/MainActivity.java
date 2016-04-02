package sg.edu.tmc.comp1661.guiexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextEventName = (EditText)
                findViewById(R.id.editTextEventName);

        Button button = (Button) findViewById(R.id.buttonAddEvent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eventName = editTextEventName.getText().toString();
                Toast.makeText(MainActivity.this,
                        "Name of event: " + eventName, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
