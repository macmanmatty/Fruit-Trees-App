package com.chillinghours.User;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
}
