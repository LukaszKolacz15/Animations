package pl.akademiakodu.lukaszkolacz.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {






    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.logo);
//        startAnim();
//        startAnimation();
//        startAnima();
//        startAnimat();
        startXmlAnim();

    }
// ------------------------------- animacja z pliku xml ----------------------------------
    private void startXmlAnim(){
        Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.myanim);
        logo.startAnimation(myAnim);
    }

//        <><><><><><><><><><><><> PODEJSCIE DO ANIMACJI W KODZIE <><><><><><><><><><><><>
// ------------------------------- Przesuniecie ------------------------------------------
//    private void startAnimat(){
//        Animation translate = new TranslateAnimation(0, 150, 0f, 0f);
//        translate.setDuration(3000);
//        translate.setFillAfter(true);
//
//        logo.startAnimation(translate);
//    }
//
// ------------------------------- Obrot ------------------------------------------
//    private void startAnima(){
//        Animation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        rotate.setDuration(3000);
//        rotate.setRepeatCount(5);
//        rotate.setFillAfter(true);
//
//        logo.startAnimation(rotate);
//    }
// ------------------------------- Skalowanie ------------------------------------------
//    private void startAnimation(){
//        Animation scale = new ScaleAnimation(1f, 1.5f, 1f,1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        scale.setDuration(4000);
//        scale.setFillAfter(true);
//
//
//
//        logo.startAnimation(scale);
//    }
// ------------------------------- animacja przezroczystosci ------------------------------------------
//    private void startAnim() {
//
//        final Animation in = new AlphaAnimation(1f, 0f);
//        in.setDuration(1500); //czas trwania
//        in.setRepeatCount(5); //ilosc powtorzen
//
//        final Animation out = new AlphaAnimation(0f, 1f);
//        out.setDuration(1500); //czas trwania
//
//        out.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//                Toast.makeText(MainActivity.this, "Start animacji", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                logo.startAnimation(in);
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//
//        in.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                logo.startAnimation(out);
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//
//        logo.startAnimation(in);
//        logo.startAnimation(out);
//    }
//        <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>

}
