package local.repositories;

import local.entities.Person;

public class PersonDAO extends AbstractDAO<Person> {

    public PersonDAO(Class<Person> entityClass) {
        super(entityClass);
    }

}
