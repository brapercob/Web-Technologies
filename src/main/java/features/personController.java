package features;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class personController {

  /*  public personController(personRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public Person addPerson(@RequestBody Person request) {
        Person person = personRepository.insertPerson(request.getName());
        return new Person(person.getId(), Person.getName());
    }

    @GetMapping("/{personId}")
    public Person getPerson(@PathVariable("personId") UUID personId) {
        Person person = personRepository.findById(personId);
        return new Person(person.getId(), person.getName());
    }*/

}


