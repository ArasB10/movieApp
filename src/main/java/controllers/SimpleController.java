package controllers;
import DAO.AwardDAO;
import DAO.MovieDAO;
import entities.Award;
import entities.Movie;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.Stateful;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aras on 2017-03-07.
 */

@Named
@RequestScoped
public class SimpleController{

    @Inject
    private MovieDAO movieDAO;

    @Inject
    private AwardDAO awardDAO;

    @Getter
    private Movie movie = new Movie();

    @Getter
    @Setter
    private String awards;

    public List<Movie> getMovies() {
        return movieDAO.getMovies();
    }

    private void handleAwards() {

        List<String> list = new ArrayList<String>(Arrays.asList(awards.split(", ")));
        movie.setAwardList(awardDAO.getAwards());
        List<Award> newAwardList = new ArrayList<Award>();

        for (int i = 0; i < list.size(); i++) {
            for(int j=0; j<movie.getAwardList().size(); j++){
                if(list.get(i).equals(movie.getAwardList().get(j).getName())){
                    System.out.println();
                    newAwardList.add(movie.getAwardList().get(j));
                }
            }
        }
        movie.setAwardList(newAwardList);
    }

    @Transactional
    public void createMovie(){
        handleAwards();
        movie.setOptLockVersion(1);
        movieDAO.create(movie);
    }
}