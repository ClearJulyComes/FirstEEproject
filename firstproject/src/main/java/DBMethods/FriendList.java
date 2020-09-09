package DBMethods;

import Entities.Friends;
import Entities.UserInfo;
import org.apache.logging.log4j.LogManager;

import javax.persistence.*;
import java.util.List;

public class FriendList {
    private static final String PERSISTENT_UNIT_NAME = "UnitName";
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(AddFriend.class);
    private String userLogin;
    public FriendList(String userLogin){
        this.userLogin = userLogin;
    };

    public List<UserInfo> getFriendList(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENT_UNIT_NAME);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        logger.info("addMethod works");
        TypedQuery<UserInfo> query = entityManager.createQuery("SELECT f.hisFriend FROM Friends f WHERE f.userLogin.userLogin = :userLoginParam", UserInfo.class);
        query.setParameter("userLoginParam", userLogin);
        return query.getResultList();
    }
}
