package Fundamentos.solved;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Ex028 extends JFrame {
    ////Desafio: Faça um programa em Java que abra e reproduza o áudio de um arquivo MP3.

    JButton tocar = new JButton("Chrono Trigger - Main Theme");

    public Ex028() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        add(tocar);
        tocar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play("Chrono Trigger - Main Theme");
            }
        });
    }

    public void play(String nomeDoAudio) {
        URL url = Ex028.class.getResource(nomeDoAudio + ".mp3");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }

    public static void main(String[] args) {
        new Ex028();
    }
}
