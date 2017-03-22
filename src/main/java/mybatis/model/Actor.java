package mybatis.model;

public class Actor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ACTOR.ID
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ACTOR.FIRST_NAME
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ACTOR.LAST_NAME
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ACTOR.MOVIE_ID
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    private Integer movieId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ACTOR.ID
     *
     * @return the value of PUBLIC.ACTOR.ID
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ACTOR.ID
     *
     * @param id the value for PUBLIC.ACTOR.ID
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ACTOR.FIRST_NAME
     *
     * @return the value of PUBLIC.ACTOR.FIRST_NAME
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ACTOR.FIRST_NAME
     *
     * @param firstName the value for PUBLIC.ACTOR.FIRST_NAME
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ACTOR.LAST_NAME
     *
     * @return the value of PUBLIC.ACTOR.LAST_NAME
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ACTOR.LAST_NAME
     *
     * @param lastName the value for PUBLIC.ACTOR.LAST_NAME
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ACTOR.MOVIE_ID
     *
     * @return the value of PUBLIC.ACTOR.MOVIE_ID
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    public Integer getMovieId() {
        return movieId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ACTOR.MOVIE_ID
     *
     * @param movieId the value for PUBLIC.ACTOR.MOVIE_ID
     *
     * @mbg.generated Mon Mar 20 21:59:27 EET 2017
     */
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}