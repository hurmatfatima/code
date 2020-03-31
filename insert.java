package com.example.gt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //instance of dbhelper class
DatabaseHelper myDb;
EditText name,cnic,guardian,address,email,phno,program;
Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instance of dbhelper class
        //this willl call constructor of helper class and in constructor we r creating db and tbls.
        myDb = new DatabaseHelper(this);
        name=findViewById(R.id.txt_name);
        guardian=findViewById(R.id.txt_guardian);
        program=findViewById(R.id.txt_program);
        address=findViewById(R.id.txt_address);
        phno=findViewById(R.id.txt_phno);
        email=findViewById(R.id.txt_email);
        cnic=findViewById(R.id.txt_cnic);
        register=findViewById(R.id.btn_register);
        AddData();


        }
    public  void AddData() {
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//whenever btn is clicked insertdata method is called through dbhelper clas instance
                //and pass user's inserted data in edittxt as param
                //and cnverting it in string as all data types of param's of insertdata are of string type
                //sequnces of param must be same in this clss n alse in helper cls
                boolean isInserted = myDb.insertData(name.getText().toString(),
                        guardian.getText().toString(),
                        cnic.getText().toString(),program.getText().toString(),address.getText().toString(),email.getText().toString(),phno.getText().toString());
                //if true was retured by helper clss
                if(isInserted == true)
                    Toast.makeText(MainActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
            }
        });
    }
    }

