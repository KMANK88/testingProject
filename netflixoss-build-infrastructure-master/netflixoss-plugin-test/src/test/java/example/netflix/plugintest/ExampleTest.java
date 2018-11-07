/**
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.netflix.plugintest;

import org.junit.*;
import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void canaryTest() {
        Example example = new Example();
        assertEquals("Hi test", example.sayHi("test"));
    }

    
    @Test
    public void hiTestNumbers() {
        Example example = new Example();
        assertEquals("Hi 123", example.sayHi("123"));
    }
    
    @Test
    public void hiTestNumberswithLetters() {
        Example example = new Example();
        assertEquals("Hi 123ME", example.sayHi("123ME"));
    }
    
    @Test
    public void hiTestEmpty() {
        Example example = new Example();
        assertEquals("Hi ", example.sayHi(""));
    }
    
    
    /*
    @Test
    public void hiTestEmpty() {
        Example example = new Example();
        assertEquals("Hi bob", example.sayHi("Bob"));
    }
    
    */
    
    
    
    @Test
    public void messageTest() {
    	Example example = new Example();
    	assertEquals("Hello Sam", example.message("Sam"));
    }
    //This test will fail.
   /* @Test
    public void capitalizationTest() {
    	Example example = new Example();
    	assertEquals("Hello sam", example.message("Sam"));
    }
   
    @Test
    public void emptyTest() {
    	Example example = new Example();
    	assertEquals("Hello", example.message(""));
    }
     */
    
    
    @Test
    public void StringNumbersTest() {
    	Example example = new Example();
    	assertEquals("Hello Jason123", example.message("Jason123"));
    }
  
    /*
    @Test
    public void StringNumbersTest() {
    	Example example = new Example();
    	assertEquals("Hello 1me", example.message("1me"));
    }
    
    */
    
    
}
