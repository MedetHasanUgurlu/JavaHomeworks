package core.concretes;

import core.abstracts.LoggerService;
import jLogger.CodeFromNet;

public class LoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		CodeFromNet codeFromNet = new CodeFromNet();
		codeFromNet.log(message);
		
		
		
	}

}
