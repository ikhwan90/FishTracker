package brain_focused.com.fishtracker.main;


import android.view.View;

/**
 * Define the contract between the view {@link MainActivity} and
 * the Presenter {@link MainPresenter}
 */
public interface MainContract {
    interface MvpView{
        void showSignInScreen();

        void showSignUpScreen();

    }

    interface Presenter{
        void handleSignInButtonClick(View view);

        void handleSignUpButtonClick(View view);

    }
}
