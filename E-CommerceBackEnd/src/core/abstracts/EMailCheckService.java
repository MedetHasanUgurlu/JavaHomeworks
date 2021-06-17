package core.abstracts;

import entities.concretes.User;

public interface EMailCheckService {

	boolean emailCheckRegex(User user);
	void sentMail(User user);
}
