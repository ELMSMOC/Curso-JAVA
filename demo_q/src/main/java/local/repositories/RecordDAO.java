package local.repositories;

import local.entities.Record;

public class RecordDAO extends AbstractDAO<Record> {

    public RecordDAO(Class<Record> entityClass) {
        super(Record.class);
    }

}
