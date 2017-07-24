package helper;

import model.PasswordEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by davidprince on 7/24/17.
 */
public class PasswordsPersistent {
    public void main(){
        Session session = SessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        String[] passwordArray = TxtToArray();

        for(int i=0; i < passwordArray.length; i++){

            String password = passwordArray[i];

            PasswordEntity passEntity = new PasswordEntity(password);

                    session.save(passEntity);

            if (i % 20 == 0) {

                session.flush();

                session.clear();

            }

        }
    }
}
