package bluetoothchat.acadgild.com.bluetoothchat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

/**
 * Created by DivyaVipin on 4/12/2017.
 */

public class Building {
    private int maxX;
    private int minX;
    private int maxY;

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMinX() {
        return minX;
    }

    public void setMinX(int minX) {
        this.minX = minX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public int getMinY() {
        return minY;
    }

    public void setMinY(int minY) {
        this.minY = minY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    private int minY;
    private int x;
    private int y;
    private Bitmap bitmap;
    Building(Context context, int screenX, int screenY)
    {
        bitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.build);

        maxX=screenX;
        maxY=screenY;
        minX=0;
        minY=0;
        //generating a random coordinate to add enemy
        Random generator = new Random();

        x = generator.nextInt(maxX) - bitmap.getHeight();
        // y = generator.nextInt(6);
       // x = generator.nextInt(10)+300;

        y = 1350;

    }
}
