
package com.student.studyexpensetracker.util;
import com.student.studyexpensetracker.model.StudySession;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
public class StudyStorage {
   private static final String FILE_NAME = "study_sessions.csv";

    public static void saveSessions (List<StudySession> sessions) {

        try (PrintWriter writer = new PrintWriter(
                new FileWriter(FILE_NAME))) {

            writer.println("Subject,Topic,Hours,Date");
    for(StudySession session: sessions){
        writer.println(
                    session.getSubject() + "," +
                    session.getTopic() + "," +
                    session.getHours() + "," +
                    session.getDate()
                );
                           }
    System.out.println("Study sessions saved successfully!");
        }catch(IOException e){
           System.out.println("Error saving study session: "+ e.getMessage());
        }
    }
    public static List<StudySession> loadSessions() {

    List<StudySession> sessions = new ArrayList<>();

    try (BufferedReader reader =
            new BufferedReader(new FileReader(FILE_NAME))) {

        String line;
        reader.readLine();

        while ((line = reader.readLine()) != null) {

            String[] parts = line.split(",");

            if (parts.length == 4) {

                String subject = parts[0];
                String topic = parts[1];
                double hours = Double.parseDouble(parts[2]);
                LocalDate date = LocalDate.parse(parts[3]);

                StudySession session =
                    new StudySession(subject, topic, hours, date);

                sessions.add(session);
            }
        }

    } catch (IOException e) {
        System.out.println("No previous study records found.");
    }

    return sessions;
}}
