package com.ebookfrenzy.nameformater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private Button firstMiddileLastButton, firstLastButton, lastFirstMiddleButton, lastFirstButton;
    private EditText firstNameEditText, middileNameEditText, lastNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstMiddileLastButton=(Button)findViewById(R.id.first_middle_last_button);
        firstLastButton=(Button)findViewById(R.id.first_last_button);
        lastFirstMiddleButton=(Button)findViewById(R.id.last_first_middle_button);
        lastFirstButton=(Button)findViewById(R.id.last_first_button);

        firstNameEditText=(EditText)findViewById(R.id.users_first_name_edit_text);
        middileNameEditText=(EditText)findViewById(R.id.users_middile_name_edit_text);
        lastNameEditText=(EditText)findViewById(R.id.users_last_name_edit_text);
    }

    public void onFirstMiddleLastClick(View view)
    {
        String firstName=String.valueOf(firstNameEditText.getText());
        String middileName=String.valueOf(middileNameEditText.getText());
        String lastName=String.valueOf(lastNameEditText.getText());

        String fML=firstName+" "+middileName+" "+lastName;

        Toast.makeText(this,fML,Toast.LENGTH_LONG).show();
    }

    public void onFirstLastClick(View view)
    {
        String firstName=String.valueOf(firstNameEditText.getText());
        String lastName=String.valueOf(lastNameEditText.getText());

        String fL=firstName+" "+lastName;

        Toast.makeText(this,fL,Toast.LENGTH_LONG).show();

    }

    public void onLastFirstMiddleClick(View view)
    {
        String lastName=String.valueOf(lastNameEditText.getText());
        String firstName=String.valueOf(firstNameEditText.getText());
        String middileName=String.valueOf(middileNameEditText.getText());

        String lFM=lastName+" "+firstName+" "+middileName;

        Toast.makeText(this,lFM,Toast.LENGTH_LONG).show();
    }

    public void onLastFirstClick(View view)
    {
        String lastName=String.valueOf(lastNameEditText.getText());
        String firstName=String.valueOf(firstNameEditText.getText());

        String lF=lastName+" "+firstName;

        Toast.makeText(this,lF,Toast.LENGTH_LONG).show();
    }
}
