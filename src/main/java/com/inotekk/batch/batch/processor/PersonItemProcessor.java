package com.inotekk.batch.batch.processor;

import com.inotekk.batch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class PersonItemProcessor implements ItemProcessor<Person,Person> {

    private static  final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
    @Override
    public Person process(Person item) throws Exception {
        final String firstname = item.getFirstname().toUpperCase();
        final String lastname = item.getLastname().toUpperCase();

        final Person transformedPerson = new Person(firstname, lastname);

        log.info("Converting (" + item + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }
}
