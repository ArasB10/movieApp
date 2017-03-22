package entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Aras on 2017-03-10.
 */
@Entity
@Getter
@Setter
@Table(name = "MOVIE")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SCORE")
    private Integer score;

    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    @JoinTable(name = "MOVIE_AWARD", joinColumns = {
            @JoinColumn(name = "MOVIE_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
            @JoinColumn(name = "AWARD_ID", referencedColumnName = "ID")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Award> awardList = new ArrayList<Award>();

    @OneToMany(mappedBy = "movieId")
    private List<Actor> actorList = new ArrayList<Actor>();
}