package org.myyoung.cxzc.springboottransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    PersonRepository personRepository;

    @Transactional(rollbackOn = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);
        if (person.getName().equals("程序职场")) {
            throw new IllegalArgumentException("程序职场 已存在，数据将回滚");
        }
        return p;
    }

    @Transactional(dontRollbackOn= {IllegalArgumentException.class})
    @Override
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);
        if (person.getName().equals("程序职场")) {
            throw new IllegalArgumentException("程序职场 已存在，但数据不会回滚");
        }
        return p;
    }
}
