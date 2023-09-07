package ServicePackage;

import com.jrishmani.JunitTesing.Service.PersonService;
import com.jrishmani.JunitTesing.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;
    private PersonService personService;
    @BeforeEach void setUp(){
        this.personService=new PersonService(this.personRepository);
    }
    @Test void getAllPerson(){
        personService.getAllPerson();
        verify(personRepository).findAll();
    }
}
