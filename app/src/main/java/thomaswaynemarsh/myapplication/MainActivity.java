package thomaswaynemarsh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button actionDo = (Button)findViewById(R.id.btnDo);

        actionDo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String runner = "";

                EditText text = (EditText)findViewById(R.id.txtFirst);

                runner = String.valueOf(text.getText());

                TextView newText = (TextView)findViewById(R.id.);

                newText.setText( runner );
            }
        });
    }
}
