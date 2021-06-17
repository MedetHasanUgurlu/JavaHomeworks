package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.EMailCheckService;
import entities.concretes.User;

public class EMailCheckManager implements EMailCheckService {

	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	@Override
	public boolean emailCheckRegex(User user) {
		
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(user.geteMail());
		
		return matcher.matches();
	}

	@Override
	public void sentMail(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.geteMail()+" mail was sendedç");
	}

}
