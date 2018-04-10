package Note;

import java.util.*;
import java.io.*;
 
class Notepad {
  public static void main(String[] args) throws Exception {
	   
        ProcessBuilder p= new ProcessBuilder("notepad","testout.txt");
        p.start();

    }   
  }
