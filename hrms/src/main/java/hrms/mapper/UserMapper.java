package hrms.mapper;

import hrms.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    //推荐使用#{}取值，不要用${}取值，因为存在注入的风险
    @Select("select * from hrms_user where username=#{name}")
    User selectUserByName(User user);
}
