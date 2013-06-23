package ge.pink.flightChecker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		System.out.println("onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		addListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void addListenerOnButton() {

		final Context context = this;
		final EditText flightNumberEditText = (EditText) findViewById(R.id.airlineTextField);

		Button button = (Button) findViewById(R.id.searchButton);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				System.out.println("onclick");
				Intent intent = new Intent(context, FlightDetailActivity.class);
				intent.putExtra("flightNumber", flightNumberEditText.getText()
						.toString());
				startActivity(intent);
			}

		});

	}
}
