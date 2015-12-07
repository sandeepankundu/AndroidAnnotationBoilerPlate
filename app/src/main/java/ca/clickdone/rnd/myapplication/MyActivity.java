package ca.clickdone.rnd.myapplication;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by sandeepankundu on 15-12-06.
 */
@EActivity(R.layout.annotaionfirst)
public class MyActivity extends Activity {

    @ViewById(R.id.myInput)
    EditText myInput;

    @ViewById(R.id.myTextView)
    TextView textView;

    @Click
    void myButton() {
        String name = myInput.getText().toString();
        textView.setText("Hello "+name);
    }
}
