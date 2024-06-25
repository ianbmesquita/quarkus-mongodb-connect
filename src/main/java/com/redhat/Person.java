package com.redhat;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection="people")
public class Person {
    public ObjectId id;
    public String name;
    public int age;
}
