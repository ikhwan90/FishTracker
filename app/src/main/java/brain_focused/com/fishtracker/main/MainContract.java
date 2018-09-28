package brain_focused.com.fishtracker.main;


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
        void handleSignInButtonClick();

        void handleSignUpButtonClick();

    }
}
