package nguyen.gesturesdemo;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnGestureListener, OnDoubleTapListener {

    private TextView gestureStatusTV;
    private GestureDetectorCompat gestureDetectorCompat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureStatusTV = (TextView) findViewById(R.id.gestureStatusTV);

        this.gestureDetectorCompat = new GestureDetectorCompat(this, this);
        gestureDetectorCompat.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {

        gestureStatusTV.setText("onSingleTap Confirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {

        gestureStatusTV.setText("onDoubleTap Confirmed");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {

        gestureStatusTV.setText("onDown Confirmed");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        gestureStatusTV.setText("onShowPress Confirmed");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {

        gestureStatusTV.setText("onSingleTapUp Confirmed");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {

        gestureStatusTV.setText("onScroll Confirmed");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        gestureStatusTV.setText("onLongPress Confirmed");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        gestureStatusTV.setText("onFling Confirmed");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetectorCompat.onTouchEvent(event);

        //be sure to call the supreclass implementation
        return super.onTouchEvent(event);
    }
}
