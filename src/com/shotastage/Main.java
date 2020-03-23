/*
* Main.java
*
 */

package com.shotastage;



import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main {


    public void DebugLog(String msg) {
        System.out.println(msg);
    }

    public static void main(String argv[]) {
        JFrame window = new JFrame("Hello, world!");
        JTextArea text = new JTextArea(10, 30);
        JButton button = new JButton("PUSH ME!");
        window.add(text, BorderLayout.CENTER);
        window.add(button, BorderLayout.SOUTH);
        window.pack();
        window.setVisible(true);
        Debug.Log("System.out,printlnってやかましいなぁ！C#みたいにDebug.LogでいけるClassを作らないとJavaなんか使ってられない。");
        AskName.yourName("SHOTA");
    }
}
