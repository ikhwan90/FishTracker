package brain_focused.com.fishtracker.main;

import android.view.View;

/**
 * Responsible for handling action from
 * the view and updating the UI as required
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        mView = view;
    }


    //// Presenter methods ////
    @Override
    public void handleSignInButtonClick(View view) {
        mView.showSignInScreen();

    }

    @Override
    public void handleSignUpButtonClick(View view) {
        mView.showSignUpScreen();

    }
}
