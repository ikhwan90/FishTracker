package brain_focused.com.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
}
