package comwow2778.naver.blog.second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button b6;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b6 = (Button)findViewById(R.id.b6);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String price = e1.getText().toString();
                String count = e2.getText().toString();
                int i = Integer.parseInt(price);
                int j = Integer.parseInt(count);
                Toast.makeText(Main2Activity.this, "가격은"+ i*j, Toast.LENGTH_SHORT).show();

                                  }
                              }
        );
    }
}
