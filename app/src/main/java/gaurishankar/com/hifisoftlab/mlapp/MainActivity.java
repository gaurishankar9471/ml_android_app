package gaurishankar.com.hifisoftlab.mlapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mTextRecBtn, mFaceBtn, mBarCodeBtn, mImageLabelBtn, mObjectDetectBtn, mLandmarkDetectBtn, mLangIdentificationBtn, mTranslationBtn, mSmartReplyBtn, mAutoModelBtn, mCustomModelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextRecBtn = findViewById(R.id.text_rec_btn);
        mFaceBtn = findViewById(R.id.face_detection_btn);
        mBarCodeBtn = findViewById(R.id.bar_code_scan_btn);
        mImageLabelBtn = findViewById(R.id.image_labeling_btn);
        mObjectDetectBtn = findViewById(R.id.object_detection_btn);
        mLandmarkDetectBtn = findViewById(R.id.landmark_rec_btn);
        mLangIdentificationBtn = findViewById(R.id.language_identification_btn);
        mTranslationBtn = findViewById(R.id.translation_btn);
        mSmartReplyBtn = findViewById(R.id.smart_reply_btn);
        mAutoModelBtn = findViewById(R.id.auto_model_in_btn);
        mCustomModelBtn = findViewById(R.id.custom_model_in_btn);



        mTextRecBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecognizeText.class);
                startActivity(intent);
            }
        });

        mFaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RecognizeFace.class);
                startActivity(intent);
            }
        });
        mBarCodeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BarCodeScanning.class);
                startActivity(intent);
            }
        });
        mImageLabelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ImageLabeling.class);
                startActivity(intent);
            }
        });
        mObjectDetectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ObjectDetectionTracking.class);
                startActivity(intent);
            }
        });
        mLandmarkDetectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RecognizeLandmark.class);
                startActivity(intent);
            }
        });
        mLangIdentificationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LanguageIdentification.class);
                startActivity(intent);
            }
        });
        mTranslationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Translation.class);
                startActivity(intent);
            }
        });
        mSmartReplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SmartReply.class);
                startActivity(intent);
            }
        });
        mAutoModelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AutoModelInference.class);
                startActivity(intent);
            }
        });
        mCustomModelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CustomModelInference.class);
                startActivity(intent);
            }
        });
    }
}
