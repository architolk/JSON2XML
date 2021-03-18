/*
* Dx2xfm: reading DX7 sysex file and convert them to XFM2 parameter values (in JSON format)
*
* Based on:
* - https://github.com/xerhard/DX7syx-to-XFM2patches
*   (Java version, modified and fixed conversion errors)
* - https://github.com/rheslip/dx72xfm2
*   (C version, with better conversion - the java version has been modified with the optimalizations from the C version)
*
* Author: https://github.com/architolk
*/
package nl.architolk.json2xml;

import java.io.*;
import java.nio.file.*;
import org.json.XML;
import org.json.JSONObject;

public class JSON2XML {

  public static void main(String[] args) throws IOException {
    String input = args[0];
    String json = new String(Files.readAllBytes(Paths.get(input)));
    JSONObject jsonObj = new JSONObject(json);
    String xml = XML.toString(jsonObj);
    System.out.print("<root>");
    System.out.print(xml);
    System.out.print("</root>");
  }

}
