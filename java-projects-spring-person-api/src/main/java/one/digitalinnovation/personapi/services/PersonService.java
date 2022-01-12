package one.digitalinnovation.personapi.services;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.mapper.PersonMapper;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.exceptions.PersonNotFoundException;
import one.digitalinnovation.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {
    private PersonRepository personRepository;
    private final PersonMapper personMapper;

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        var personToSave = this.personMapper.toModel(personDTO);
        var savedPerson = this.personRepository.save(personToSave);
        return createMessageResponse(savedPerson, "Created person with ID ");
    }

    public MessageResponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        verifyIfExists(id);
        var personToSave = this.personMapper.toModel(personDTO);

        var updatedPerson = this.personRepository.save(personToSave);
        return createMessageResponse(updatedPerson, "Updated person with ID ");
    }

    public List<PersonDTO> listAll() {
        var allPeople = this.personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        var person = verifyIfExists(id);
        return personMapper.toDTO(person);
    }

    public void deleteById(Long id) throws PersonNotFoundException {
        var person = verifyIfExists(id);
        personRepository.deleteById(id);
    }

    private Person verifyIfExists(Long id) throws PersonNotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(Person person, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + person.getId())
                .build();
    }
}