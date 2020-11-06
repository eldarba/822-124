package app.core.sessions;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	@PostConstruct
	private void init() {
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("removing expired sessions");
				System.out.println(sessionsMap.keySet().toString());
				for (Session session : sessionsMap.values()) {
					if (isSessionExpired(session)) {
						invalidate(session);
					}
				}
				System.out.println(sessionsMap.keySet().toString());
				System.out.println("=================");

			}
		};

		timer.schedule(task, 3000, TimeUnit.SECONDS.toMillis(removeExpiredPeriod));
	}

	// stop the thread
	@PreDestroy
	private void destroy() {
		timer.cancel();
		System.out.println("removing expired coupons thread stopped");
	}

	public Session createSession() {
		Session session = ctx.getBean(Session.class);
		sessionsMap.put(session.token, session);
		return session;
	}

	public void invalidate(Session session) {
		sessionsMap.remove(session.token);
	}

	public Session getSession(String token) {
		Session session = sessionsMap.get(token);
		if (session != null) {
			if (!isSessionExpired(session)) {
				session.resetLastAccess();
				return session;
			} else {
				invalidate(session);
				return null;
			}
		} else {
			return null;
		}
	}

}
