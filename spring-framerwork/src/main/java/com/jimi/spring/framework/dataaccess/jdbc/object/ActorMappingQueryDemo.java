package com.jimi.spring.framework.dataaccess.jdbc.object;

import com.jimi.spring.framework.dataaccess.jdbc.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 16:07
 */
public class ActorMappingQueryDemo extends ActorMappingQuery {
    private ActorMappingQuery actorMappingQuery;

    public ActorMappingQueryDemo(DataSource ds) {
        super(ds);
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.actorMappingQuery = new ActorMappingQuery(dataSource);
    }
    public Actor getActor(Long id) {
        return actorMappingQuery.findObject(id);
    }

    public List<Actor> searchForActors(int age, String namePattern) {
        List<Actor> actors = actorMappingQuery.execute(age, namePattern);
        return actors;
    }
}
