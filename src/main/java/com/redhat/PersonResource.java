package com.redhat;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/people")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {
    @Inject
    PersonRepository personRepository;

    @GET
    public List<Person> getAllPeople() {
        return personRepository.listAll();
    }

    @POST
    public void addPerson(Person person) {
        personRepository.persist(person);
    }
}
