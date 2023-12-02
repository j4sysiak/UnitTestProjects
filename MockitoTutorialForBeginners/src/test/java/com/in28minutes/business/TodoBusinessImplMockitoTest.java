package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class TodoBusinessImplMockitoTest {

    @Test
    public void usingMockito_UsingBDD() {
        TodoService todoService = mock(TodoService.class);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        //given
        given(todoService.retrieveTodos("Ranga")).willReturn(allTodos);

        //when  - (action)  testujemy metodę retrieveTodosRelatedToSpring() w klasie TodoBusinessImpl
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Ranga");

        //then
        assertThat(todos.size(), is(2));
    }

    @Test
    public void letsTestDeleteNow() {

        TodoService todoService = mock(TodoService.class);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        //given
        when(todoService.retrieveTodos("Ranga")).thenReturn(allTodos);

        //when  - (action)  testujemy metodę deleteTodosNotRelatedToSpring() w klasie TodoBusinessImpl
        todoBusinessImpl.deleteTodosNotRelatedToSpring("Ranga");

        //then
        verify(todoService).deleteTodo("Learn to Dance");
        verify(todoService, Mockito.never()).deleteTodo("Learn Spring MVC");
        verify(todoService, Mockito.never()).deleteTodo("Learn Spring");
        verify(todoService, Mockito.times(1)).deleteTodo("Learn to Dance");
        // atLeastOnce, atLeast
    }
}





























