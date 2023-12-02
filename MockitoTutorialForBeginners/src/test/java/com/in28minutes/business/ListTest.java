package com.in28minutes.business;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class ListTest {

    @Test
    public void letsMockListSize() {
        //given
        List list = mock(List.class);
        when(list.size()).thenReturn(10);

        //when

        //then
        assertEquals(10, list.size());
    }

//    private void assertEquals(int i, int size) {
//    }

    @Test
    public void letsMockListSizeWithMultipleReturnValues() {
        //given
        List list = mock(List.class);
        when(list.size()).thenReturn(10).thenReturn(20);

        //when actual method call

        //then
        assertEquals(10, list.size()); // First Call
        assertEquals(20, list.size()); // Second Call
    }

    @Test
    public void letsMockListGet() {
        //given
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("in28Minutes");

        //when actual method call

        //then
        assertEquals("in28Minutes", list.get(0));
        assertEquals(null, list.get(1));
        assertNull(list.get(1));
    }

    @Test
    public void letsMockListGetWithAny() {
        //given
        List<String> list = mock(List.class);
        when(list.get(Mockito.anyInt())).thenReturn("in28Minutes");
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.

        //when actual method call

        //then
        assertEquals("in28Minutes", list.get(0));
        assertEquals(null, list.get(1));
        assertNull(list.get(1));
        assertEquals("in28Minutes", list.get(0));
        assertEquals("in28Minutes", list.get(1));
    }




    @Test
    public void letsMockListGetWithAnyAndGetRuntimeException2() {
        List<String> list = null;

        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        // Call the method and verify the exception

        try {
            //given
            list = mock(List.class);
            when(list.get(Mockito.anyInt())).thenThrow(new RuntimeException("cc"));
        } catch (RuntimeException e) {
            //when actual method call
            //then
            assertEquals("in28Minutes", list.get(0));
            assertEquals("in28Minutes", list.get(1));
            assertEquals(null, list.get(1));
            assertNull(list.get(1));
        }
    }

    @Test
    public void letsMockListGetWithAnyAndGetRuntimeExceptionSecontParameterInGetMethod() {
        List<String> list = mock(List.class);
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        // Call the method and verify the exception
        try {
            when(list.subList(Mockito.anyInt(), 7)).thenThrow(new RuntimeException("cc"));
        } catch (RuntimeException e) {
            assertEquals(null, list.get(0));
            assertEquals(null, list.get(1));
            assertNull(list.get(0));
            assertNull(list.get(1));
        }
    }

    @Test
    public void bddAliases_UsingGivenWillReturn() {
        List<String> list = mock(List.class);

        //given
        given(list.get(Mockito.anyInt())).willReturn("in28Minutes");

        //when
        String firstElement = list.get(0);

        //then
        assertThat(firstElement, is("in28Minutes"));
    }

}
