package com.karen.myapplication2;

import static com.karen.myapplication2.R.id.txt_name;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_codigo,et_descripcion,et_precio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_codigo = (EditText) findViewById(R.id.txt_name);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Item1) {
            Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.Item2) {
            Toast.makeText(this, "hola2", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.Item3) {
            Toast.makeText(this, "hola3", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
    public  void registro(View view){
    AdminSQLitleOpenHelper admin=new AdminSQLitleOpenHelper(this,"administracion",null,1);
        SQLiteDatabase baseDeDatos = admin.getWritableDatabase();




    String codigo= et_codigo.getText().toString();
    String descripcion= et_codigo.getText().toString();
    String precio= et_codigo.getText().toString();

    if(!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()) {
        ContentValues registro = new ContentValues();
        registro.put("codigo",codigo);
        registro.put("descripcion",descripcion);
        registro.put("precio",precio);
        baseDeDatos.insert("articulos",null,registro);
        baseDeDatos.close();
        et_codigo.setText("");
        et_descripcion.setText("");
        et_precio.setText("");
        Toast.makeText(this,"resgistrar datos",Toast.LENGTH_SHORT).show();
    }
        Toast.makeText(this,"LLENA TOODS LOS DATOS datos",Toast.LENGTH_SHORT).show();
    }
}