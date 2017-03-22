package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aras on 2017-03-10.
 */
@Entity
@Getter
@Setter
@Table(name = "ACTOR")
public class Actor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    @JoinColumn(name = "MOVIE_ID", referencedColumnName = "ID")
    @ManyToOne
    private Movie movieId;
}
