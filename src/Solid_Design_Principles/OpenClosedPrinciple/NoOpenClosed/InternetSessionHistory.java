package Solid_Design_Principles.OpenClosedPrinciple.NoOpenClosed;

import java.time.LocalDateTime;
import java.util.*;

public class InternetSessionHistory {

    public static class InternetSession {
        private LocalDateTime begin;
        private Long subscriberId;
        private Long dateUsed;

        public InternetSession(LocalDateTime begin, Long subscriberId, Long dateUsed) {
            this.begin = begin;
            this.subscriberId = subscriberId;
            this.dateUsed = dateUsed;
        }

        public LocalDateTime getBegin() {
            return begin;
        }

        public void setBegin(LocalDateTime begin) {
            this.begin = begin;
        }

        public Long getSubscriberId() {
            return subscriberId;
        }

        public void setSubscriberId(Long subscriberId) {
            this.subscriberId = subscriberId;
        }

        public Long getDateUsed() {
            return dateUsed;
        }

        public void setDateUsed(Long dateUsed) {
            this.dateUsed = dateUsed;
        }
    }

    private static final Map<Long, List<InternetSession>> SESSIONS = new HashMap<>();

    public synchronized static List<InternetSession> getCurrentSessions(Long subscriberId) {
        if(!SESSIONS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return SESSIONS.get(subscriberId);
    }

    public synchronized static void addSession(Long subscriberId, LocalDateTime begin, long dataUsed) {
        List<InternetSession> sessions;
        if(!SESSIONS.containsKey(subscriberId)) {
            sessions = new LinkedList<>();
            SESSIONS.put(subscriberId, sessions);
        } else {
            sessions = SESSIONS.get(subscriberId);
        }
        sessions.add(new InternetSession(begin, subscriberId, dataUsed));
    }



}
