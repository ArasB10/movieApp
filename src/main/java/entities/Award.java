package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aras on 2017-03-10.
 */
@Entity
@Getter
@Setter
@Table(name = "AWARD")
@NamedQueries({
        @NamedQuery(name = "Award.findByName", query = "SELECT a FROM Award a WHERE a.name LIKE :Name")
})
public class Award implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    @ManyToMany(mappedBy = "awardList")
    private List<Movie> movieList = new ArrayList<Movie>();
}