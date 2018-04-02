package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws FileReaderException {

        ClassLoader classLoader = getClass().getClassLoader();  //ClasLoader jest to klasa pozwalająca wyszukać pliki wewnątrz aplikacji
        File file = new File(classLoader.getResource("file/names.txt").getFile());    //metoda pokazująca aplikacji, gdzie znaleźć plik
                                                                                            //zawsze szuka w katalogu resources
        System.out.println(file.getPath()); //metoda zwracjąca ścieżkę do pliku

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){   // "Spróbuj zrobić to co jest w bloku"
                                                              // Klasa 'Files' pozwala na czytanie z pliku tekstowego, a dokładnie metoda lines(), którą zawiera
                                                              //   przekłada linie pliku tekstowego na obiekty typu string
                                                              // Modyfikacje ścieżki do pliku z typu String na obiekt Path
            fileLines.forEach(System.out::println);

        } catch (IOException e) {   //jakiego wyjątku ma się spodziewać program, program nie działa dalej tylko przechodzi do uruchomienia zawartości bloku
                                    // w metodzie catch

            throw new FileReaderException();

        } finally {     //wyświetla się zawsze, niezależnie czy wystąpi wyjątek czy nie

            System.out.println("I'm gonna be here always");

        }
    }
}
