package local.repositories;

import local.entities.Meeting;

public class MeetingDAO extends DAO<Meeting>{


    MeetingDAO(){
        super(Meeting.class)
    }
}
