package sg.edu.rp.soi.intentdatapassingtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class FourthActivity extends Activity {
    TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tv4 = findViewById(R.id.tv4);
        Intent intentReceived = getIntent();
        Double value = intentReceived.getDoubleExtra("value",99.99);
        tv4.setText("Double value received is: " + value);
    }
}
