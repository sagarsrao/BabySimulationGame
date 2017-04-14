package bluetoothchat.acadgild.com.bluetoothchat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by DivyaVipin on 4/10/2017.
 */

public class GameView extends SurfaceView implements Runnable, View.OnTouchListener {

    private Paint paint;
    private Canvas canvas;
    volatile boolean playing;
    private Thread gameThread = null;
    private SurfaceHolder surfaceHolder;
    private Rocket[] rocket;
    private Building[] building;
    private Star[] stars;
    private Moon moon;
    private Boom boom;
    private int rocketCount=10;
    private int buildingCount=20;
    private int starCount=10;
    public GameView(Context context,int screenX,int screenY) {
        super(context);
        rocket=new Rocket[rocketCount];

        stars=new Star[starCount];
        moon=new Moon(context,screenX,screenY);
        boom=new Boom(context,screenX,screenY);
        building=new Building[buildingCount];
        surfaceHolder = getHolder();
        paint = new Paint();
        for(int i=0; i<rocketCount; i++){
            rocket[i] = new Rocket(context, screenX, screenY);

        }
        for(int i=0; i<starCount; i++){
            stars[i] = new Star(context, screenX, screenY);

        }
        for(int i=0; i<buildingCount; i++){
            building[i] = new Building(context, screenX, screenY);

        }
        //moon=new Moon(context,screenX,screenY);

    }

    @Override
    public void run() {
        while(playing) {
            update();
            draw();
            control();
        }

    }
    public void update()
    {
        for(int i=0; i<rocketCount; i++){
        rocket[i].moveRocket();
    }
    }
    public void draw()
    {
        if (surfaceHolder.getSurface().isValid()) {
        canvas = surfaceHolder.lockCanvas();
        canvas.drawColor(Color.CYAN);

            for(int i=0; i<rocketCount; i++) {
                canvas.drawBitmap(rocket[i].getBitmap(), rocket[i].getX(), rocket[i].getY(), paint);
            }
            for(int i=0; i<buildingCount; i++) {
                canvas.drawBitmap(building[i].getBitmap(), building[i].getX(), building[i].getY(), paint);
            }
            for(int i=0; i<starCount; i++) {
                canvas.drawBitmap(stars[i].getBitmap(), stars[i].getX(), stars[i].getY(), paint);
            }
            canvas.drawBitmap(moon.getBitmap(),moon.getX(),moon.getY(), paint);

        surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }
    public void control()
    {
        try {
            gameThread.sleep(17);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
    }
    public void resume() {
        //when the game is resumed
        //starting the thread again
playing=true;
        gameThread = new Thread(this);
        gameThread.start();
    }
    public void pause() {
        //when the game is paused
        //setting the variable to false
playing=false;
        try {
            //stopping the thread
            gameThread.join();
        } catch (InterruptedException e) {
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);
        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
             float x=event.getX();
                float y=event.getY();
                new Boom(getContext(),x,y);
                canvas.drawBitmap(boom.getBitmap(),boom.getX1(),boom.getY1(), paint);
                break;

            case MotionEvent.ACTION_HOVER_MOVE:
                float x1=event.getX();//get x
                float y1=event.getY();//get y
                //new Boom(getContext(),x1,y1);//boom object
                Rocket rocket= new Rocket(getContext(),x1,y1);//creare the rocket object
                rocket.moveRocket();//Its the rocking moving method
                /*
                * To-Do
                * Do booming for the image here and use any ringtone for the image boomed
                * */



            default:
                break;
        }
        return true;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
