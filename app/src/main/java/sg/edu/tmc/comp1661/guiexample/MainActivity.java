package sg.edu.tmc.comp1661.guiexample;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
        final EditText editTextDateTime = (EditText) findViewById(R.id.editTextDateTime);
        final EditText editTextLocation = (EditText) findViewById(R.id.editTextLocation);
        final EditText editTextOrganiser = (EditText) findViewById(R.id.editTextOrganiser);
        final EditText editTextDescription = (EditText) findViewById(R.id.editTextDescription);

        Button button = (Button) findViewById(R.id.buttonAddEvent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eventName = editTextEventName.getText().toString();
                String datetime = editTextDateTime.getText().toString();
                String location = editTextLocation.getText().toString();
                String organiser = editTextOrganiser.getText().toString();
                String description = editTextDescription.getText().toString();

                Toast.makeText(MainActivity.this,
                        "Name of event: " + eventName, Toast.LENGTH_SHORT).show();

                showAlertDialog("Name of event: " + eventName);
            }
        });
    }

    public void showAlertDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add Event?"); //should use strings.xmls
        builder.setMessage(message);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Added new event", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Cancelled", Toast.LENGTH_SHORT).show();
            }
        });

        builder.create();
        builder.show();
    }


}
