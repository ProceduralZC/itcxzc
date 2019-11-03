package org.myyoung.cxzc.springbootcache;

public interface DemoService {
    public Person save(Person person);
    public void remove(Long id);
    public Person findOne(Long id);
}
