package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockitoTest {
    List<String> allTodos = Arrays.asList("Learn Spring MVC",
            "Learn Spring", "Learn to Dance");
    @Test
    public void usingMockito() {
        //given
        TodoService todoService = mock(TodoService.class);
        when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);

        //when
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");


        //then
        assertEquals(2, todos.size());
    }
}





























