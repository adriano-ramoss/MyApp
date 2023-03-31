package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    //Declarando variável global que irá representar o xml no java
    MaterialToolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idToolBar = findViewById(R.id.ToolBar);

        //Criando clique no menu de navegação
        idToolBasr.etNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei No Menu hamburguer", Toast.LENGTH_SHORT).show();

            }
        });
        //Criando  clique no itens de menu
        idToolBar.setOnMenuItemClickListener();
    }
}