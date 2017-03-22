package DAO;

import entities.Movie;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aras on 2017-03-15.
 */
@Stateless
public class MovieDAO  {

    @PersistenceContext(unitName = "MoviesDB")
    private EntityManager em;

    public void create(Movie movie) {
        em.persist(movie);
    }

    public List<Movie> getMovies() {

        CriteriaQuery<Movie> cq = em.getCriteriaBuilder().createQuery(Movie.class);
        cq.select(cq.from(Movie.class));
        return em.createQuery(cq).getResultList();
    }
}
