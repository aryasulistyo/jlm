package my.jlm;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class Splash extends Activity{  
   private static int progress = 0;
   private int status = 0;
   ProgressBar progressBar;
   Handler handler = new Handler();
   
   public void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_splash);
      progressBar = (ProgressBar) findViewById(R.id.Progress); 
      new Thread(new Runnable() {
    
         public void run() {
            // TODO Auto-generated method stub
            while(status < 100){
               status = loading();
               handler.post(new Runnable() {
                                 
                  public void run() {
                     // TODO Auto-generated method stub
                  progressBar.setProgress(status);   
                  }
               });    
            }
            handler.post(new Runnable() {
               
               
               public void run() {
                  // TODO Auto-generated method stub
                  Intent inten = new Intent(Splash.this, MainActivity.class);
                  Splash.this.startActivity(inten);
                  Splash.this.finish();                
               }  
            });
         }  
         
         public int loading(){
            try{
               Thread.sleep(40);
            }catch(InterruptedException ie){
               ie.printStackTrace();
            }
            return ++progress;
         }
      }).start();     
   }
}
