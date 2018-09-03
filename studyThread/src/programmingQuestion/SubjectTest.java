package programmingQuestion;

import javax.security.auth.Subject;

public class SubjectTest {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(new SubjectRunnable(1,o)).start();
        new Thread(new SubjectRunnable(2,o)).start();
        new Thread(new SubjectRunnable(3,o)).start();

    }
}
