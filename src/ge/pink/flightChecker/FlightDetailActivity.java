package ge.pink.flightChecker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FlightDetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flight);

		TextView tv = (TextView) findViewById(R.id.flightNumberTextView);
		tv.setText(getIntent().getExtras().getString("flightNumber"));
	}

}
