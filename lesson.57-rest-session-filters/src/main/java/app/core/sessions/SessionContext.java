package app.core.sessions;

import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SessionContext {
	@Autowired
	private ApplicationContext ctx; // to get session beans
	private Map<String, Session> sessionsMap = new ConcurrentHashMap<>(); // thread safe
	private Timer timer = new Timer(); // for removing expired sessions
	@Value("${session.remove.expired.period:20}") // seconds
	private int removeExpiredPeriod; // time between each removal cycle

	// methods
	private boolean isSessionExpired(Session session) {
		return System.currentTimeMillis() - session.getLastAccessed() > session.getMaxInactiveInterval();
	}

}
