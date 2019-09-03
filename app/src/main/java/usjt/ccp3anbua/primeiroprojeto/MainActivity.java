package usjt.ccp3anbua.primeiroprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mensagemEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensagemEditText = findViewById(R.id.mensagemEditText);
    }

   public void enviarMensagem (View v){
        String mensagem = mensagemEditText.getEditableText().toString();

        Intent intent = new Intent (this, ExibeMensagemActivity.class);
        intent.putExtra("msg", mensagem);
        startActivity(intent);


   }

}
