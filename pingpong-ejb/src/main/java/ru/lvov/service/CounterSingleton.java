package ru.lvov.service;

import ru.lvov.model.Counter;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class CounterSingleton {
    @Inject
    private EntityManager em;

    public String ping(){
        Counter c = em.find(Counter.class, 1);
        if(c == null){
            c = new Counter();
            c.setId(1);
            c.setValue(0);
            em.persist(c);
        }
        c.inc();
        return "pong " + c.getValue();
    }
}

