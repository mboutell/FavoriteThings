package edu.rosehulman.favoritethings;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mColorTextView;
    private TextView mNumberTextView;
    private long mNumber;
    private static final String TAG = "FAVES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorTextView = (TextView) findViewById(R.id.color_text_view);
        mNumberTextView = (TextView) findViewById(R.id.number_text_view);
        mNumber = 17;

        findViewById(R.id.red_button).setOnClickListener(this);
        findViewById(R.id.white_button).setOnClickListener(this);
        findViewById(R.id.blue_button).setOnClickListener(this);
        findViewById(R.id.update_color_button).setOnClickListener(this);
        findViewById(R.id.increment_number_button).setOnClickListener(this);
        findViewById(R.id.decrement_number_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.red_button:
                mColorTextView.setText(R.string.red);

                return;
            case R.id.white_button:
                mColorTextView.setText(R.string.white);

                return;
            case R.id.blue_button:
                mColorTextView.setText(R.string.blue);

                return;
            case R.id.update_color_button:
                Log.d(TAG, "Updating from Firebase");

                return;
            case R.id.increment_number_button:
                mNumber++;
                mNumberTextView.setText("" + mNumber);
                return;
            case R.id.decrement_number_button:
                mNumber--;
                mNumberTextView.setText("" + mNumber);
                return;

        }
    }
}
