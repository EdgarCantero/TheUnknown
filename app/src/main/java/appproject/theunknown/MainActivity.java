package appproject.theunknown;

import android.support.v7.app.AppCompatActivity;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView answerText;

    private SensorManager sensorManager;
    private float acceleration;
    private float currentAcceleration;
    private float previousAcceleration;

    private final SensorEventListener sensorListener = new SensorEventListener() {
      @Override
      public void onSensorChanged(SensorEvent event) {

      }

      @Override
      public void onAccuracyChanged(Sensor sensor, int accuracy)  {


      }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerText = (TextView) findViewById(R.id.answerText);
        answerText.setText(Predictions.get().getPrediction());

    }
}
