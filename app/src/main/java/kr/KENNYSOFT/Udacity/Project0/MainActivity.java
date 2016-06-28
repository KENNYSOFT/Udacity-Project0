package kr.KENNYSOFT.Udacity.Project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn1).setOnClickListener(this);
		findViewById(R.id.btn2).setOnClickListener(this);
		findViewById(R.id.btn3).setOnClickListener(this);
		findViewById(R.id.btn4).setOnClickListener(this);
		findViewById(R.id.btn5).setOnClickListener(this);
		findViewById(R.id.btn6).setOnClickListener(this);
	}

	public void onClick(View v)
	{
		String app_name=null;
		switch(v.getId())
		{
		case R.id.btn1:
			app_name=getString(R.string.btn1);
			break;
		case R.id.btn2:
			app_name=getString(R.string.btn2);
			break;
		case R.id.btn3:
			app_name=getString(R.string.btn3);
			break;
		case R.id.btn4:
			app_name=getString(R.string.btn4);
			break;
		case R.id.btn5:
			app_name=getString(R.string.btn5);
			break;
		case R.id.btn6:
			app_name=getString(R.string.btn6);
			break;
		}
		Toast.makeText(this,String.format(Locale.getDefault(),getString(R.string.toast_format),app_name),Toast.LENGTH_SHORT).show();
	}
}
