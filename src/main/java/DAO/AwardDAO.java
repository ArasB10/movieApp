package DAO;

import entities.Award;
import entities.Movie;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by Aras on 2017-03-15.
 */
@Stateless
public class AwardDAO {

    @PersistenceContext(unitName = "MoviesDB")
    private EntityManager em;

    public List<Award> getAwards(){

        CriteriaQuery<Award> cq = em.getCriteriaBuilder().createQuery(Award.class);
        cq.select(cq.from(Award.class));
        return em.createQuery(cq).getResultList();
    }
}
