package com.example.app;

//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.view.MotionEvent;
//import android.view.View;
//
//import androidx.annotation.NonNull;
//
//
//public class DrawLine extends View {
//    private final Paint mPaint;
//    private float startX, startY, endX, endY;
//
//
//
//    public void changeLne(float x, float y){
//        startX = x;
//        startY = y;
//    }
//
//    public DrawLine(Context context) {
//        super(context);
//        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setColor(Color.RED);
//        mPaint.setStrokeWidth(10);
//
//
//    }
//
//    @Override protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        canvas.drawLine(startX, startY, endX, endY, mPaint);
//    }
//
//    @SuppressLint("ClickableViewAccessibility")
//    @Override
//    public boolean onTouchEvent(@NonNull MotionEvent event) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//
//                startX = event.getX();
//                startY = event.getY();
//
//                endX = event.getX();
//                endY = event.getY();
//                invalidate();
//                break;
//            case MotionEvent.ACTION_MOVE:
//                endX = event.getX();
//                endY = event.getY();
//
//                changeLne(startX, startY);
//
//
//
//                invalidate();
//                break;
//            case MotionEvent.ACTION_UP:
//                startX = event.getX();
//                startY = event.getY();
//                invalidate();
//                break;
//        }
//        return true;
//    }
//}



//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.util.AttributeSet;
//import android.view.MotionEvent;
//import android.view.View;
//import java.util.ArrayList;
//
//class Line {
//    float startX, startY, stopX, stopY;
//
//    public Line(float startX, float startY, float stopX, float stopY) {
//        this.startX = startX;
//        this.startY = startY;
//        this.stopX = stopX;
//        this.stopY = stopY;
//    }
//    public Line(float startX, float startY) { // for convenience
//        this(startX, startY, startX, startY);
//    }
//}
//
//class DrawView extends View {
//    private static AttributeSet attrs;
//    Paint paint = new Paint();
//    ArrayList<Line> lines = new ArrayList<Line>();
//
//    public DrawView(Context context) {
//        super(context, attrs);
//
//        paint.setAntiAlias(true);
//        paint.setStrokeWidth(6f);
//        paint.setColor(Color.BLACK);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeJoin(Paint.Join.ROUND);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        for (Line l : lines) {
//            canvas.drawLine(l.startX, l.startY, l.stopX, l.stopY, paint);
//        }
//    }
//    float joinX, joinY = 0;
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//
//        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//            if (joinX <= 0 || joinY <= 0) lines.add(new Line(event.getX(), event.getY()));
//            else lines.add(new Line(joinX, joinY));
//            return true;
//        }
//        else if ((event.getAction() == MotionEvent.ACTION_MOVE) &&
//                lines.size() > 0) {
//            Line current = lines.get(lines.size() - 1);
//            current.stopX = event.getX();
//            current.stopY = event.getY();
//            invalidate();
//            return true;
//        }
//        else if ((event.getAction() == MotionEvent.ACTION_UP) &&
//                lines.size() > 0) {
//            Line current = lines.get(lines.size() - 1);
//            current.stopX = event.getX();
//            current.stopY = event.getY();
//            joinX = event.getX();
//            joinY = event.getY();
//            invalidate();
//            return true;
//        }
//
//            return false;
//
//    }
//}


//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.graphics.Path;
//import android.util.AttributeSet;
//import android.view.MotionEvent;
//import android.view.View;
//
//class DrawLine  extends View {
//
//    private Paint mPaint;
//    private Path mPath;
//
//    public DrawLine(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        mPaint = new Paint();
//        mPaint.setColor(Color.RED);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeJoin(Paint.Join.ROUND);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        mPaint.setStrokeWidth(10);
//        mPath = new Path();
//    }
//
//    public DrawLine(Context context) {
//        super(context);
//    }
//
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        canvas.drawPath(mPath, mPaint);
//        super.onDraw(canvas);
//    }
//
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//        switch (event.getAction()){
//
//            case MotionEvent.ACTION_DOWN:
//                mPath.moveTo(event.getX(), event.getY());
//                break;
//
//            case MotionEvent.ACTION_MOVE:
//                mPath.lineTo(event.getX(), event.getY());
//                invalidate();
//                break;
//
//            case MotionEvent.ACTION_UP:
//                break;
//        }
//
//        return true;
//    }
//}
















//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.util.AttributeSet;
//import android.view.MotionEvent;
//import android.view.View;
//import java.util.ArrayList;
//
//class Line {
//    float startX, startY, stopX, stopY;
//
//    public Line(float startX, float startY, float stopX, float stopY) {
//        this.startX = startX;
//        this.startY = startY;
//        this.stopX = stopX;
//        this.stopY = stopY;
//    }
//    public Line(float startX, float startY) { // for convenience
//        this(startX, startY, startX, startY);
//    }
//}
//
//class DrawView extends View {
//
//    float joinX, joinY = 0;
//    Paint paint = new Paint();
//    ArrayList<Line> lines = new ArrayList<Line>();
//
//    public DrawView(Context context) {
//        super(context);
//
//        paint.setAntiAlias(true);
//        paint.setStrokeWidth(6f);
//        paint.setColor(Color.BLACK);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeJoin(Paint.Join.ROUND);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        for (Line l : lines) {
//            canvas.drawLine(l.startX, l.startY, l.stopX, l.stopY, paint);
//        }
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//            if (joinX <= 0 || joinY <= 0) lines.add(new Line(event.getX(), event.getY()));
//            else lines.add(new Line(joinX, joinY));
//            return true;
//        }
//        else if ((event.getAction() == MotionEvent.ACTION_MOVE) &&
//                lines.size() > 0) {
//            Line current = lines.get(lines.size() - 1);
//            current.stopX = event.getX();
//            current.stopY = event.getY();
//            joinX = event.getX();
//            joinY = event.getY();
//            invalidate();
//            return true;
//        }
////        else if ((event.getAction() == MotionEvent.ACTION_UP) &&
////                lines.size() > 0) {
////            Line current = lines.get(lines.size() - 1);
////            current.stopX = event.getX();
////            current.stopY = event.getY();
////            joinX = event.getX();
////            joinY = event.getY();
////            invalidate();
////            return true;
////        }
//    else {
//            return false;
//        }
//    }
//}







import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

class MyDrawView extends View {
    public Bitmap  mBitmap;
    public Canvas  mCanvas;
    private final Path    mPath;
    private final Paint   mBitmapPaint;
    private final Paint   mPaint;


    public MyDrawView(Context c) {
        super(c);

        mPath = new Path();
        mBitmapPaint = new Paint(Paint.DITHER_FLAG);

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(0xFF000000);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(9);

    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);

        canvas.drawPath(mPath, mPaint);


    }

    private float mX, mY;
    private static final float TOUCH_TOLERANCE = 4;

    private void touch_start(float x, float y) {
        mPath.reset();
        mPath.moveTo(x, y);
        mX = x;
        mY = y;
    }
    private void touch_move(float x, float y) {
        float dx = Math.abs(x - mX);
        float dy = Math.abs(y - mY);
        if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
            mPath.quadTo(mX, mY, (x + mX)/2, (y + mY)/2);
            mX = x;
            mY = y;
        }
    }
    private void touch_up() {

        mPath.reset();
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                touch_start(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                touch_move(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                touch_up();
                invalidate();
                break;
        }
        return true;
    }







}


