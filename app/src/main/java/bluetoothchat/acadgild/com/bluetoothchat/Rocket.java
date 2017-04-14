package bluetoothchat.acadgild.com.bluetoothchat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

/**
 * Created by DivyaVipin on 4/10/2017.
 */

public class Rocket {
    private float maxX;
    private int minX;
    private float maxY;
    private int minY;
    private int x;
    private int y;
    private int speed=0;
    private Bitmap bitmap;



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    Rocket(Context context, float screenX, float screenY)
    {
        bitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.rocket);

        maxX=screenX;
        maxY=screenY;
        minX=0;
        minY=0;
        //generating a random coordinate to add enemy
        Random generator = new Random();
        speed = generator.nextInt(6) + 50;
       // x = generator.nextInt(maxX) - bitmap.getHeight();
       // y = generator.nextInt(6);
        x = generator.nextInt(900);
        speed=generator.nextInt(6)+50;
        y = generator.nextInt(800);

    }
    public void moveRocket()
    {
        y--;
        speed=y+250;

    }

    //Below is the code that you can use for touch events
    /*
    * @Override
public boolean onTouchEvent(MotionEvent event) {
    int x = (int)event.getX(); //get the position of x
    int y = (int)event.getY();//get the position  of y
    switch (event.getAction()) {
        case MotionEvent.ACTION_DOWN:

//CREATE AN OBJECT OF BOOM CLASS  AND CLASS THE PARAMETRIZED CONSTRUCTOR OF BOOM OBJECT.
0
8

        case MotionEvent.ACTION_MOVE:
        case MotionEvent.ACTION_UP:
    }
return false;
}
    * */



}
