package net.jaggerwang.sbip.adapter.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import net.jaggerwang.sbip.entity.UserStatEntity;
import net.jaggerwang.sbip.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserStatResolver extends AbstractResolver implements GraphQLResolver<UserStatEntity> {
    public UserEntity user(UserStatEntity userStatEntity) {
        return userUsecase.info(userStatEntity.getUserId()).get();
    }
}
