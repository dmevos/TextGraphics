package ru.osipov.graphics;

import ru.osipov.graphics.image.TextGraphicsConverter;
import ru.osipov.graphics.image.myTextGraphicsConverter;
import ru.osipov.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new myTextGraphicsConverter();; // Создайте тут объект вашего класса конвертера
//        converter.setMaxHeight(10);
        converter.setMaxWidth(25);
//        converter.setMaxRatio(1.2);
        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Или то же, но с выводом на экран:
//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//        String url = "https://i.ibb.co/6DYM05G/edu0.jpg";
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}
