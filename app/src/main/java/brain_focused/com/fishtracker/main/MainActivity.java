package brain_focused.com.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import brain_focused.com.fishtracker.R;

/**
 * Displays the MainScreen
 */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
    }


    //// MvpView methods ////
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to Sign in screen !", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to Sign up screen !", Toast.LENGTH_SHORT).show();

    }
}
