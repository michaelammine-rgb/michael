package com.student.studyexpensetracker.service;
import com.student.studyexpensetracker.model.StudySession;
import com.student.studyexpensetracker.util.StudyStorage;
import java.util.ArrayList;
public class StudyService {
    private ArrayList<StudySession>sessions;
    
    public StudyService(){
        sessions=new ArrayList<>();
        sessions.addAll(StudyStorage.loadSessions());
  }
    public void addSession(StudySession session){
        sessions.add(session);
        StudyStorage.saveSessions(sessions);
        System.out.println("Study session added successfully!");
        
    }
    public void displaySessions(){
        if(sessions.isEmpty()){
            System.out.println("No study sessions recorded");
            return ;
        }
        for(StudySession session: sessions){
            System.out.println("------------------------");
            System.out.println("Subject: " + session.getSubject());
           System.out.println("Topic" + session.getTopic());
           System.out.println("Hours" + session.getHours());
           System.out.println("Date" + session.getDate());
           System.out.println("-----------");
            
        }
    }
    public void deleteSession(int index){
        if(index<0 || index>=sessions.size()){
            System.out.println("Invalid study session nmber.");
            return;
        }
        sessions.remove(index);
        StudyStorage.saveSessions(sessions);
        System.out.println("Study session deleted successfully!");
    }
    public double getTotalStudyHours(){
        double total=0;
        for(StudySession session : sessions){
            total += session.getHours();
        }
        return total;
    }
    public void searchSession(String subject){
        boolean found=false;
        for(StudySession session : sessions){
            if(session.getSubject().contains(subject.toLowerCase())){
                System.out.println("Subject: "+ session.getSubject());
                System.out.println("Topic: " + session.getTopic());
                System.out.println("Hours: " + session.getHours());
                System.out.println("Date: " + session.getDate());
                        found =true;
            }
        }
        if(!found){
            System.out.println("No matching study sessions found.");
        }
    }
}
