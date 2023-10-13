package CSS.flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // declare variables for length and width inputs
    private EditText editTextRoomWidth;
    private EditText editTextRoomLength;
    private Button buttonResults;

    //onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("ResultsActivity", "ResultsActivityCreated");
        editTextRoomWidth = findViewById(R.id.editTextRoomWidth);
        editTextRoomLength = findViewById(R.id.editTextRoomLength);
        buttonResults = findViewById(R.id.buttonResults);

        // Calculate button - on click listener
        buttonResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // parse into doubles
                double length = Double.parseDouble(editTextRoomLength.getText().toString());
                double width = Double.parseDouble(editTextRoomWidth.getText().toString());

                // intent
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                intent.putExtra("length", length);
                intent.putExtra("width", width);

                // start activity
                startActivity(intent);

            }
        });
    }

}