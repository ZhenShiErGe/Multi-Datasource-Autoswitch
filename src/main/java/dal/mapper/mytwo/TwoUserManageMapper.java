package dal.mapper.mytwo;

import dal.dataobject.mytwo.User;
import org.apache.ibatis.annotations.Param;

public interface TwoUserManageMapper {
    User getUserById(@Param("id") int id);
}
