package hu.hungerit.singletonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import hu.hungerit.singletonapp.singletons.TestSingleton;

public class MainActivity extends AppCompatActivity
{
    // region UI elements
    private TextView textViewData;

    private Button buttonNextActivity;
    // endregion

    // region Singletons
    private TestSingleton testSingleton;
    // endregion

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testSingleton = TestSingleton.getInstance();

        initializeComponent();

        textViewData.setText(testSingleton.getData1());
    }

    private void initializeComponent()
    {
        // TextView
        textViewData = findViewById(R.id.textViewData);

        // Button
        buttonNextActivity = findViewById(R.id.buttonNextActivity);

        buttonNextActivity.setOnClickListener(view ->
        {
            testSingleton.setData1("Hello from Activity 1");

            var intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
    }
}