package book.chapter04.dailtest;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText editText;
	Button btnDial;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText=(EditText)this.findViewById(R.id.etNum);
		btnDial=(Button)this.findViewById(R.id.btnDial);
		
		btnDial.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//���ַ���ת����URI����
				Uri uri=Uri.parse("tel:"+editText.getText().toString());
				//��һ��������ʾ�����Ķ�����ϵͳ�����������ò��Ź��ܣ��ڶ�����������ָ�����������ݣ��������ĸ�����
				Intent intent=new Intent(Intent.ACTION_CALL,uri);
				MainActivity.this.startActivity(intent);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
