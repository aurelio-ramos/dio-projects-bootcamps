package one.digitalinnovation.personapi.services;

import one.digitalinnovation.personapi.dto.mapper.PersonMapper;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.repositories.PersonRepository;
import one.digitalinnovation.personapi.utils.PersonUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @Mock
    private PersonMapper personMapper;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage(){
        var personDTO = PersonUtils.createFakeDTO();
        var expectedSavedPerson = PersonUtils.createFakeEntity();

        when(personMapper.toModel(personDTO)).thenReturn(expectedSavedPerson);
        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        var expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPerson);
        var successMessage = personService.createPerson(personDTO);

        Assertions.assertEquals(expectedSuccessMessage,successMessage);
    }

    private MessageResponseDTO createExpectedMessageResponse(Person expectedSavedPerson) {
        return MessageResponseDTO.builder().message("Created person with ID " + expectedSavedPerson.getId()).build();
    }
}
