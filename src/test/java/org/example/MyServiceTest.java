package org.example;

import org.testng.annotations.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testServiceMethod() {
        MyRepository mockRepository = Mockito.mock(MyRepository.class);
        Mockito.when(mockRepository.findById(1L)).thenReturn(new MyEntity(1L, "Test"));

        MyService service = new MyService(mockRepository);
        String result = service.getServiceMethod(1L);

        assertEquals("Test", result);
    }
}
