package papaya.in.sendmail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendMail mail = new SendMail(Config.EMAIL, Config.PASSWORD,
                "papayacoders@gmail.com",
                "Testing Email Sending",
                "Yes, it's working well\nI will use it always.");

        findViewById(R.id.sendMail).setOnClickListener(v -> mail.execute());
    }
}