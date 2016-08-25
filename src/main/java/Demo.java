import dal.dataobject.myone.User;
import dal.mapper.myone.OneUserManageMapper;
import dal.mapper.mytwo.TwoUserManageMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/8/22.
 */
public class Demo {
    public static void main(String [] args){
        //初始化ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applications.xml");

        OneUserManageMapper myoneMapper = applicationContext.getBean(OneUserManageMapper.class);
        TwoUserManageMapper mytwoMapper = applicationContext.getBean(TwoUserManageMapper.class);

        System.out.println(myoneMapper.createUser(new User("1","1")));
        System.out.println(mytwoMapper.getUserById(8));

    }
}

