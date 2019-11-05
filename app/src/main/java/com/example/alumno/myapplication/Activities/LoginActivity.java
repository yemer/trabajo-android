package com.example.alumno.myapplication.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumno.myapplication.R;
import com.example.alumno.myapplication.models.User;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtPassword;
    EditText txtUserName;
    ArrayList<User> listaUsuarios = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        User user1=new User();
        user1.setUsername("bichito");
        user1.setPassword("123456");
        User user2=new User();
        user2.setUsername("Plaga");
        user2.setPassword("qwerty");
        listaUsuarios.add(user1);
        listaUsuarios.add(user2);

        btnLogin=(Button)findViewById(R.id.btnStart);
        //Capturando cajitas
        txtUserName = (EditText)findViewById(R.id.txtUserName);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                User userCurrent = User.findUserByUsername(listaUsuarios, txtUserName.getText().toString());
                if(userCurrent.isValid(txtPassword.getText().toString())){
                    Toast.makeText(LoginActivity.this,"Bienvenido", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
