package sg.edu.rp.soi.intentdatapassingtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv3 = findViewById(R.id.tv3);
        Intent intentReceived = getIntent();
        Character value = intentReceived.getCharExtra("value",'a');
        tv3.setText("Character value received is: " +value);
    }
}
