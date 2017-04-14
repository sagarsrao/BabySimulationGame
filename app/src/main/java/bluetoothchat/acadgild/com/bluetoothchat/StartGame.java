package bluetoothchat.acadgild.com.bluetoothchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by DivyaVipin on 4/10/2017.
 */

public class StartGame  extends AppCompatActivity
{
    Button btnPlay;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay=(Button)findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent play=new Intent(StartGame.this,MainActivity.class);
                startActivity(play);
            }
        });
    }
}
