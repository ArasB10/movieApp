package controllers;


import DAO.MovieDAO;
import entities.Movie;
import lombok.Getter;
import lombok.Setter;
import mybatis.doa.ActorMapper;
import mybatis.model.Actor;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;


/**
 * Created by Aras on 2017-03-21.
 */
@Named
@RequestScoped
public class SimpleControllerMyBatis {
    @Getter
    private Actor actor = new Actor();
    @Getter
    @Setter
    private String movieTitle = new String();
    @Inject
    private ActorMapper actorMapper;
    @Inject
    private MovieDAO movieDAO;

    @Transactional
    public void createActor() {
        List<Movie> list = movieDAO.getMovies();
        for(int i=0; i<list.size();i++){
            if(list.get(i).getName().equals(movieTitle))
                actor.setMovieId(list.get(i).getId());
        }
        actorMapper.insert(actor);
    }
}
