package bluetoothchat.acadgild.com.bluetoothchat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by DivyaVipin on 4/10/2017.
 */

public class Boom {
    private int maxX;
float x1;

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    float y1;
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

    private int minX;
    private int maxY;
    private int minY;
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

    private int x;
    private int y;
    private Bitmap bitmap;
    Boom(Context context,int screenX,int screenY)
    {
        x=20;
        y=500;

        bitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.fireworks);
    }
    Boom(Context context,float  x1,float  y1)
    {
        this.x1=x1;
        this.y1=y1;
        bitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.fireworks);
    }

}
