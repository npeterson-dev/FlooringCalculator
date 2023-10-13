package CSS.flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //intent
        Intent intent = getIntent();
        double length = intent.getDoubleExtra("length", 0);
        double width = intent.getDoubleExtra("width", 0);

        // calculate area
        double area = length * width;

        //instantiate textViews
        TextView textViewRoomLength = findViewById(R.id.textViewLength);
        TextView textViewRoomWidth = findViewById(R.id.textViewWidth);
        TextView textViewFlooringNeeded = findViewById(R.id.textViewFlooringNeeded);

        textViewRoomLength.setText("Length:" + length);
        textViewRoomWidth.setText("Width: " + width);
        textViewFlooringNeeded.setText("Area: " + area);

    }
}