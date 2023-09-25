package day5_homework1.core.concretes;

import day5_homework1.core.abstracts.RegistrationService;
import day5_homework1.jGoogleLogIn.JGoogleSignInManager;

public class JGoogleSignInManagerAdapter implements RegistrationService {

	@Override
	public void register(String message) {
		JGoogleSignInManager signInManager = new JGoogleSignInManager();
		signInManager.register(message);
		
	}

	@Override
	public void login(String message) {
		JGoogleSignInManager signInManager = new JGoogleSignInManager();
		signInManager.login(message);
	}

}
