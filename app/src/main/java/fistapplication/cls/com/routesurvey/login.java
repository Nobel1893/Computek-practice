package fistapplication.cls.com.routesurvey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class login extends AppCompatActivity implements View.OnClickListener {

    protected EditText username;
    protected EditText phone;
    protected Spinner gender;
    protected Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.route1);
        Button login = findViewById(R.id.login);

        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.login) {
            startActivity(new Intent(login.this, CoursesList.class));
        }
    }

    private void initView() {
        username = (EditText) findViewById(R.id.username);
        phone = (EditText) findViewById(R.id.phone);
        gender = (Spinner) findViewById(R.id.gender);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(login.this);
    }
}
