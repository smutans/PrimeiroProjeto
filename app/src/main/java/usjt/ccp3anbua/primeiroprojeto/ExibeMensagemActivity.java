package usjt.ccp3anbua.primeiroprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeMensagemActivity extends AppCompatActivity {

    private TextView mostraMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);
        this.mostraMensagem = this.findViewById(R.id.mostraMensagem);
        Intent origemIntent = getIntent();
        String mensagem = origemIntent.getStringExtra("msg").toUpperCase();
        mostraMensagem.setText(mensagem);

    }
}
