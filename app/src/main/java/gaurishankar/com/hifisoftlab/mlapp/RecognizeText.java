package gaurishankar.com.hifisoftlab.mlapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.ml.vision.FirebaseVision;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class RecognizeText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recognize_text);

        try {
            URL url = new URL("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
            Bitmap bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            FirebaseVisionImage image = FirebaseVisionImage.fromBitmap(bitmap);

            FirebaseVisionTextRecognizer detector = FirebaseVision.getInstance()
                    .getCloudTextRecognizer();
// Or, to change the default settings:
//   FirebaseVisionTextRecognizer detector = FirebaseVision.getInstance()
//          .getCloudTextRecognizer(options);

// Or, to provide language hints to assist with language detection:
// See https://cloud.google.com/vision/docs/languages for supported languages
            FirebaseVisionCloudTextRecognizerOptions options = new FirebaseVisionCloudTextRecognizerOptions.Builder()
                    .setLanguageHints(Arrays.asList("en", "hi"))
                    .build();

            Task<FirebaseVisionText> result =
                    detector.processImage(image)
                            .addOnSuccessListener(new OnSuccessListener<FirebaseVisionText>() {
                                @Override
                                public void onSuccess(FirebaseVisionText firebaseVisionText) {
                                    // Task completed successfully
                                    // ...
                                    Toast.makeText(getApplicationContext(),"Completed",Toast.LENGTH_LONG).show();
                                }
                            })
                            .addOnFailureListener(
                                    new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            // Task failed with an exception
                                            // ...
                                            Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_LONG).show();
                                        }
                                    });

        } catch(IOException e) {
            System.out.println(e);
        }


    }
}
