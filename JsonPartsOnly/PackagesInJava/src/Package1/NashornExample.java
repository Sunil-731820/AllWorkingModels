package Package1;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {
	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		 ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
	        // Reading Nashorn file  
	        ee.eval(new FileReader("hello.js"));  
	}

}
