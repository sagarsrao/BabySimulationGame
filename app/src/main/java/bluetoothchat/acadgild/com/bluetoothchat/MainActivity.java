package bluetoothchat.acadgild.com.bluetoothchat;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {

    private GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//Getting display object
        Display display = getWindowManager().getDefaultDisplay();
        //Getting the screen resolution into point object
        Point size = new Point();
        display.getSize(size);
        gameView=new GameView(this,size.x,size.y);
        setContentView(gameView);




    }
    protected void onPause() {
        super.onPause();
        gameView.pause();
        }
protected void onResume() {
        super.onResume();
        gameView.resume();
        }
}
